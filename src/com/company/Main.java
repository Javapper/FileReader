package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        long count_a = 0;
        long count_A = 0;
        long countLine = 0;

        char[] currentChars;
        String currentString;

        long time = System.currentTimeMillis();

        File file = new File("C:\\Users\\QAtest.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            while ((currentString = reader.readLine()) != null) {

                countLine++;
                currentChars = currentString.toCharArray();

                for (char ch: currentChars) {
                    if (ch == 'a') {
                        count_a++;
                    } else if (ch == 'A') {
                        count_A++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество строк: " + countLine);
        System.out.println("Количество символов 'a': " + count_a);
        System.out.println("Количество символов 'a' и 'A': " + (count_a + count_A));
        System.out.println("Затраченное время в секундах: " + ((double) (System.currentTimeMillis() - time) / 1000));
    }
}
