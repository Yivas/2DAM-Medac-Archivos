package tema2;

import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Caso_practico_2 {

	public static void main(String[] args) {

		Reader reader = new StringReader("jda skj 2 jjini 3 nin 1");

		StreamTokenizer streamTokenizer = new StreamTokenizer(reader);

		try {
			while(streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
			    if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
			        System.out.println(streamTokenizer.nval);
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
