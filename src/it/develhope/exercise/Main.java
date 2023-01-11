package it.develhope.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho creato una lista di Integer chiamara divisorsOf52 che contenga tutti i divisori di 52.
         */
        List<Integer> divisorsOf52 = new ArrayList<>(Arrays.asList(1, 2, 4, 13, 26, 52));

        /**
         * Ho creato una lista di randomNumbers con i numeri specificati dall'esercizio.
         */
        List<Integer> randomNumbers = new ArrayList<>(Arrays.asList(1, 60, 13, 12));

        /**
         * Ho aggiunti divisorsOf52 alla fine di randomNumbers.
         */
        randomNumbers.addAll(divisorsOf52);

        /**
         * Ho printato in console gli elementi di randomNumbers e la lunghezza della lista.
         */
        System.out.println(randomNumbers);
        System.out.println(randomNumbers.size());

        /**
         * Ho creato una nuova lista randomNumbers@ per trovare i duplicati e rimuoverli.
         */
        List<Integer> randomNumbers2 = randomNumbers.stream().distinct().collect(Collectors.toList());

        /**
         * Ho printato in console gli elementi di randomNumbers2 e la lunghezza della lista.
         */
        System.out.println(randomNumbers2);
        System.out.println(randomNumbers2.size());

        /**
         * Ho messo in ordine decrescente i numeri all'interno dlla lista ed ho printato di nuovo gli elementi della
         * lista.
         */
        Collections.sort(randomNumbers2, Collections.reverseOrder());
        System.out.println(randomNumbers2);

    }
}
