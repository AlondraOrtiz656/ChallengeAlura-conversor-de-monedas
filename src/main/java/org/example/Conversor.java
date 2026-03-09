package org.example;

public class Conversor {

    public static double convertir(double monto, double tasaOrigen, double tasaDestino) {
        return monto * (tasaDestino / tasaOrigen);
    }

}
