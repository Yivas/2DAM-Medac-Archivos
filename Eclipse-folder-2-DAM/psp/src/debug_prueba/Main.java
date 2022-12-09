package debug_prueba;

public class Main {

    public static void main(String[] args) {
        
        Persona uno = new Persona();
        Persona dos = new Persona();
        
        uno.setDNI("Jeboncio");
        dos.setDNI("Jeboncio");
        
        uno.setNombre("Juan");
        dos.setNombre("Juan");
        
        System.out.println("Las personas: " + uno.getNombre() + " y " + dos.getNombre());
        boolean igual = compararPersonas(uno, dos);
        if (igual) {
            System.out.println("Es igual");
        } else {
            System.out.println("No es igual");
        }
        

    }
    
    public static boolean compararPersonas(Persona uno, Persona dos) {
        
        if (uno.getNombre() == dos.getNombre() && uno.getDNI() == dos.getDNI()) {
            return true;
        }
        
        return false;
        
    }
    
    
    
    

}
