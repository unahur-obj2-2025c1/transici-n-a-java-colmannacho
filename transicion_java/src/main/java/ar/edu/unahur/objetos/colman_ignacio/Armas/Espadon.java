package ar.edu.unahur.objetos.colman_ignacio.Armas;

import ar.edu.unahur.objetos.colman_ignacio.Personas.Soldado;

public class Espadon implements Arma {
    private Integer peso;

    public Espadon(Integer peso) {
        this.peso = peso;
    }

    @Override
    public Integer potencia(Soldado unSoldado) {
        return unSoldado.getEdad() < 40 ? peso / 2 : 6;
    }
}
