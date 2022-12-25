package com.ceasarcode.algorithm;

public class CsrCod {
    public static String crypt(String message, int key, char firstLCharAlfabet, char lastLCharAlfabet, char firstHCharAlfabet, char lastHCharAlfabet) {
        StringBuilder strBox = new StringBuilder(message.length());
        char tmp;
        int countLCharsAlfabet = (lastLCharAlfabet - firstLCharAlfabet) + 1;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % countLCharsAlfabet;
                if (tmp > lastLCharAlfabet)
                    tmp = (char) (tmp % lastLCharAlfabet + firstLCharAlfabet - 1);
                else if (tmp < firstLCharAlfabet)
                    tmp = (char) (tmp + countLCharsAlfabet);
            }
        }
        int countHCharsAlfabet = (lastHCharAlfabet - firstHCharAlfabet) + 1;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % countHCharsAlfabet;
                if (tmp > lastLCharAlfabet)
                    tmp = (char) (tmp % lastHCharAlfabet + firstHCharAlfabet - 1);
                else if (tmp < firstHCharAlfabet)
                    tmp = (char) (tmp + countHCharsAlfabet);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }
    public static String decrypt(String message, int key, char firstLCharAlfabet, char lastLCharAlfabet, char firstHCharAlfabet, char lastHCharAlfabet) {
        StringBuilder strBox = new StringBuilder(message.length());
        char tmp;
        int countLCharsAlfabet = (lastLCharAlfabet - firstLCharAlfabet) + 1;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % countLCharsAlfabet;
                if (tmp > lastLCharAlfabet)
                    tmp = (char) (tmp % lastLCharAlfabet + firstLCharAlfabet - 1);
                else if (tmp < firstLCharAlfabet)
                    tmp = (char) (tmp + countLCharsAlfabet);
            }
        }
        int countHCharsAlfabet = (lastHCharAlfabet - firstHCharAlfabet) + 1;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % countHCharsAlfabet;
                if (tmp > lastLCharAlfabet)
                    tmp = (char) (tmp % lastHCharAlfabet + firstHCharAlfabet - 1);
                else if (tmp < firstHCharAlfabet)
                    tmp = (char) (tmp + countHCharsAlfabet);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }
}
