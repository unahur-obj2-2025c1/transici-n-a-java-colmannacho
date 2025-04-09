package ar.edu.unahur.objetos.colman_ignacio.Armas;

import ar.edu.unahur.objetos.colman_ignacio.Personas.Soldado;

public class Pistolete implements Arma {

    private Integer largo;

    public Pistolete(Integer largo) {
        this.largo = largo;
    }

    @Override
    public Integer potencia(Soldado unSoldado) {
        return unSoldado.getEdad() > 30 ? largo * 3 : largo * 2;
    }
    
}
