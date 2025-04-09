package ar.edu.unahur.objetos.colman_ignacio.Planetas;

import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unahur.objetos.colman_ignacio.Personas.Persona;
public class Planeta {
    private Set<Persona> habitantes;
    private Integer cantidadMuseos;
    private Integer longitudMurallas;

    public Planeta(Set<Persona> habitantes, Integer cantidadMuseos) {
        this.habitantes = habitantes;
        this.cantidadMuseos = cantidadMuseos;
    }
    public Planeta(Set<Persona> habitantes, Integer cantidadMuseos, Integer longitudMurallas) {
        this.habitantes = habitantes;
        this.cantidadMuseos = cantidadMuseos;
        this.longitudMurallas = longitudMurallas;
    }

    public Integer getcantidadMuseos(){
        return cantidadMuseos;
    }
    public Integer getlongitudMurallas(){
        return longitudMurallas;
    }

    public Set<Persona> delegacionDiplomatica(){
        return habitantes.stream().filter(habitante -> habitante.esDestacada()).collect(Collectors.toSet());
    }

    public Integer valorInicialDeDefensa(){
        return (int) habitantes.stream().filter(habitante -> habitante.potencia() >= 30).count();
    }

    public Boolean esCulto(){
        return cantidadMuseos >= 2 && habitantes.stream().allMatch(habitante -> habitante.inteligencia() >= 10);
    }

    public Integer potenciaReal(){
        return habitantes.stream().map(habitante -> habitante.potencia()).reduce(0, Integer::sum);
    }

    public void construirMuralla(Integer cantidadAConstruir){
        longitudMurallas += cantidadAConstruir;
    }

    public void fundarMuseo(){
        cantidadMuseos += 1;
    }

    public Integer potenciaDelHabitanteMasPotente(){
        return habitantes.stream().mapToInt(habitante -> habitante.potencia()).max().orElse(0);
    }

    public Integer potenciaAparente(){
        return this.potenciaDelHabitanteMasPotente() * habitantes.size();
    }

    public Boolean necesitaReforzarse(){
        return this.potenciaAparente() >= this.potenciaReal() * 2;
    }

    public void recibirTributos(){
        habitantes.forEach(habitante -> habitante.realizarTributo(this));
    }

    public Set<Persona> habitantesValiosos(){
        return habitantes.stream().filter(habitante -> habitante.valor() >= 40).collect(Collectors.toSet());
    }

    public void apaciguar(Planeta unPlaneta){
        this.habitantes.forEach(habiante -> habiante.realizarTributo(unPlaneta));
    }
}
