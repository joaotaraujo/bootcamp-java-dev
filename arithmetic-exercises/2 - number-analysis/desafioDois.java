package desafioAritmetico;

import java.io.IOException;
import java.util.Scanner;

public class desafioDois {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare suas variaveis corretamente
        int valoresPares = 0;
        int valoresImpares= 0;
        int ehPositivo = 0;
        int ehNegativo = 0;
        int n = 0;

        int positivoOuNegativo;
        int parOuImpar;

        //continue a solução
        for (int i = 0; i < 5; i++) {
            n = leitor.nextInt();
            parOuImpar = (n % 2 == 0) ? valoresPares++ : valoresImpares++;

            if(n != 0) {
                positivoOuNegativo = (n > 0) ? ehPositivo++ : ehNegativo++;
            }
        }
        //insira suas variaveis corretamente
        System.out.println(valoresPares + " valor(es) par(es)");
        System.out.println(valoresImpares + " valor(es) impar(es)");
        System.out.println(ehPositivo + " valor(es) positivo(s)");
        System.out.println(ehNegativo + " valor(es) negativo(s)");
    }
}
