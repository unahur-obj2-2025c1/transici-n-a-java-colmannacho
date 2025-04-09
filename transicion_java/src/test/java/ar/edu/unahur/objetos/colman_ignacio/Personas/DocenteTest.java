package ar.edu.unahur.objetos.colman_ignacio.Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DocenteTest {
    private Docente monica = new Docente(45,6);
    private Docente luisa = new Docente(35,1);

    @Test
    public void monicaConPotencia20Inteligencia20YDestacada() {
        assertEquals(20, monica.potencia());
        assertEquals(20, monica.inteligencia());
        assertTrue(monica.esDestacada());
    }
    @Test
    public void luisaConPotencia20Inteligencia14YNoDestacada() {
        assertEquals(20, luisa.potencia());
        assertEquals(14, luisa.inteligencia());
        assertFalse(luisa.esDestacada());
    }
    @Test
    public void monicaConValor45() {
        assertEquals(45, monica.valor());
    }
    @Test
    public void luisaConValor39() {
        assertEquals(39, luisa.valor());
    }
}
