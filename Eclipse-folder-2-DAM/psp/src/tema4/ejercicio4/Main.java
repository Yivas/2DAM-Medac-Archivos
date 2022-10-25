package tema4.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("¿Que nombre tiene el atleta?");
        Scanner sc = new Scanner(System.in);
        Hilo1 hilo = new Hilo1(sc.nextLine());
        hilo.start();
        

    }

}
