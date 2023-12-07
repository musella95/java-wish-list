package org.lessons.gift;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> gift = new HashSet<>();
        Boolean continua = true;
        while (continua){
            System.out.println("inserisci regalo");
            String regalo = scanner.nextLine();
            if (!gift.contains(regalo)) {
                gift.add(regalo);
                System.out.println("il regalo è stato aggiunto alla lista");
                System.out.println("la lista completa è: " + gift.size());
                System.out.println("vuoi aggiungere un'altro regalo? y/n");
                String risposta = scanner.nextLine().toLowerCase();
                continua =risposta.equals("y");
            }
            else{
                System.out.println("già hai inserito questo regalo");
            }
            System.out.println("la lista dei regali è questa: "+ gift);
        }





        scanner.close();
    }
}
