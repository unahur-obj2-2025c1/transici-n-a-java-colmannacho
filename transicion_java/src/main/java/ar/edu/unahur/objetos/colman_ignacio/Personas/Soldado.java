package ar.edu.unahur.objetos.colman_ignacio.Personas;

import ar.edu.unahur.objetos.colman_ignacio.Planetas.Planeta;

import java.util.List;

import ar.edu.unahur.objetos.colman_ignacio.Armas.Arma;

public class Soldado extends Persona {

    private List<Arma> armas;

    public Soldado(Integer edad, List<Arma> armas) {
        super(edad);
        this.armas = armas;
    }

    @Override
    public Integer potencia(){
        return super.potencia() + armas.stream().mapToInt(arma -> arma.potencia(this)).sum();
    }

    @Override
    public void realizarTributo(Planeta uPlaneta){
        uPlaneta.construirMuralla(5);
    }
}
