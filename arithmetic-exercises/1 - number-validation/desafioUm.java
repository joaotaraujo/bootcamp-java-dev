package desafioAritmetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class desafioUm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //declare suas variaveis
        int  A = Integer.parseInt(st.nextToken());
        int  B = Integer.parseInt(st.nextToken());
        int  C = Integer.parseInt(st.nextToken());
        int  D = Integer.parseInt(st.nextToken());
        br.close();

        //declare suas variaveis com o valor correto
        int n = 0;

        //continue o codigo
        if ( C % A == 0 ){
            for(int i = A ; i <= C ; i = i + A){
                if ( i % A == 0 && i % B != 0
                    && C % i == 0 && D % i != 0){
                    System.out.println(i);
                    n = i;
                    break;
                }
            }
        }
        if(n == 0){
            System.out.println(-1);
        }
    }
}