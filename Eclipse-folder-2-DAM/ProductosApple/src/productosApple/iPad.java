package productosApple;

import java.util.ArrayList;

public class iPad {

    // Producto iPad
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String color;
    private ArrayList <Integer> accesorios = new ArrayList <Integer>();

    // Constructores
    public iPad() {
        super();
    }

    public iPad(int id, String nombre, double precio, int stock, String procesador, int ram, int almacenamiento, String color,ArrayList<Integer> accesorios) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.accesorios = accesorios;
    }
    
    
    // Get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Integer> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<Integer> accesorios) {
        this.accesorios = accesorios;
    }
    

    // Metodos

    // Imprimir datos
    @Override
    public String toString() {
        return "iPad [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", procesador="
                + procesador + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", color=" + color
                + ", accesorios=" + accesorios + "]";
    }





}
