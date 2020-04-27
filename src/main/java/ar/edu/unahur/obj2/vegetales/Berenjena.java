package ar.edu.unahur.obj2.vegetales;

import ar.edu.unahur.obj2.Comestible;

public class Berenjena extends Vegetal implements Comestible {

    public Berenjena(String color) {
        super(color);
    }

    public String comoPreparar() {
        return "hacete unas buenas milanesas de Berenjena";


    }
}
