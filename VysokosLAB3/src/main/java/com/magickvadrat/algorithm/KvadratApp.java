package com.magickvadrat.algorithm;

import java.util.Scanner;
import static com.magickvadrat.algorithm.MagicKvadrat.crypt;
import static com.magickvadrat.algorithm.MagicKvadrat.decrypt;

public class KvadratApp {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = sc.nextLine();
        System.out.println(crypt(str));
        string = crypt(str);
        System.out.println(decrypt(string));
    }
}
