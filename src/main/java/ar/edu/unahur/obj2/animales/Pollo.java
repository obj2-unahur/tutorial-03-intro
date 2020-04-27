package ar.edu.unahur.obj2.animales;
import ar.edu.unahur.obj2.Comestible;


public class Pollo extends Animal implements Comestible {

    public void sonido() {
        System.out.println("cocoroco");
    }

    public String comoPreparar() {
        return "Al horno con papas";

    }
}
