package br.com.joca.simpleExample.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class DesafioCinco {

    public static void main(String[] args) throws IOException {

        //insira sua resolução aqui
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            validaSenha(s);
        }
    }

    public static void validaSenha(String s){

        boolean digit = false;
        boolean lowerCase = false;
        boolean upperCase = false;

        if((s.length() < 6 || s.length() > 32)
          || !s.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$")){
            System.out.println("Senha invalida.");
            return;
        }

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                digit = true;
            }
            if(Character.isLowerCase(s.charAt(i))){
                lowerCase = true;
            }
            if(Character.isUpperCase(s.charAt(i))){
                upperCase = true;
            }
        }
        if(digit && lowerCase && upperCase){
            System.out.println("Senha valida.");
        }else {
            System.out.println("Senha invalida.");
        }
        return;
    }
}
