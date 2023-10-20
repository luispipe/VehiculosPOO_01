package com.example.vehiculopoo;

public abstract class Vehiculo {
/* Una superclase es aquella que no herada de otra y de la cuál todas
*  las otras clases heredan es decir la clase de mayor jerarquia.
*  en java se le asigna a la super clase la caracteristica abstract
*
* La abstracción dice que en esta clase se pueden tener metodos abstractos
*
*Metodo abstracto: es un metodo sin lógica, la lógica la realiza los hijos
* o quien hereda la super clase
* */

    //Atributos
    String marca;
    String color;
    String modelo;
    int cantLlanta;
    int pasajeros;
    String placa;

    int velocidad;
    //Constructor
    public Vehiculo(String marca, String color, String modelo, int cantLlanta, int pasajeros, String placa,int velocidad) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.cantLlanta = cantLlanta;
        this.pasajeros = pasajeros;
        this.placa = placa;
        this.velocidad=velocidad;
    }
    //Métodos
    public void limiteVelocidad(){
        if (this.velocidad>80){
            System.out.println("Reduzca la velocidad");
        }
    }

    public abstract void tanquearVehiculo();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantLlanta() {
        return cantLlanta;
    }

    public void setCantLlanta(int cantLlanta) {
        this.cantLlanta = cantLlanta;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
