package com.hillcipher.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HillApp {
    public static void main(String args[]) throws IOException
    {
        HillCipher obj = new HillCipher();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Што делать:\n1: Зашифровать\n2: Расшифровать");
        choice = Integer.parseInt(in.readLine());
        System.out.println("Введите текст: ");
        String line = in.readLine();
        System.out.println("Введите ключ: ");
        String key = in.readLine();
        double sq = Math.sqrt(key.length());
        if (sq != (long) sq)
            System.out.println("Матрица не квадратная!!!!!!!!!");
        else
        {
            int s = (int) sq;
            if (obj.check(key, s))
            {
                System.out.println("Результат:");
                obj.divide(line, s);
                obj.cofact(obj.kmatr, s);
            }
        }
    }
}


