package ar.edu.unahur.objetos.colman_ignacio.Armas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.objetos.colman_ignacio.Personas.Soldado;

public class EspadonTest {
    private Arma espada = new Espadon(20);
    private Soldado nacho = new Soldado(24, List.of(espada));
    private Soldado mili = new Soldado(45, List.of(espada));

    @Test
    public void potenciaEs10ParaNacho(){
        assertEquals(10, espada.potencia(nacho));
    }
    @Test
    public void potenciaEs6ParaMili(){
        assertEquals(6, espada.potencia(mili));
    }
}
