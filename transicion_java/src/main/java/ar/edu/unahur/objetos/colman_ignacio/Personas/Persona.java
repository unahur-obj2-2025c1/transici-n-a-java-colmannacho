package ar.edu.unahur.objetos.colman_ignacio.Personas;

import ar.edu.unahur.objetos.colman_ignacio.Planetas.Planeta;

public class Persona {
    
    private Integer edad;

    public Persona(Integer edad) {
        this.edad = edad;
    }

    public Integer potencia(){
        return 20;
    }

    public Integer inteligencia(){
        if (edad >= 20 && edad <= 40) {
            return 12;
        }
        else{
            return 8;
        }
        /*return edad >= 20 && edad <= 40 ? 12 : 8;*/
    }

    public Boolean esDestacada(){
        return edad == 25 || edad == 35;
    }
    public void realizarTributo(Planeta unPlaneta){}

    public Integer valor(){
        return this.potencia() + this.inteligencia();
    }
    public Integer getEdad(){
        return this.edad;
    }
}
