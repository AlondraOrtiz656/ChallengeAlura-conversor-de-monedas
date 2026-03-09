package org.example;

import java.util.Scanner;

import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        ConsultaMoneda consulta = new ConsultaMoneda();
        JsonObject tasas = consulta.obtenerTasas();

        double ars = tasas.get("ARS").getAsDouble();
        double brl = tasas.get("BRL").getAsDouble();
        double cop = tasas.get("COP").getAsDouble();
        double usd = tasas.get("USD").getAsDouble();
        double dop = tasas.get("DOP").getAsDouble(); // Peso dominicano, mi país

        while (opcion != 9) {

            System.out.println("****************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda");
            System.out.println("1) Dólar => Peso argentino (USD -> ARS)");
            System.out.println("2) Peso argentino => Dólar (ARS -> USD)");
            System.out.println("3) Dólar => Real brasileño (USD -> BRL)");
            System.out.println("4) Real brasileño => Dólar (BRL -> USD)");
            System.out.println("5) Dólar => Peso colombiano (USD -> COP)");
            System.out.println("6) Peso colombiano => Dólar (COP -> USD)");
            System.out.println("7) Dólar => Peso dominicano (USD -> DOP)");
            System.out.println("8) Peso dominicano => Dólar (DOP -> USD)");
            System.out.println("9) Salir");
            System.out.print("Elija una opción válida: ");
            System.out.println("****************************************");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: {
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, usd, ars);
                    System.out.println("Resultado: " + resultado + " ARS");
                    break;
                }

                case 2: {
                    System.out.print("Ingrese el monto en ARS: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, ars, usd);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                }

                case 3: {
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, usd, brl);
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;
                }

                case 4: {
                    System.out.print("Ingrese el monto en BRL: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, brl, usd);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                }

                case 5: {
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, usd, cop);
                    System.out.println("Resultado: " + resultado + " COP");
                    break;
                }

                case 6: {
                    System.out.print("Ingrese el monto en COP: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, cop, usd);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                }

                case 7: {
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, usd, dop);
                    System.out.println("Resultado: " + resultado + " DOP");
                    break;
                }

                case 8: {
                    System.out.print("Ingrese el monto en DOP: ");
                    double monto = scanner.nextDouble();
                    double resultado = Conversor.convertir(monto, dop, usd);
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                }

                case 9:
                    System.out.println("Gracias por usar el conversor.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        }

        scanner.close();
    }
}


