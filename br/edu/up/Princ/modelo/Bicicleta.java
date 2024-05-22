package br.edu.up.Princ.modelo;


public class Bicicleta {

    public String modelo;
    public Double velociade;
    public Integer marcha;

    public Bicicleta(String modelo, Double velociade, public Integer marcha){
        this.modelo = modelo;
        this.velociade = velociade;
        this.marcha = marcha;
    }

    public void imprimir(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velociade: " + this.velociade);
        System.out.println("Marcha: " + this.marcha);
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){

        if (modelo.length() > 5) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo invalido!");
        }

    }
    
}
