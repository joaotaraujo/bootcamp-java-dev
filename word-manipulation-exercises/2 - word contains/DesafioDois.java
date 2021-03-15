package br.com.joca.simpleExample.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DesafioDois {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //insira sua solução aqui
        int n;

        while ((n = Integer.parseInt(st.nextToken())) != 0) {

            List<String> wordInputs = new ArrayList<>();
            boolean ehConjuntoBom = true;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                wordInputs.add(st.nextToken());
            }

            for (int i = 0; i < wordInputs.size() - 1; i++) {
                for (int j = 1 + i; j < wordInputs.size(); j++) {
                    if(wordInputs.get(i).startsWith(wordInputs.get(j))
                    || wordInputs.get(j).startsWith(wordInputs.get(i))){
                        i = wordInputs.size() - 1;
                        j = wordInputs.size();
                        ehConjuntoBom = false;
                    }
                }
            }

            if(ehConjuntoBom){
                System.out.println("Conjunto Bom");
            } else{
                System.out.println("Conjunto Ruim");
            }

            st = new StringTokenizer(br.readLine());
        }
    }
}