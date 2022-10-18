import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class prueba {

	public static void main(String[] args) {


		CharArrayWriter charArrayWriter = new CharArrayWriter();
		CharArrayReader charArrayReader;
		
		int data = 0;
		
		try {
			charArrayWriter.write("hola amigo");
			charArrayWriter.close();
			
			charArrayReader = new CharArrayReader(charArrayWriter.toCharArray());
			data = charArrayReader.read();
			
			while (data != -1) {
				System.out.println((char)data);
				data = charArrayReader.read();
			}
			charArrayReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
