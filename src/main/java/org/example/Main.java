package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);

        double capital;
        float tasaInteresAnual;
        float tiempoAnios;

        System.out.print("Ingrese su cpital: ");
        capital = leerTeclado.nextDouble();
        System.out.print("Ingrese la tasa de interés Anual: ");
        tasaInteresAnual = leerTeclado.nextFloat();
        System.out.print("Ingrese el tiempo en años: ");
        tiempoAnios = leerTeclado.nextFloat();

        double intereses = capital * (tasaInteresAnual/100) * tiempoAnios;
        double total = capital + intereses;

        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoMoneda.setMaximumFractionDigits(2);  // Para asegurar solo 2 decimales

        System.out.println("Interes: " + formatoMoneda.format(intereses) + " total: " + formatoMoneda.format(total));

    }
}