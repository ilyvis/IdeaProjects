package com.euclid.algorithm;

public class Gcd {

    public static int euclid(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int[] adjEuclid(int a, int b) {
        int e;
        int[] k = {a, 1, 0};
        int[] m = {b, 0, 1};
        int[] p = new int[3];
        while (m[0] != 0) {
            e = k[0] / m[0];
            p[0] = k[0] % m[0];
            if (p[0] != 0) {
                p[1] = k[1] - e * m[1];
                p[2] = k[2] - e * m[2];
            }
            k = m.clone();
            m = p.clone();
        }
        return k;
    }
    public static int inversiya(int a, int b) {
        int e;
        int[] k = {a, 0};
        int[] m = {b, 1};
        int[] p = new int[2];
        while (m[0] != 0) {
            e = k[0] / m[0];
            p[0] = k[0] % m[0];
            if (p[0] != 0) {
                p[1] = k[1] - e * m[1];
            }
            k = m.clone();
            m = p.clone();
        }
        if (k[1]<0) {
            k[1] += a;
        }
        return k[1];
    }
}
