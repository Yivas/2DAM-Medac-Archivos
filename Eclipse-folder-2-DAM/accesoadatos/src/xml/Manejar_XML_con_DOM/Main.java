package xml.Manejar_XML_con_DOM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException, SAXException, IOException {
        // Crear un archivo pelis.dat donde deberás introducir 4 películas con los siguientes 
        // en la ubicacion
        // C:\Users\Usuario\Documents\Portatil Medac\2DAM-Medac-Archivos\Accesoadatos\XML\Manejar_XML_con_DOM
        // campos: TITULO,AÑO DE RODAJE,DURACIÓN,ACTOR PRINCIPAL.

        // Tomando como base el fichero anterior, crea un documento XML usando DOM.
        File archivo_base = new File("C:\\Dom\\pelis.dat");
        
        // Creamos el documento XML
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // Creamos el elemento document
        Document doc = (Document) docBuilder.newDocument();
        
        // Creamos el elemento raiz Peliculas
        Element rootElement = doc.createElement("PELICULAS");
        doc.appendChild(rootElement);

        // Creamos el Scanner para leer el fichero
        Scanner lectorFichero = new Scanner(archivo_base);

        // Bucle para leer el fichero y crear los elementos de XML con los datos de películas
        int contador = 0;
        while (lectorFichero.hasNextLine()) {
            contador++;
            String peli = lectorFichero.nextLine();
            StringTokenizer st = new StringTokenizer(peli, ",");
            String titulo = st.nextToken();
            String ano = st.nextToken();
            String duracion = st.nextToken();
            String actor = st.nextToken();

            // Creamos el elemento película
            Element pelicula = doc.createElement("PELICULA");
            rootElement.appendChild(pelicula);

            // Creamos el elemento título
            Element titulo1 = doc.createElement("TITULO");
            titulo1.appendChild(doc.createTextNode(titulo));
            pelicula.appendChild(titulo1);

            // Creamos el elemento Año
            Element ano1 = doc.createElement("AÑO");
            ano1.appendChild(doc.createTextNode(ano));
            pelicula.appendChild(ano1);

            // Creamos el elemento Duracion
            Element duracion1 = doc.createElement("DURACION");
            duracion1.appendChild(doc.createTextNode(duracion));
            pelicula.appendChild(duracion1);

            // Creamos el elemento actor
            Element actor1 = doc.createElement("ACTOR");
            actor1.appendChild(doc.createTextNode(actor));
            pelicula.appendChild(actor1);

            

        }

        // Creamos el documento XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource soPeliculas = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("C:\\Dom\\peliculas.xml"));

        

        // Añado una nueva película al documento “pelis.xml” con DOM
        // Creamos el elemento película
        Element pelicula = doc.createElement("PELICULA");
        rootElement.appendChild(pelicula);
        Element titulo1 = doc.createElement("TITULO");
        titulo1.appendChild(doc.createTextNode("El señor de los anillos"));
        pelicula.appendChild(titulo1);
        Element ano1 = doc.createElement("AÑO");
        ano1.appendChild(doc.createTextNode("2001"));
        pelicula.appendChild(ano1);
        Element duracion1 = doc.createElement("DURACION");
        duracion1.appendChild(doc.createTextNode("180"));
        pelicula.appendChild(duracion1);
        Element actor1 = doc.createElement("ACTOR");
        actor1.appendChild(doc.createTextNode("Elijah Wood"));
        pelicula.appendChild(actor1);

        // Volcamos  el documento xml a fichero
        transformer.transform(soPeliculas, result);

        // Muestra la/s películas que duran más de 120 minutos con DOM.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("C:\\Dom\\peliculas.xml"));

        System.out.println(recorrerDOMyMostrar(document));


    }

    public static String recorrerDOMyMostrar(Document doc){
        // Muestra la/s películas que duran más de 120 minutos con DOM

        String datos_nodo[] = null;
        String salida = "";
        Node node;
    
        // Obtiene el primer nodo del DOM (primer hijo)
        Node raiz = ((Node) doc).getFirstChild();
    
        // Obtiene una lsita de nodos con todos los nodos hijo del raíz
        NodeList nodeList = raiz.getChildNodes();
        
        // Procesa los nodos hijo
        for (int i = 0; i < nodeList.getLength(); i++){
            node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                // Es un nodo Pelicula
                datos_nodo = procesarPelicula(node);
                // Comprueba si el nodo 2 es mayor a 120
                if (Integer.parseInt(datos_nodo[2]) > 120) {
                    salida = salida + "\n " + "Titulo es: " + datos_nodo[0];
                    salida = salida + "\n " + "Año es: " + datos_nodo[1];
                    salida = salida + "\n " + "Duracion es: " + datos_nodo[2];
                    salida = salida + "\n " + "Actor es: " + datos_nodo[3];
                }
                
            }
        }
        return salida;
        
        
        
    }

    
    
    protected static String[] procesarPelicula(Node n){

        String datos[] = new String[4];
        Node ntemp = null;
        int contador = 0;
        
        // Obtiene los hijos de la Pelicula
        NodeList nodos = n.getChildNodes();
        for (int i = 0; i <nodos.getLength(); i++){
            ntemp = nodos.item(i);
            if(ntemp.getNodeType() == Node.ELEMENT_NODE){
                // Obtenemos todos los nodos hijo de Pelicula
                datos[contador] = ntemp.getFirstChild().getTextContent();
                contador++;
            }
        }
        return datos;
    }



}
