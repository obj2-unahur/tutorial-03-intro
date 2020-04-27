package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.animales.Pollo;
import ar.edu.unahur.obj2.vegetales.Berenjena;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cocineitor300Test {
    Cocineitor300 cocinaitor;
    Comestible pollo;
    Comestible berenjena;

    @BeforeMethod
    public void setUp() {
        cocinaitor = new Cocineitor300();
        pollo = new Pollo();
        berenjena = new Berenjena("morada");
    }

    @Test
    public void testObtenerPreparacionParaPollo() {
        String expected = cocinaitor.ObtenerPreparacion(pollo);
        Assert.assertEquals(expected,"Al horno con papas");
    }

    @Test
    public void testObtenerPreparacionParaBerenjena() {
        String expected = cocinaitor.ObtenerPreparacion(berenjena);
        Assert.assertEquals(expected,"hacete unas buenas milanesas de Berenjena");
    }
}