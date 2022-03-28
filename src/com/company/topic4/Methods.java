package com.company.topic4;

public class Methods {
    static int sum(int primulNumar, int aldoileaNumar) {
        int suma = 0;
        if (primulNumar > aldoileaNumar) {
            System.out.println("Primul numar este mai mare decat al doilea");
            return suma;
        } else if (primulNumar == aldoileaNumar) {
            System.out.println("Primul numar este identic cu al doilea");
            return primulNumar;
        } else {
            for (int i = primulNumar; i <= aldoileaNumar; i++) {
                suma = suma + i;
            }
            System.out.println("Executia ciclului FOR s-a incheiat");

            while (aldoileaNumar >= primulNumar) {
                suma = suma + aldoileaNumar;
                aldoileaNumar--;
            }
            System.out.println("Ciclul WHILE s-a finisat");
        }
        System.out.println("Metoda s-a executat pina la capat");
        return suma;
    }

    static void sum(double a) {
        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma += a;
                a--;
            }
            System.out.println("S-a terminat executia WHILE");
            System.out.println(suma);
        } else if (a == 0) {
            System.out.println("Suma este 0");
        } else {
            System.out.println(" este mai mic ca 0");

        }
    }

    static double sum(float a) {
        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma += a;
                a--;
            }
            System.out.println("S-a terminat executia WHILE");
            System.out.println(suma);
        } else if (a == 0) {
            System.out.println("Suma este 0");
        } else {
            System.out.println(" este mai mic ca 0");

        }
        return suma;
    }
}
