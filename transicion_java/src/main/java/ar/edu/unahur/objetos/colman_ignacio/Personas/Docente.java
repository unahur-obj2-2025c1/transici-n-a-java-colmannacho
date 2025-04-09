package ar.edu.unahur.objetos.colman_ignacio.Personas;

import ar.edu.unahur.objetos.colman_ignacio.Planetas.Planeta;

public class Docente extends Persona {
    private Integer cantidadCursosDados = 0;

    public Docente(Integer edad, Integer cantidadCursosDados) {
        super(edad);
        this.cantidadCursosDados = cantidadCursosDados;
    }

    @Override
    public Integer inteligencia(){
        return super.inteligencia() + (cantidadCursosDados * 2);
    }
    @Override
    public Boolean esDestacada(){
        return cantidadCursosDados > 3;
    }
    @Override
    public void realizarTributo(Planeta unPlaneta){
        unPlaneta.fundarMuseo();
    }
    @Override
    public Integer valor(){
        return super.valor() + 5;
    }
}
