package ar.edu.unahur.objetos.colman_ignacio.Personas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.objetos.colman_ignacio.Armas.*;

public class SoldadoTest {
    private Soldado nacho = new Soldado(24,List.of());
    private Soldado nachoConArmas = new Soldado(24, List.of(new Espadon(20), new Pistolete(8)));
    private Soldado mili = new Soldado(35, List.of(new Pistolete(12)));

    @Test
    public void nachoConPotencia20Inteligencia12NoDestacadaYValor32() {
        assertEquals(20, nacho.potencia());
        assertEquals(12, nacho.inteligencia());
        assertFalse(nacho.esDestacada());
        assertEquals(32, nacho.valor());
    }
    @Test
    public void nachoConArmasPotencia46Inteligencia12NoDestacadaYValor58() {
        assertEquals(46, nachoConArmas.potencia());
        assertEquals(12, nachoConArmas.inteligencia());
        assertFalse(nachoConArmas.esDestacada());
        assertEquals(58, nachoConArmas.valor());
    }
    @Test
    public void miliConPotencia56Inteligencia8DestacadaYValor28() {
        assertEquals(56, mili.potencia());
        assertEquals(12, mili.inteligencia());
        assertTrue(mili.esDestacada());
        assertEquals(68, mili.valor());
   }
}
