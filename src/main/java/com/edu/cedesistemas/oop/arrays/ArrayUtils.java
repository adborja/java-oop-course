package com.edu.cedesistemas.oop.arrays;

import java.util.ArrayList;
import java.util.List;

public final class ArrayUtils {
    private ArrayUtils() {}

    // Lesson 2 - - arrays
    public static void bubbleSort(Integer[] array) {
        boolean swapped = true;
        int i= 0;
        int tmp = 0;

        while (swapped) {
            swapped = false;
            i++;
            for (i = 0; i < array.length; i++){
                if (array[i] > array[i + 1]){
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }

    // Lesson 2 -- ArrayList
    public static Integer sum(List<Integer> list) {
            int i = 0;
            int sum = 0;
            for(i=1; i<=list.length; i++){

            }
        return 0;
    }

    // Lesson 2 -- ArrayList
    public static List<Integer> getPrimeNumbers(int limit) {
        ArrayList<Integer> listaresultado = new ArrayList<>();
        int i = 0;
        int num = 0;
        for (i = 1; i <= limit; i++){
            int counter = 0;
            for(num = i; num >= 1; num--){
                if (i%num == 0){
                    counter = counter +1;
                }
            }
            if (counter == 2){
                listaresultado.add(i);
            }
        }
        return listaresultado;
    }

    // Lesson 2 - arrays
    public static int max(Integer[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = max;
            for (int j = i+1; j<array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
        }
        return max;
    }

    // Lesson 2 -- ArrayList
    public static boolean contains(String element, List<String> list) {
        for (String e : list) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Lesson 2 -- ArrayList
    public static void join(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : l2) {
            l1.add(i);
        }
    }

    // Lesson 2 -- ArrayList
    public static List<Integer> getOddNumbers(int limit) {
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            if (i % 2 != 0) {
                odds.add(i);
            }
        }
        return odds;
    }
}