package com.euclid.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

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

    public static void adjegcd (String args[])
    {
        System.out.println("How many times you would like to try ?");
        Scanner read = new Scanner(System.in);
        int len = read.nextInt();

        for(int w = 0; w < len; w++)
        {
            System.out.print("Please give the numbers seperated by space: ");
            read.nextLine();
            long tmp = read.nextLong();
            long m = read.nextLong();
            long n;
            if (m < tmp) {
                n = m;
                m = tmp;
            }
            else {
                n = tmp;
            }

            long[] l1 = {m, 1, 0};
            long[] l2 = {n, 0, 1};
            long[] l3 = new long[3];

            while (l1[0]-l2[0]*(l1[0]/l2[0]) > 0) {
                for (int j=0;j<3;j++) l3[j] = l2[j];
                long q = l1[0]/l2[0];
                for (int i = 0; i < 3; i++) {
                    l2[i] = (l1[i]-l2[i]*q);
                }

                for (int k=0;k<3;k++) l1[k] = l3[k];
            }

            System.out.printf("%d %d %d",l2[1],l2[2],l2[0]); // first two Bezouts identity Last One gcd
        }
    }
}
