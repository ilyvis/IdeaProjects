package com.euclid.algorithm;


import java.util.Scanner;

import static com.euclid.algorithm.Gcd.*;

public class GcdApp {
    public static void main(String[] args) {
        int[] z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(euclid(a, b));
        z = adjEuclid(a, b);
        for (int j : z) {
            System.out.print(j);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println((inversiya(a, b)));
    }
}

