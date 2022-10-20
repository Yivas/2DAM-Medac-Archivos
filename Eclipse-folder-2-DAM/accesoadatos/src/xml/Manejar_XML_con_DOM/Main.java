package xml.Manejar_XML_con_DOM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, FileNotFoundException, TransformerException {
        // Crear un archivo pelis.dat donde deberás introducir 4 películas con los siguientes 
        // en la ubicacion
        // C:\Users\Usuario\Documents\Portatil Medac\2DAM-Medac-Archivos\Accesoadatos\XML\Manejar_XML_con_DOM
        // campos: TITULO,AÑO DE RODAJE,DURACIÓN,ACTOR PRINCIPAL.

        // Tomando como base el fichero anterior, crea un documento XML usando DOM.
        File archivo_base = new File("C:\\Users\\Usuario\\Documents\\Portatil Medac\\2DAM-Medac-Archivos\\Accesoadatos\\XML\\Manejar_XML_con_DOM\\pelis.dat");
        
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
        StreamResult result = new StreamResult(new File("C:\\Users\\Usuario\\Documents\\Portatil Medac\\2DAM-Medac-Archivos\\Accesoadatos\\XML\\Manejar_XML_con_DOM\\peliculas.xml"));

        // Volcamos  el documento xml a fichero
        transformer.transform(soPeliculas, result);



    }



}
