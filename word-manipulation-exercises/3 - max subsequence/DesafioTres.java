package br.com.joca.simpleExample.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DesafioTres {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String firstWord, secondWord, minWord, maxWord; //declare suas variaveis aqui
        while ((firstWord = in.readLine()) != null) { // complete seu código
            secondWord = in.readLine();
            if ( firstWord.length() > secondWord.length()) {
                minWord = secondWord;
                maxWord = firstWord;
            } else {
                minWord = firstWord;
                maxWord = secondWord;
            }

            int minLength = minWord.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (maxWord.contains(minWord.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}