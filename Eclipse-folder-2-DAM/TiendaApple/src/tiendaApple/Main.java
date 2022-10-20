package tiendaApple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
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
    static ArrayList <Integer> ALPedido = new ArrayList <Integer>();
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
            Accesorio accesorio = ALAccesorio.get(contador);
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
            AirPods airpods = ALAirPods.get(contador);
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
            IWatch iwatch = ALIWatch.get(contador);
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
            Iphone iphone = ALIphone.get(contador);
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
        bwEscritura.write("----------------- IWatch -----------------");
        bwEscritura.newLine();
        contador = 0;
        while (ALIWatch.size() > contador) {
            IWatch iwatch = ALIWatch.get(contador);
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
            contador++;
        }
        bwEscritura.newLine();

        // Mac

        // ----------------- Mac -----------------
        // Tipo de producto
        // -----------------
        // Id: Id
        // Nombre: Nombre
        // Precio: Precio
        // Stock: Stock
        // Procesador: Procesador
        // Ram: Ram
        // Almacenamiento: Almacenamiento
        // Accesorios: Accesorios
        // -----------------

        bwEscritura.write("----------------- Mac -----------------");
        bwEscritura.newLine();
        contador = 0;
        while (ALMac.size() > contador) {
            Mac mac = ALMac.get(contador);
            bwEscritura.write("Id: " + mac.getId());
            bwEscritura.newLine();
            bwEscritura.write("Nombre: " + mac.getNombre());
            bwEscritura.newLine();
            bwEscritura.write("Precio: " + mac.getPrecio());
            bwEscritura.newLine();
            bwEscritura.write("Stock: " + mac.getStock());
            bwEscritura.newLine();
            bwEscritura.write("Procesador: " + mac.getProcesador());
            bwEscritura.newLine();
            bwEscritura.write("Ram: " + mac.getRam());
            bwEscritura.newLine();
            bwEscritura.write("Almacenamiento: " + mac.getAlmacenamiento());
            bwEscritura.newLine();
            bwEscritura.write("Accesorios: ");
            bwEscritura.newLine();         
            for (int i = 0; i < mac.getAccesorios().size(); i++) {
                int id = mac.getAccesorios().get(i);
                bwEscritura.write("- " + id + " - " + buscarNombre(id) + "\r\n");
            }
            bwEscritura.write("-----------------\r\n");
            contador++;
        }     

        // Cerrar el archivo
        bwEscritura.close();

        // // Preguntamos al usuario que productos quiere añadir al pedido 
        // // y añadimos su id a un arraylist y mostramos una pregunta de 
        // // confirmacion indicando el nombre del producto
        // System.out.println("¿Qué productos quiere añadir al pedido? (Introduzca el id del producto)");
        // System.out.println("Para finalizar introduzca 0");
        // System.out.println("Tras finalizar se imprimirá el pedido en un archivo de texto llamado Pedido.txt");

        // // Creamos el Scanner para leer la entrada del usuario
        // Scanner scIdPedido1 = new Scanner(System.in);
        // // Creamos el while para que el usuario pueda introducir varios productos
        // int id = 1;
        
        // while (id != 0) {
        //     id = scIdPedido1.nextInt();
        //     if (id != 0) {
        //         ALPedido.add(id);
        //         System.out.println("¿Quiere añadir otro producto? (Introduzca el id del producto)");
        //         System.out.println("Para finalizar introduzca 0");
        //     }
            
        // }
        // scIdPedido1.close();
        
        ALPedido.add(101);
        ALPedido.add(202);
        ALPedido.add(303);
        ALPedido.add(403);        

        // Creamos el archivo de texto para guardar el pedido
        File archivoPedido = new File(ruta + "\\Pedido.txt");
        archivoPedido.createNewFile();
        BufferedWriter bwPedido = new BufferedWriter(new FileWriter(archivoPedido));
        
        // Utilizamos el siguien formato para guardar el pedido
        // ----------------- Pedido -----------------
        // ----- Productos -----
        // - Id - Nombre
        // - Precio
        // -----------------
        // Siguiente producto
        // ----- Total -----
        // - Precio total
        // -----------------
        // Sugerencias de accesorios
        // - Id - Nombre - Precio
        // - Id - Nombre - Precio
        // -----------------

        // Escribimos el encabezado del pedido
        bwPedido.write("----------------- Pedido -----------------");
        bwPedido.newLine();
        bwPedido.write("----- Productos -----");
        bwPedido.newLine();
        
        // Escribimos los productos del pedido buscando sus datos por la id
        // guardada en el arraylist ALPedido

        // Guardamos el precio total del pedido
        double precioTotal = 0;

        contador = 0;
        while (ALPedido.size() > contador) {
            // Buscamos el producto por su id
            int idProducto = ALPedido.get(contador);
            // Sabiendo el tipo de producto buscamos el producto en su arraylist
            // y guardamos los datos que necesitamos en un ArrayList de String
            // usando el metodo buscarDatosPedido
            ArrayList<String> datosProducto = buscarDatosPedido(idProducto);
            // Escribimos los datos del producto en el archivo de texto
            bwPedido.write("- " + idProducto + " - " + datosProducto.get(0));
            // Guardamos el precio del producto en una variable
            precioTotal += Double.parseDouble(datosProducto.get(1));
            bwPedido.newLine();
            bwPedido.write("- " + datosProducto.get(1) + "€");
            bwPedido.newLine();
            bwPedido.write("-----------------");
            bwPedido.newLine();
            contador++;
            
        }

        // Escribimos el total del pedido
        bwPedido.write("----- Precio Total -----");
        bwPedido.newLine();
        bwPedido.write("- " + precioTotal + "€");
        bwPedido.newLine();
        bwPedido.write("-----------------");
        bwPedido.newLine();

        // Escribimos las sugerencias de accesorios
        bwPedido.write("----- Sugerencias de accesorios -----");
        bwPedido.newLine();
        // Escribimos los accesorios sugeridos en el archivo de texto
        contador = 0;
        // Buscamos los accesorios del ArrayList los cuales
        // son compatibles con los productos del pedido
        Set <Integer> accesoriosSugeridosSet = new HashSet<Integer>();
        while (ALPedido.size() > contador) {
            // Cojemos el id del producto
            int idProducto = ALPedido.get(contador);
            // Buscamos el tipo de producto
            int tipoProducto = buscarTipoProducto(idProducto);
            // Si el producto es un Mac, iPad o Iphone buscamos los accesorios
            // que son compatibles con el producto
            if (tipoProducto == 1 ||tipoProducto == 2 || tipoProducto == 3) {
                // Buscamos que accesorios son compatibles con el Mac
                // usando metodo obtenerAccesoriosMac
                accesoriosSugeridosSet.add(idProducto);
            }
            contador++;
        }

        // Escribimos los accesorios sugeridos en el archivo de texto
        ArrayList<Integer> accesoriosSugeridosArray = new ArrayList<Integer>(accesoriosSugeridosSet);
        contador = 0;
        while (accesoriosSugeridosSet.size() > contador) {
            // Buscamos el accesorio por su id
            int idAccesorio = accesoriosSugeridosArray.get(contador);
            // Sabiendo el tipo de accesorio buscamos el accesorio en su arraylist
            // y guardamos los datos que necesitamos en un ArrayList de String
            // usando el metodo buscarDatosPedido
            ArrayList<String> datosAccesorio = buscarDatosPedido(idAccesorio);
            // Escribimos los datos del accesorio en el archivo de texto
            bwPedido.write("- " + idAccesorio + " - " + datosAccesorio.get(0));
            bwPedido.newLine();
            bwPedido.write("- " + datosAccesorio.get(1) + "€");
            bwPedido.newLine();
            bwPedido.write("-----------------");
            bwPedido.newLine();
            contador++;
        }

        bwPedido.write("-----------------------------------------");

        // Cerramos el BufferedWriter
        bwPedido.close();

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

    private static int buscarTipoProducto(int id) {
        // Buscamos el tipo de producto con el id entre todos los ArrayList
        // y que devuelva 1 si es un accesorio, 2 si es un AirPods, 3 si es un iPad,
        // 4 si es un Iphone, 5 si es un IWatch o 6 si es un Mac
        // y 0 si no se encuentra
        int tipoProducto = 0;
        for (int i = 0; i < ALAccesorio.size(); i++) {
            if (ALAccesorio.get(i).getId() == id) {
                tipoProducto = 1;
            }
        }
        for (int i = 0; i < ALAirPods.size(); i++) {
            if (ALAirPods.get(i).getId() == id) {
                tipoProducto = 2;
            }
        }
        for (int i = 0; i < ALiPad.size(); i++) {
            if (ALiPad.get(i).getId() == id) {
                tipoProducto = 3;
            }
        }
        for (int i = 0; i < ALIphone.size(); i++) {
            if (ALIphone.get(i).getId() == id) {
                tipoProducto = 4;
            }
        }
        for (int i = 0; i < ALIWatch.size(); i++) {
            if (ALIWatch.get(i).getId() == id) {
                tipoProducto = 5;
            }
        }
        for (int i = 0; i < ALMac.size(); i++) {
            if (ALMac.get(i).getId() == id) {
                tipoProducto = 6;
            }
        }
        return tipoProducto;
    }

    private static double buscarPrecio(int id) {
        // Buscamos el precio del producto con el id entre todos los ArrayList
        // y que devuelva 0 si no se encuentra
        double precio = 0;
        for (int i = 0; i < ALAccesorio.size(); i++) {
            if (ALAccesorio.get(i).getId() == id) {
                precio = ALAccesorio.get(i).getPrecio();
            }
        }
        for (int i = 0; i < ALAirPods.size(); i++) {
            if (ALAirPods.get(i).getId() == id) {
                precio = ALAirPods.get(i).getPrecio();
            }
        }
        for (int i = 0; i < ALiPad.size(); i++) {
            if (ALiPad.get(i).getId() == id) {
                precio = ALiPad.get(i).getPrecio();
            }
        }
        for (int i = 0; i < ALIphone.size(); i++) {
            if (ALIphone.get(i).getId() == id) {
                precio = ALIphone.get(i).getPrecio();
            }
        }
        for (int i = 0; i < ALIWatch.size(); i++) {
            if (ALIWatch.get(i).getId() == id) {
                precio = ALIWatch.get(i).getPrecio();
            }
        }
        for (int i = 0; i < ALMac.size(); i++) {
            if (ALMac.get(i).getId() == id) {
                precio = ALMac.get(i).getPrecio();
            }
        }
        return precio;
    }

    private static ArrayList buscarDatosPedido(int id) {
        // Buscamos los datos del producto con el id y el tipo entre todos los ArrayList
        // y que devuelva un ArrayList con los datos del producto
        // y que devuelva null si no se encuentra
        // los datos a optener son el nombre, el precio y el color si tiene
        // Usando los metodos buscarNombre y buscarPrecio
        ArrayList <String> datos= new ArrayList<String>();
        String nombre = buscarNombre(id);
        double precio = buscarPrecio(id);
        datos.add(nombre);
        datos.add(String.valueOf(precio));
        
        return datos;
        
    }

    private static ArrayList buscarAccesoriosSugeridos(ArrayList <Integer> idAccesorios) {
        // Buscamos los accesorios que contienen la lista de idAccesorios
        // y que devuelva un ArrayList con los los nombres y precios de los accesorios
        // y que devuelva null si no se encuentra
        ArrayList <String> datos= new ArrayList<String>();
        for (int i = 0; i < idAccesorios.size(); i++) {
            String nombre = buscarNombre(idAccesorios.get(i));
            double precio = buscarPrecio(idAccesorios.get(i));
            datos.add(nombre);
            datos.add(String.valueOf(precio));
        }
        return datos;
    }

}