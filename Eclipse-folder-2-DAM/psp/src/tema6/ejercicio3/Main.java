package tema6.ejercicio3;

public class Main {

    public static void main(String[] args) {
        // Este  problema  consiste  en  un  sistema  con  tres  procesos,  que  serán  los 
        // «fumadores», y un proceso, al que podremos considerar el «estanquero», que dará 
        // material  a  los  fumadores.  Cada  fumador  está  continuamente  deseando  fumar  un 
        // cigarrillo.  Sin  embargo,  para  fumar,  necesita  tres  ingredientes:  tabaco,  papel  y 
        // fósforos. Cada uno de los tres fumadores tendrá un material de los necesarios, por lo 
        // que necesitan que el estanquero produzca los dos que les faltan. Cuando un fumador 
        // consigue los ingredientes que le faltan, fuma, avisando al productor cuando termina, 
        // quien coloca otros dos de los tres ingredientes, repitiéndose el ciclo. 
        // Para  que  el  estanquero  pueda  poner  nuevos  ingredientes,  no  debe  haber 
        // ingredientes en el mostrador, ni nadie fumando. Los ingredientes son: 
        // 0 -> tabaco. 
        // 1 -> papel. 
        // 2 -> fósforos. 
        // El fumador 0 cuenta con el ingrediente 0 por tanto necesita el 1 y el 2, el fumador 
        // 1 cuenta con el ingrediente 1 por tanto necesita los ingredientes 0 y 2, y el fumador 
        // 2 cuenta con el ingrediente 2 por tanto necesita los ingredientes 0 y 1.
        // Aclaración: Cuando decimos que el estanquero no pone el ingrediente 1 significa 
        // que pone el 0 y el 2 

        // Creamos los hilos
        Buffer buffer = new Buffer();
        Fumador fumador0 = new Fumador(buffer, 0);
        Fumador fumador1 = new Fumador(buffer, 1);
        Fumador fumador2 = new Fumador(buffer, 2);
        Estanquero estanquero = new Estanquero(buffer);

        // Iniciamos los hilos
        estanquero.start();
        fumador0.start();
        fumador1.start();
        fumador2.start();

        



    }

}
