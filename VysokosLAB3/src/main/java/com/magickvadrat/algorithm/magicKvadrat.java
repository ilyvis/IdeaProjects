package com.magickvadrat.algorithm;

public class magicKvadrat {
    public static String crypt(String text) {
        int s = 0;
        StringBuilder res = new StringBuilder();
        String str;
        final int[][] mKvadrat = {{1, 8, 13, 12}, {15, 10, 3, 6}, {4, 5, 16, 9}, {14, 11, 2, 7}};
        String[][] Kvadrat = new String[4][4];

        for (int y = 0; y < 4; y += 1) {
            for (int x = 0; x < 4; x += 1) {
                Kvadrat[y][x] = "";
            }
        }
        int nx = 0;
        int ny = 0;

        while (s < text.length()) {
            for (int k = 0; k < 16; k += 1) {
                if (s < text.length()) {
                    str = text.substring(s, s + 1);
                    for (int y = 0; y < 4; y += 1) {
                        for (int x = 0; x < 4; x += 1) {
                            if (mKvadrat[y][x] == k + 1) {
                                nx = x;
                                ny = y;
                            }
                        }
                    }
                    Kvadrat[ny][nx] = str;
                }
                s += 1;
            }
            for (int y = 0; y < 4; y += 1) {
                for (int x = 0; x < 4; x += 1) {
                    res.append(Kvadrat[y][x]);
                    Kvadrat[y][x] = "";
                }
            }
        }
        return res.toString();
    }

    public static String decrypt(String text) {
        int s = 0;
        final int[][] mKvadrat = {{1, 8, 13, 12}, {15, 10, 3, 6}, {4, 5, 16, 9}, {14, 11, 2, 7}};
        String[][] Kvadrat = new String[4][4];

        for (int y = 0; y < 4; y += 1) {
            for (int x = 0; x < 4; x += 1) {
                Kvadrat[y][x] = "";
            }
        }
        StringBuilder res = new StringBuilder();

        while (s < text.length()) {
            for (int y = 0; y < 4; y += 1) {
                for (int x = 0; x < 4; x += 1) {
                    if (s < text.length()) {
                        Kvadrat[y][x] = text.substring(s, s + 1);
                        s += 1;
                    }
                }
            }

            for (int k = 0; k < 16; k += 1) {
                for (int y = 0; y < 4; y += 1) {
                    for (int x = 0; x < 4; x += 1) {
                        if (mKvadrat[y][x] == k + 1) {
                            res.append(Kvadrat[y][x]);
                        }
                    }
                }
            }
            for (int y = 0; y < 4; y += 1) {
                for (int x = 0; x < 4; x += 1) {
                    Kvadrat[y][x] = "";
                }
            }
        }
        return res.toString();
    }
}