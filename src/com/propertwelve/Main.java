package com.propertwelve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long liczba = 1000000000;
        long suma = 0;
        //Scanner odczyt = new Scanner(System.in);
        //liczba = odczyt.nextInt();
        //System.out.println(liczba);
        for (long i = 1; i <= liczba; i++) {
            suma = suma + i;
        }
        //to reduce total time <1 [s] follow line below, change long liczba and long suma to double
        // suma = (1 + liczba)/2 * liczba;
        System.out.println(suma);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }
}

