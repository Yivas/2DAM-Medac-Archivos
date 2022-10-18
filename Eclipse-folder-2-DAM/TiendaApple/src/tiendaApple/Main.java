package tiendaApple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import productosApple.Accesorio;
import productosApple.AirPods;
import productosApple.IWatch;
import productosApple.Iphone;
import productosApple.Mac;
import productosApple.iPad;

public class Main {
    
    static ArrayList <Accesorio> ALAccesorio = new ArrayList <Accesorio>();
    static ArrayList <AirPods> ALAirPods = new ArrayList <AirPods>();
    static ArrayList <IWatch> ALIWatch = new ArrayList <IWatch>();
    static ArrayList <Iphone> ALIphone = new ArrayList <Iphone>();
    static ArrayList <Mac> ALMac = new ArrayList <Mac>();
    static ArrayList <iPad> ALiPad = new ArrayList <iPad>();
    public static void main(String[] args) throws IOException {

        // Se crean 6 ArrayList para guardar los productos de cada tipo
        
        
        // Los datos se cargarán desde 6 archivos .txt, uno por tipo de producto

        // Se pregunta al usuario la carpeta en la que se encuentra los archivos
        // con los nombre de [tipo].txt
        System.out.println("Introduce la ruta de la carpeta donde se encuentran los archivos .txt");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        sc.close();        
        
        // Se guardan la ubicaciones de los archivos en un File por archivo
        File Accesorio = new File(ruta + "\\Accesorio.txt");
        File AirPods = new File(ruta + "\\AirPods.txt");
        File IWatch = new File(ruta + "\\IWatch.txt");
        File Iphone = new File(ruta + "\\Iphone.txt");
        File Mac = new File(ruta + "\\Mac.txt");
        File iPad = new File(ruta + "\\iPad.txt");

        // Se crea un Scanner para separar los datos de cada producto
        Scanner scAccesorio = new Scanner(new FileReader(Accesorio));
        Scanner scAirPods = new Scanner(new FileReader(AirPods));
        Scanner scIWatch = new Scanner(new FileReader(IWatch));
        Scanner scIphone = new Scanner(new FileReader(Iphone));
        Scanner scMac = new Scanner(new FileReader(Mac));
        Scanner sciPad = new Scanner(new FileReader(iPad));

        // Se crea un while para leer los archivos con el Scanner y crear los productos
        // y se guardan en el Arraylist correspondiente
        // El formateo de los ficheros es el siguiente:
        // # comentarios
        // id-otro dato
        // compatibilidad: id1,id2,id3
        
        // Accesorio
        // id-nombre-precio-stock-compatibilidad
        while (scAccesorio.hasNextLine()) {
            String linea = scAccesorio.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                ArrayList <Integer> compatibilidad = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    compatibilidad.add(Integer.parseInt(st2.nextToken()));
                }
                Accesorio accesorio = new Accesorio(id, nombre, precio, stock, compatibilidad);
                ALAccesorio.add(accesorio);
            }
        }

        scAccesorio.close();

        // AirPods
        // id-nombre-precio-stock-color-compatibilidad

        while (scAirPods.hasNextLine()) {
            String linea = scAirPods.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String color = st.nextToken();
                ArrayList <Integer> compatibilidad = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    compatibilidad.add(Integer.parseInt(st2.nextToken()));
                }
                AirPods airpods = new AirPods(id, nombre, precio, stock, color, compatibilidad);
                ALAirPods.add(airpods);
            }
        }

        scAirPods.close();

        // IWatch
        // id-nombre-precio-stock-color-compatibilidad

        while (scIWatch.hasNextLine()) {
            String linea = scIWatch.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String color = st.nextToken();
                ArrayList <Integer> compatibilidad = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    compatibilidad.add(Integer.parseInt(st2.nextToken()));
                }
                IWatch iwatch = new IWatch(id, nombre, precio, stock, color, compatibilidad);
                ALIWatch.add(iwatch);
            }
        }

        scIWatch.close();

        // Iphone
        // id-nombre-precio-stock-procesador-ram-almacenamiento-color-accesorios

        while (scIphone.hasNextLine()) {
            String linea = scIphone.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String procesador = st.nextToken();
                int ram = Integer.parseInt(st.nextToken());
                int almacenamiento = Integer.parseInt(st.nextToken());
                String color = st.nextToken();
                ArrayList <Integer> accesorios = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    accesorios.add(Integer.parseInt(st2.nextToken()));
                }
                Iphone iphone = new Iphone(id, nombre, precio, stock, procesador, ram, almacenamiento, color, accesorios);
                ALIphone.add(iphone);
            }
        }

        scIphone.close();


        // Mac
        // id-nombre-precio-stock-procesador-ram-almacenamiento-accesorios

        while (scMac.hasNextLine()) {
            String linea = scMac.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String procesador = st.nextToken();
                int ram = Integer.parseInt(st.nextToken());
                int almacenamiento = Integer.parseInt(st.nextToken());
                ArrayList <Integer> accesorios = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    accesorios.add(Integer.parseInt(st2.nextToken()));
                }
                Mac mac = new Mac(id, nombre, precio, stock, procesador, ram, almacenamiento, procesador, accesorios);
                ALMac.add(mac);
            }
        }

        scMac.close();

        // Ipad
        // id-nombre-precio-stock-procesador-ram-almacenamiento-color-accesorios

        while (sciPad.hasNextLine()) {
            String linea = sciPad.nextLine();
            if (linea.charAt(0) != '#') {
                StringTokenizer st = new StringTokenizer(linea, "-");
                int id = Integer.parseInt(st.nextToken());
                String nombre = st.nextToken();
                double precio = Double.parseDouble(st.nextToken());
                int stock = Integer.parseInt(st.nextToken());
                String procesador = st.nextToken();
                int ram = Integer.parseInt(st.nextToken());
                int almacenamiento = Integer.parseInt(st.nextToken());
                String color = st.nextToken();
                ArrayList <Integer> accesorios = new ArrayList <Integer>();
                StringTokenizer st2 = new StringTokenizer(st.nextToken(), ",");
                while (st2.hasMoreTokens()) {
                    accesorios.add(Integer.parseInt(st2.nextToken()));
                }
                iPad ipad = new iPad(id, nombre, precio, stock, procesador, ram, almacenamiento, color, accesorios);
                ALiPad.add(ipad);
            }
        }

        sciPad.close();
        
        // Imprimir todos los productos en un archivo que se crea en la ruta
        // llamado "Inventario.txt"
        File archivoInv = new File(ruta + "\\Inventario.txt");
        archivoInv.createNewFile();
        
        // Escribimos en el archivo todos los productos y sus atributos
        // usando BufferedWriter


        // Accesorio

        // ----------------- Accesorios -----------------
        // Tipo de producto
        // -----------------
        // Id: Id
        // Nombre: Nombre
        // Precio: Precio
        // Stock: Stock
        // Compatible con: 
        // - Id - Nombre
        // -----------------

        int contador = 0;
        BufferedWriter bwEscritura = new BufferedWriter(new FileWriter(archivoInv));
        bwEscritura.write("----------------- Accesorios -----------------");
        bwEscritura.newLine();
        while (ALAccesorio.size() > contador) {
            Accesorio accesorio = ALAccesorio.get(0);
            bwEscritura.write("Id: " + accesorio.getId());
            bwEscritura.newLine();
            bwEscritura.write("Nombre: " + accesorio.getNombre());
            bwEscritura.newLine();
            bwEscritura.write("Precio: " + accesorio.getPrecio());
            bwEscritura.newLine();
            bwEscritura.write("Stock: " + accesorio.getStock());
            bwEscritura.newLine();
            bwEscritura.write("Compatible con: ");
            bwEscritura.newLine();         
            for (int i = 0; i < accesorio.getCompatibilidad().size(); i++) {
                int id = accesorio.getCompatibilidad().get(i);
                bwEscritura.write("- " + id + " - " + buscarNombre(id) + "\r\n");
            }
            bwEscritura.write("-----------------\r\n");
            contador++;         
        }
        bwEscritura.newLine();
        
        // AirPods

        // ----------------- AirPods -----------------
        // Tipo de producto
        // -----------------
        // Id: Id
        // Nombre: Nombre
        // Precio: Precio
        // Stock: Stock
        // Color: Color
        // Compatible con: 
        // - Id - Nombre
        // -----------------

        contador = 0;
        bwEscritura.write("----------------- AirPods -----------------");
        bwEscritura.newLine();
        while (ALAirPods.size() > contador) {
            AirPods airpods = ALAirPods.get(0);
            bwEscritura.write("Id: " + airpods.getId());
            bwEscritura.newLine();
            bwEscritura.write("Nombre: " + airpods.getNombre());
            bwEscritura.newLine();
            bwEscritura.write("Precio: " + airpods.getPrecio());
            bwEscritura.newLine();
            bwEscritura.write("Stock: " + airpods.getStock());
            bwEscritura.newLine();
            bwEscritura.write("Color: " + airpods.getColor());
            bwEscritura.newLine();
            bwEscritura.write("Compatible con: ");
            bwEscritura.newLine();         
            for (int i = 0; i < airpods.getCompatibilidad().size(); i++) {
                int id = airpods.getCompatibilidad().get(i);
                bwEscritura.write("- " + id + " - " + buscarNombre(id) + "\r\n");
            }
            bwEscritura.write("-----------------\r\n");
            contador++;          
        }
        bwEscritura.newLine();
        
        // IWatch

        // ----------------- IWatch -----------------
        // Tipo de producto
        // -----------------
        // Id: Id
        // Nombre: Nombre
        // Precio: Precio
        // Stock: Stock
        // Color: Color
        // Compatible con:
        // - Id - Nombre
        // -----------------

        contador = 0;
        bwEscritura.write("----------------- IWatch -----------------");
        bwEscritura.newLine();
        while (ALIWatch.size() > contador) {
            IWatch iwatch = ALIWatch.get(0);
            bwEscritura.write("Id: " + iwatch.getId());
            bwEscritura.newLine();
            bwEscritura.write("Nombre: " + iwatch.getNombre());
            bwEscritura.newLine();
            bwEscritura.write("Precio: " + iwatch.getPrecio());
            bwEscritura.newLine();
            bwEscritura.write("Stock: " + iwatch.getStock());
            bwEscritura.newLine();
            bwEscritura.write("Color: " + iwatch.getColor());
            bwEscritura.newLine();
            bwEscritura.write("Compatible con: ");
            bwEscritura.newLine();         
            for (int i = 0; i < iwatch.getCompatibilidad().size(); i++) {
                int id = iwatch.getCompatibilidad().get(i);
                bwEscritura.write("- " + id + " - " + buscarNombre(id) + "\r\n");
            }
            bwEscritura.write("-----------------\r\n");
            ALIWatch.remove(0);
            contador++;          
        }
        bwEscritura.newLine();

        // Iphone

        // ----------------- Iphone -----------------
        // Tipo de producto
        // -----------------
        // Id: Id
        // Nombre: Nombre
        // Precio: Precio
        // Stock: Stock
        // Procesador: Procesador
        // Ram: Ram
        // Almacenamiento: Almacenamiento
        // Color: Color
        // Accesorios:
        // - Id - Nombre
        // -----------------

        bwEscritura.write("----------------- Iphone -----------------");
        bwEscritura.newLine();
        contador = 0;
        while (ALIphone.size() > contador) {
            Iphone iphone = ALIphone.get(0);
            bwEscritura.write("Id: " + iphone.getId());
            bwEscritura.newLine();
            bwEscritura.write("Nombre: " + iphone.getNombre());
            bwEscritura.newLine();
            bwEscritura.write("Precio: " + iphone.getPrecio());
            bwEscritura.newLine();
            bwEscritura.write("Stock: " + iphone.getStock());
            bwEscritura.newLine();
            bwEscritura.write("Procesador: " + iphone.getProcesador());
            bwEscritura.newLine();
            bwEscritura.write("Ram: " + iphone.getRam());
            bwEscritura.newLine();
            bwEscritura.write("Almacenamiento: " + iphone.getAlmacenamiento());
            bwEscritura.newLine();
            bwEscritura.write("Color: " + iphone.getColor());
            bwEscritura.newLine();
            bwEscritura.write("Accesorios: ");
            bwEscritura.newLine();         
            for (int i = 0; i < iphone.getAccesorios().size(); i++) {
                int id = iphone.getAccesorios().get(i);
                bwEscritura.write("- " + id + " - " + buscarNombre(id) + "\r\n");
            }
            bwEscritura.write("-----------------\r\n");
            contador++;
        }
        bwEscritura.newLine();

        // Mac


        
        

        bwEscritura.close();
        

    }

    private static String buscarNombre(int id) {
        // Buscamos el nombre del producto con el id entre todos los ArrayList
        // y que devuelva DUPLICADO si hay dos productos o mas con el mismo id
        String nombre = "NO ENCONTRADO";
        int contador = 0;
        for (int i = 0; i < ALAccesorio.size(); i++) {
            if (ALAccesorio.get(i).getId() == id) {
                nombre = ALAccesorio.get(i).getNombre();
                contador++;
            }
        }
        for (int i = 0; i < ALAirPods.size(); i++) {
            if (ALAirPods.get(i).getId() == id) {
                nombre = ALAirPods.get(i).getNombre();
                contador++;
            }
        }
        for (int i = 0; i < ALIWatch.size(); i++) {
            if (ALIWatch.get(i).getId() == id) {
                nombre = ALIWatch.get(i).getNombre();
                contador++;
            }
        }
        for (int i = 0; i < ALIphone.size(); i++) {
            if (ALIphone.get(i).getId() == id) {
                nombre = ALIphone.get(i).getNombre();
                contador++;
            }
        }
        for (int i = 0; i < ALMac.size(); i++) {
            if (ALMac.get(i).getId() == id) {
                nombre = ALMac.get(i).getNombre();
                contador++;
            }
        }
        for (int i = 0; i < ALiPad.size(); i++) {
            if (ALiPad.get(i).getId() == id) {
                nombre = ALiPad.get(i).getNombre();
                contador++;
            }
        }
        if (contador > 1) {
            nombre = "DUPLICADO";
        }
        return nombre;
    }



}
