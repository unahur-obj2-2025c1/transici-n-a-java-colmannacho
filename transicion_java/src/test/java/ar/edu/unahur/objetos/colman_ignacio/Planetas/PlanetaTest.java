package ar.edu.unahur.objetos.colman_ignacio.Planetas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.objetos.colman_ignacio.Armas.Espadon;
import ar.edu.unahur.objetos.colman_ignacio.Armas.Pistolete;
import ar.edu.unahur.objetos.colman_ignacio.Personas.Atleta;
import ar.edu.unahur.objetos.colman_ignacio.Personas.Docente;
import ar.edu.unahur.objetos.colman_ignacio.Personas.Persona;
import ar.edu.unahur.objetos.colman_ignacio.Personas.Soldado;

public class PlanetaTest {
    private Persona julieta = new Persona(42);
    private Docente monica = new Docente(45,6);
    private Docente luisa = new Docente(35,1);
    private Atleta ana = new Atleta(25);
    private Atleta rosa = new Atleta(45,8);
    private Atleta perla = new Atleta(28, 6, 4);
    private Soldado nachoConArmas = new Soldado(24, List.of(new Espadon(20), new Pistolete(8)));
    private Soldado mili = new Soldado(35, List.of(new Pistolete(12)));
    private Planeta triton = new Planeta(Set.of(julieta,ana,rosa,perla,monica,luisa),0);
    private Planeta jupiter = new Planeta(Set.of(julieta,rosa,monica,nachoConArmas,mili), 0, 0);
    private Planeta neptuno = new Planeta(Set.of(monica,luisa), 0, 0);

    @Test
    public void delegacionDiplomaticaPorAnaRosaYMonicaEnTriton(){
        assert(triton.delegacionDiplomatica().contains(ana));
        assert(triton.delegacionDiplomatica().contains(rosa));
        assert(triton.delegacionDiplomatica().contains(monica));
        assertEquals(Set.of(ana,rosa,monica),triton.delegacionDiplomatica());
    }
    @Test
    public void valorInicialDeDefensaEs2EnTriton(){
        assertEquals(2,triton.valorInicialDeDefensa());
    }
    @Test
    public void esCultoEsFalseEnTriton(){
        assertTrue(!triton.esCulto());
        assertFalse(triton.esCulto());
    }
    @Test
    public void potenciaRealEs184EnTriton(){
        assertEquals(184,triton.potenciaReal());
    }
    @Test
    public void potenciaDelHabitanteConMasPotenciaEsRosaCon52EnTriton(){
        assertEquals(52, triton.potenciaDelHabitanteMasPotente());
    }
    @Test
    public void potenciaAparenteEsDe312EnTriton(){
        assertEquals(312, triton.potenciaAparente());
    }
    @Test
    public void necesitaReforzarseEsFalseEnTriton(){
        assertTrue(!triton.necesitaReforzarse());
        assertFalse(triton.necesitaReforzarse());
    }
    @Test
    public void habitantesValiososSonAnaMonicaRosaYPerlaEnTriton(){
        assert(triton.habitantesValiosos().contains(ana));
        assert(triton.habitantesValiosos().contains(monica));
        assert(triton.habitantesValiosos().contains(rosa));
        assert(triton.habitantesValiosos().contains(perla));
        assertEquals(Set.of(ana,rosa,perla,monica),triton.habitantesValiosos());
    }
    @Test
    public void jupiterNoTieneMuseosNiMurallas(){
        assertTrue(jupiter.getcantidadMuseos() == 0);
        assertTrue(jupiter.getlongitudMurallas() == 0);
    }
    @Test
    public void jupiterRecibe2TributosDeMonicaLuegoEsCultoFalseTiene2MuseosY24kmMuralla(){
        jupiter.recibirTributos();
        jupiter.recibirTributos();
        assertFalse(jupiter.esCulto());
        assertEquals(2,jupiter.getcantidadMuseos());
        assertEquals(24,jupiter.getlongitudMurallas());
    }
    @Test
    public void tritonApaciguaAJupiterYObtiene2MuseosY6kmMuralla(){
        triton.apaciguar(jupiter);
        assertEquals(2,jupiter.getcantidadMuseos());
        assertEquals(6,jupiter.getlongitudMurallas());
    }
    @Test
    public void neptunoRecibeTrinutosLuegoEsCultoTrue(){
        neptuno.recibirTributos();
        assertTrue(neptuno.esCulto());
        assertEquals(true,neptuno.esCulto());
    }
}
