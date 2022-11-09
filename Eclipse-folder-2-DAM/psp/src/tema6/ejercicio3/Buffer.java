package tema6.ejercicio3;

public class Buffer extends Thread {

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

    private int tabaco;
    private int papel;
    private int fosforos;
    private int fumando;

    public Buffer() {
        this.tabaco = 0;
        this.papel = 0;
        this.fosforos = 0;
    }

    public synchronized void poner(int ingrediente) {
        int ingredienteNoPuesto = ingrediente;
        switch (ingredienteNoPuesto) {
            case 0:
                this.papel++;
                this.fosforos++;
                break;
            case 1:
                this.tabaco++;
                this.fosforos++;
                break;
            case 2:
                this.tabaco++;
                this.papel++;
                break;
        }
    }

    public synchronized void coger(int ingrediente) {
        switch (ingrediente) {
            case 0:
                this.papel--;
                this.fosforos--;
                break;
            case 1:
                this.tabaco--;
                this.fosforos--;
                break;
            case 2:
                this.tabaco--;
                this.papel--;
                break;
        }
    }

    public synchronized boolean comprobar(int ingrediente) {
        switch (ingrediente) {
            case 0:
                if (this.papel > 0 && this.fosforos > 0) {
                    return true;
                }
                break;
            case 1:
                if (this.tabaco > 0 && this.fosforos > 0) {
                    return true;
                }
                break;
            case 2:
                if (this.tabaco > 0 && this.papel > 0) {
                    return true;
                }
                break;
        }
        return false;
    }

    
    public synchronized boolean añadirFumando() {
        if (this.fumando < 3) {
            this.fumando++;
            return true;
        } else {
            return false;
        }
    }

    public synchronized void quitarFumando() {
        if (this.fumando > 0) {
            this.fumando--;
        }
    }

    public synchronized boolean getFumando () {
        if (this.fumando > 0) {
            return true;
        } else {
            return false;
        }
    }
    



}
