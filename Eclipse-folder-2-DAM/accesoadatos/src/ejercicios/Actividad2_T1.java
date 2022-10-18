package ejercicios;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Actividad2_T1 {

	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		
		JFileChooser elegir = new JFileChooser ();
        elegir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcion = elegir.showOpenDialog(frame);
        String directorio = elegir.getSelectedFile().getAbsolutePath().toString();
		
        Tree(directorio);

	}

    public static void Tree(String ruta) {
        
        File ruta_final = new File(ruta);
        File[] lista = ruta_final.listFiles();

        if (lista != null) {
        	System.out.println(ruta);
            for (File x : lista) {
                if (x.isDirectory()) {
                    System.out.println("/" + x.getName());
                    Tree(x.getPath());
                } else {
                    System.out.println("\t" + x.getName());
                }
            }
        }

    }


}
