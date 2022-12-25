package com.ceasarcode.algorithm;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        message = sc.nextLine();
        String codeMessage = CsrCod.crypt(message, 7, 'а', 'я', 'А', 'Я');
        System.out.println(message + " -> " + codeMessage);
        String deCodeMessage = CsrCod.decrypt(codeMessage, -7, 'а', 'я', 'А', 'Я');
        System.out.println(codeMessage + " -> " + deCodeMessage);
    }
}
