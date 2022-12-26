package com.vigener.algorithm;

import java.util.Locale;

public class Vigener {
    public static String crypt(String text, String cWord) {
        StringBuilder res = new StringBuilder();
        text = text.toLowerCase();
        cWord = cWord.toLowerCase();
        char[] tChar = text.toCharArray();
        final char[] cChar = cWord.toCharArray();
        final char[] Ch = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};
        int index;
        int cIndex = 0;
        int step;

        for (int k = 0; k < tChar.length; k++) {
            step = 0;
            index = 0;
            while (cChar[cIndex] != Ch[step]) step++;

            while (tChar[k] != Ch[index]) index++;
            index += step;
            if (index > 33) {
                index -= 34;
            }
            tChar[k] = Ch[index];
            cIndex++;
            if (cIndex == cWord.length()) {
                cIndex = 0;
            }
        }
        for (char c : tChar) {
            res.append(c);
        }
        return res.toString();
    }


    public static String decrypt(String text, String cWord) {
        StringBuilder res = new StringBuilder();
        text = text.toLowerCase();
        cWord = cWord.toLowerCase();
        char[] tChar = text.toCharArray();
        final char[] cChar = cWord.toCharArray();
        final char[] Ch = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' '};
        int index;
        int cIndex = 0;
        int step;

        for (int k = 0; k < tChar.length; k++) {
            step = 0;
            index = 0;
            while (cChar[cIndex] != Ch[step]) step++;

            while (tChar[k] != Ch[index]) index++;
            index -= step;
            if (index < 0) {
                index += 34;
            }
            tChar[k] = Ch[index];
            cIndex++;
            if (cIndex == cWord.length()) {
                cIndex = 0;
            }
        }
        for (char c : tChar) {
            res.append(c);
        }
        return res.toString();
    }
}


