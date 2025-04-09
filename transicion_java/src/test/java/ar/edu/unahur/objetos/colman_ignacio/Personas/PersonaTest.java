package ar.edu.unahur.objetos.colman_ignacio.Personas;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    private Persona julieta = new Persona(42);
    private Persona lucas = new Persona(15);
    @Test
    public void julietaConPotencia20Inteligencia8YNoDestacada() {
        assertEquals(20, julieta.potencia());
        assertEquals(8, julieta.inteligencia());
        assertFalse(julieta.esDestacada());
    }
    @Test
    public void julietaConValor28() {
        assertEquals(28, julieta.valor());
    }
    @Test
    public void lucasConPotencia20Inteligencia8YNoDestacada() {
        assertEquals(20, lucas.potencia());
        assertEquals(8, lucas.inteligencia());
        assertTrue(!lucas.esDestacada());
    }
}
