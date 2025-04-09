package ar.edu.unahur.objetos.colman_ignacio.Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AtletaTest {
    private Atleta ana = new Atleta(25);
    private Atleta rosa = new Atleta(45,8);
    private Atleta perla = new Atleta(28, 6, 4);

    @Test
    public void anaConPotencia28Inteligencia12YDestacada() {
        assertEquals(28, ana.potencia());
        assertEquals(12, ana.inteligencia());
        assertTrue(ana.esDestacada());
    }
    @Test
    public void rosaConPotencia52Inteligencia8YDestacada() {
        assertEquals(52, rosa.potencia());
        assertEquals(8, rosa.inteligencia());
        assertTrue(rosa.esDestacada());
    }
    @Test
    public void perlaConPotencia44Inteligencia12YNoDestacada() {
        assertEquals(44, perla.potencia());
        assertEquals(12, perla.inteligencia());
        assertFalse(perla.esDestacada());
    }

    @Test
    public void perlaEntrena15diasYAprendeUnaTecnicaLuegoAprendeOtraTecnica() {
        perla.entrenar(15);
        perla.aprenderTecnica();
        assertEquals(5, perla.getTecnicasAprendidas());
        assertEquals(9, perla.getMasaMuscular());
        perla.aprenderTecnica();
        assertEquals(6, perla.getTecnicasAprendidas());
        assertTrue(perla.esDestacada());
    }
    @Test
    public void anaConValor40rosaConValor60YPerlaConValor56() {
        assertEquals(40, ana.valor());
        assertEquals(60, rosa.valor());
        assertEquals(56, perla.valor());
    }
}
