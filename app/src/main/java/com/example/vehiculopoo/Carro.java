package com.example.vehiculopoo;

public class Carro extends Vehiculo {
    //una clase hereda de otra con la palabra reservada extends

    //Atributos
    int cantPuertas;
    String motor;
    boolean publico;
    int cilindraje;
    String tipoConbustible;
    int cantPasajerosActual;

    public Carro(String marca, String color, String modelo, int cantLlanta, int pasajeros, String placa, int velocidad, int cantPuertas, String motor, boolean publico, int cilindraje, String tipoConbustible, int cantPasajerosActual) {
        //super llama al constructor del padre en este caso Vehiculo y le manda los parametros
        super(marca, color, modelo, cantLlanta, pasajeros, placa, velocidad);
        this.cantPuertas = cantPuertas;
        this.motor = motor;
        this.publico = publico;
        this.cilindraje = cilindraje;
        this.tipoConbustible = tipoConbustible;
        this.cantPasajerosActual = cantPasajerosActual;
    }


    //Polimorfismo por sobreescritura
    //Cuando un metodo es abstracto en el padre, por lo cuál cada clase hija
    //definira de forma autonoma o propia la lógica de este metodo.
    @Override
    public void tanquearVehiculo() {
        System.out.println("Se tanqueo el vehiculo con "+this.tipoConbustible);
    }


    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoConbustible() {
        return tipoConbustible;
    }

    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    public int getCantPasajerosActual() {
        return cantPasajerosActual;
    }

    public void setCantPasajerosActual(int cantPasajerosActual) {
        this.cantPasajerosActual = cantPasajerosActual;
    }
}
