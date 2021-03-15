package desafioAritmetico;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class desafioTres {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);
            Locale.setDefault(new Locale("en", "US"));

            //declare as variaveis corretamente e continue a sua solução

            ArrayList<Integer> inputArray = new ArrayList<Integer>();

            int n = sc.nextInt();
            while( n-- > 0)
                inputArray.add(sc.nextInt());

            SortedMap<Integer, Integer> treeMap = new TreeMap<>();
            inputArray.forEach(id -> treeMap.compute(id, (key, value) -> ( treeMap.get(key) == null ? 1 : value + 1)));


            treeMap.entrySet().forEach(entry->{
                System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
            });

            sc.close();
        }
    }
