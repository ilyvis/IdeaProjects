package com.vigener.algorithm;

import java.util.Scanner;
import static com.vigener.algorithm.Vigener.crypt;
import static com.vigener.algorithm.Vigener.decrypt;

public class VigenerApp {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = sc.nextLine();
        System.out.println("Введите кодовое слово:");
        String cWord = sc.nextLine();
        System.out.print("Длина текста:");
        System.out.println(str.length());
        System.out.println(crypt(str, cWord));
        string = crypt(str, cWord);
        System.out.println(decrypt(string, cWord));
    }
}
