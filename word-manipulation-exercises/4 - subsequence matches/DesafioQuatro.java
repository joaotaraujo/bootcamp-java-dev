package br.com.joca.simpleExample.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesafioQuatro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //insira sua solução aqui
        String word = br.readLine();

        while(word != null){
            boolean perfectWord = true;

            for (int i = 1; i < word.length(); i++) {
                String lastWord = word.substring(i);
                String firstWord = word.substring(0, word.length() - lastWord.length());
                if (firstWord.endsWith(lastWord)) {
                    System.out.println(firstWord);
                    perfectWord = false;
                }
            }
            if(perfectWord){
                System.out.println(word);
            }
            word = br.readLine();
        }
    }
}
