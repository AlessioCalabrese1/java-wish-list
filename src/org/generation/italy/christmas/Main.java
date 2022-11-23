package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        List<String> wishList = new ArrayList<>();
        boolean sentinel = true;

        while (sentinel) {
            System.out.println("La wish list ha " + wishList.size() + " elementi al suo interno!");
            System.out.println("Si desidera inserire un nuovo elemento? (y/n)");
            String choice = sn.next();
            if (choice.equals("y")) {
                System.out.println("Inserire il nuovo elemento nella lista:");
                wishList.add(sn.next());
                System.out.println("-------------------------------------");
            }else if(choice.equals("n")){
                System.out.println("La lista è stata salavata con successo, arrivederci!");
                System.out.println("La lista risultante è:");
                wishList.sort(null);
                System.out.println(wishList);
                sentinel = false;
            }else{
                System.out.println("Il valore inserito non è corretto! Riprovare");
                System.out.println("-------------------------------------");
            }
        }
    }
}
