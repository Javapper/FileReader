package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        long count_a_rus = 0;
        long count_a_eng = 0;
        long count_A_rus = 0;
        long count_A_eng = 0;
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
                        count_a_eng++;
                    } else if (ch == 'A') {
                        count_A_eng++;
                    } else if (ch == 'а') {
                        count_a_rus++;
                    } else if (ch == 'А') {
                        count_A_rus++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество строк: " + countLine);
        System.out.println("Количество символов 'a' английских: " + count_a_eng);
        System.out.println("Количество символов 'A' английских: "  + count_A_eng);
        System.out.println("Количество символов 'a' русских: " + count_a_rus);
        System.out.println("Количество символов 'А' русских: " + count_A_rus);
        System.out.println("Затраченное время в секундах: " + ((double) (System.currentTimeMillis() - time) / 1000));
    }
}
