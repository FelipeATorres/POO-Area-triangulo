package org.example;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Triangle[] triangulos = new Triangle[2];

        for (int i = 0; i < 2; i++) {
            triangulos[i] = new Triangle();
            System.out.print("Digite o lado A do triângulo: ");
            triangulos[i].a = sc.nextInt();
            System.out.print("Digite o lado B do triângulo: ");
            triangulos[i].b = sc.nextInt();
            System.out.print("Digite o lado C do triângulo: ");
            triangulos[i].c = sc.nextInt();
        }
        double[] areastriangulos = new double[2];
        for (int i = 0; i < 2; i++) {
            double p = (triangulos[i].a + triangulos[i].b + triangulos[i].c)/2.0;
            double areaX = Math.sqrt(p * (p-triangulos[i].a) * (p-triangulos[i].b) * (p-triangulos[i].c));
            System.out.printf("Área do triângulo %f\n",areaX);
            areastriangulos[i] = areaX;
        }

        if (areastriangulos[0] > areastriangulos[1])
            System.out.println("O 1° triângulo tem a área maior que o 2°");
        else
            System.out.println("O 2° triângulo tem a área maior que o 1");

        sc.close();
    }
}