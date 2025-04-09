package ar.edu.unahur.objetos.colman_ignacio.Personas;

import ar.edu.unahur.objetos.colman_ignacio.Planetas.Planeta;

public class Atleta extends Persona {
    private Integer masaMuscular = 4;
    private Integer cantidadTecnicas = 2;

    public Atleta(Integer edad) {
        super(edad);
    }
    
    public Atleta(Integer edad, Integer cantidadTecnicas) {
        super(edad);
        this.cantidadTecnicas = cantidadTecnicas;
    }
    
    public Atleta(Integer edad, Integer masaMuscular, Integer cantidadTecnicas) {
        super(edad);
        this.masaMuscular = masaMuscular;
        this.cantidadTecnicas = cantidadTecnicas;
    }

    public Integer getTecnicasAprendidas() {
        return cantidadTecnicas;
    }
    public Integer getMasaMuscular() {
        return masaMuscular;
    }

    @Override
    public Integer potencia() {
        return super.potencia() + (masaMuscular * cantidadTecnicas);
    }
    @Override
    public Boolean esDestacada(){
        return super.esDestacada() || cantidadTecnicas > 5;
    }

    public void entrenar(Integer cantidadDias){
        masaMuscular += cantidadDias / 5;
    }

    public void aprenderTecnica(){
        cantidadTecnicas += 1;
    }
    
    @Override
    public void realizarTributo(Planeta unPlaneta){
        unPlaneta.construirMuralla(2);
    }
}
