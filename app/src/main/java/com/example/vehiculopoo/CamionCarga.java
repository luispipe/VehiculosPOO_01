package com.example.vehiculopoo;

public class CamionCarga extends Vehiculo {

    int capacidadCarga;
    int cargaActual;

    public CamionCarga(String marca, String color, String modelo, int cantLlanta, int pasajeros, String placa, int velocidad, int capacidadCarga, int cargaActual) {
        super(marca, color, modelo, cantLlanta, pasajeros, placa, velocidad);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
    }

    public void cargar(){
        while (cargaActual<=capacidadCarga){
            cargaActual++;
        }
    }

    public void liberarCarga(){
        cargaActual=0;
    }

    @Override
    public void tanquearVehiculo() {
        System.out.println("Se tanqueo el vehiculo");
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }
}
