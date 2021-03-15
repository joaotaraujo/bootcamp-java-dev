package br.com.joca.simpleExample.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class DesafioUm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //insira sua solução aqui
        ArrayList<String> palavras;
        Map<String, Integer> numOcorrenciasPalavras;
        Map<String, String> abreviacoesEscolhidas;

        while (true) {
            palavras = new ArrayList<>();
            numOcorrenciasPalavras = new HashMap<>();
            abreviacoesEscolhidas = new TreeMap<>();

            while (st.hasMoreTokens()) {
                String novaPalavra = st.nextToken();
                palavras.add(novaPalavra);

                if(novaPalavra.length() > 2){
                    numOcorrenciasPalavras.put(novaPalavra,
                            numOcorrenciasPalavras.containsKey(novaPalavra) ?
                                    numOcorrenciasPalavras.get(novaPalavra) + 1 : 1);

                    abreviacoesEscolhidas.put(novaPalavra.charAt(0)+".",
                            atualizaMelhorPalavra(novaPalavra,numOcorrenciasPalavras,
                                    abreviacoesEscolhidas));
                }
            }

            if (palavras.get(0).equals(".")) {
                break;
            }

            imprimeResultado(palavras, abreviacoesEscolhidas);

            st = new StringTokenizer(br.readLine());
        }
    }

    public static String atualizaMelhorPalavra(String palavra,
                                               Map<String, Integer> numOcorrenciasPalavras,
                                               Map<String, String> abreviacoesEscolhidas) {

        if (!abreviacoesEscolhidas.containsKey(palavra.charAt(0)+".")) {
            return palavra;
        }

        int novaReducaoCaracteres = numOcorrenciasPalavras.get(palavra) * (palavra.length() - 2);
        String abreviadaAtual = abreviacoesEscolhidas.get(palavra.charAt(0)+".");
        int reducaoAtualCaracteres = numOcorrenciasPalavras.get(abreviadaAtual) * (abreviadaAtual.length() - 2);
        return novaReducaoCaracteres > reducaoAtualCaracteres ? palavra : abreviadaAtual;
    }

    public static void imprimeResultado(ArrayList<String> palavras,
                                        Map<String,String> abreviacoesEscolhidas){
        palavras.stream().map((palavra) -> {
            if(abreviacoesEscolhidas.containsValue(palavra)){
                palavra = palavra.charAt(0) + ".";
            }
            System.out.print(palavra + " ");
            return palavra;
        }).collect(Collectors.toList());

        System.out.println("\n" + abreviacoesEscolhidas.size());

        abreviacoesEscolhidas.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.println(String.valueOf(entry).replaceAll("="," = ")));
    }
}