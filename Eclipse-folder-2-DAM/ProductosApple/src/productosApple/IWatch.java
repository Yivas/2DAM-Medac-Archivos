package productosApple;

import java.util.ArrayList;

public class IWatch {
    
    
    // Producto IWatch
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private String color;
    private ArrayList <Integer> compatibilidad = new ArrayList <Integer>();

    // Constructores
    public IWatch() {
        super();
    }

    public IWatch(int id, String nombre, double precio, int stock, String color, ArrayList<Integer> compatibilidad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.color = color;
        this.compatibilidad = compatibilidad;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Integer> getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(ArrayList<Integer> compatibilidad) {
        this.compatibilidad = compatibilidad;
    }
    
    // Metodos

    // Comprobar compatibilidad con la id de un producto
    public boolean comprobarCompatibilidad(int id) {
        boolean compatible = false;
        for (int i = 0; i < compatibilidad.size(); i++) {
            if (compatibilidad.get(i).equals(id)) {
                compatible = true;
            }
        }
        return compatible;
    }
    
    // Imprimir datos
    @Override
    public String toString() {
        return "IWatch [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", color=" + color
                + ", compatibilidad=" + compatibilidad + "]";
    }

   

}
