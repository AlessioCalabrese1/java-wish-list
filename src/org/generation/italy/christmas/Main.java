package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    //Con l'interfaccia Comparator possiamo comparae degli elementi quando ci viene chiesto negli appositi metodi delle collezioni
    public static class StringComparator implements Comparator<String>{

        //Effettuiamo l'ovveride del metodo compare che ci permette di ordinare la collezione in base alle condizioni che inseriamo nel corpo
        @Override
        public int compare(String o1, String o2) {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < o1.length(); i++) {
                if (o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o' || o1.charAt(i) == 'u' ||
                o1.charAt(i) == 'A' || o1.charAt(i) == 'E' || o1.charAt(i) == 'I' || o1.charAt(i) == 'O' || o1.charAt(i) == 'U') {
                    count1++;
                }
            }
            for (int i = 0; i < o2.length(); i++) {
                if (o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o' || o2.charAt(i) == 'u' ||
                o2.charAt(i) == 'A' || o2.charAt(i) == 'E' || o2.charAt(i) == 'I' || o2.charAt(i) == 'O' || o2.charAt(i) == 'U') {
                    count2++;
                }
            }

            // System.err.println("Count 1 è pari ad: " + o1);
            // System.err.println("Count 2 è apri ad: " + o2);
            // if (count1 < count2) {
            //     return 1;
            // }else if(count2 > count1){
            //     return -1;
            // }
            // return 0;
            
            //il riordinamento avviene in base al return del metodo compare, se il return è > 0 allora il secondo eleemnto 
            //avrà la precedenza(ordinamento in ordine decrescente), se 
            //è < di zero il primo elemento avrà la precedenza (ordinamento in ordine crescente), se è = a 0 non hanno precedenza
            return count2 - count1;
        }
    }
    public static void main(String[] args) {
        // Scanner sn = new Scanner(System.in);
        // List<String> wishList = new ArrayList<>();
        // boolean sentinel = true;

        // while (sentinel) {
        //     System.out.println("La wish list ha " + wishList.size() + " elementi al suo interno!");
        //     System.out.println("Si desidera inserire un nuovo elemento? (y/n)");
        //     String choice = sn.next();
        //     if (choice.equals("y")) {
        //         System.out.println("Inserire il nuovo elemento nella lista:");
        //         wishList.add(sn.next());
        //         System.out.println("-------------------------------------");
        //     }else if(choice.equals("n")){
        //         System.out.println("La lista è stata salavata con successo, arrivederci!");
        //         System.out.println("La lista risultante è:");
        //         wishList.sort(null);
        //         System.out.println(wishList);
        //         sentinel = false;
        //         System.out.println();
        //         System.out.println("La lista ordinata per numero di vocali all'interno degli elemennti è uguale ad:");
        //         wishList.sort(new StringComparator());
        //         System.out.println(wishList);
        //     }else{
        //         System.out.println("Il valore inserito non è corretto! Riprovare");
        //         System.out.println("-------------------------------------");
        //     }
        // }


        //-------------------------------------------------------------------------------

        Scanner sn = new Scanner(System.in);
        System.out.println("Inserire una stringa di caratteri:");
        String str = sn.next();
        System.out.println(str);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            String[] explode = str.split("");
            set.add(explode[i]);
        }
        str = String.join("", set);
        System.out.println("La stringa senza caratteri doppioni è: " + str);

        List<String> strList = new ArrayList<>();
        String[] explode = str.split("");
        for (int i = 0; i < explode.length; i++) {
            strList.add(explode[i]);
        }
        strList.sort(null);
        System.out.println("La stringa senza caratteri doppioni in ordine alfabetico è: " + strList);

        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < explode.length; i++) {
            if (map.containsKey(explode[i])) {
                map.put(explode[i], map.get(explode[i]) + 1);
            }else{
                map.put(explode[i], 1);
            }
        }
        System.out.println("La mappatura dei singoli caratteri è apri ad: " + map);
    }
}
