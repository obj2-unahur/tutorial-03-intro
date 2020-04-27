package ar.edu.unahur.obj2;

public class Cocineitor300 {

    public String ObtenerPreparacion(Comestible comestible) {
        if (!(comestible instanceof Comestible))
            throw new IllegalArgumentException("No podes comer eso");
        return comestible.comoPreparar();

    }
}
