package com.euclid.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Euclid {
    public static void main(String[] args) throws Exception
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    System.out.println(gcd(a, b));

}

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
