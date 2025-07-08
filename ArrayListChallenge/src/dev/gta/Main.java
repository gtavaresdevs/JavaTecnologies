package dev.gta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    // Scanner para capturar entrada do usuário
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true; // Controla a execução do loop principal
        ArrayList<String> groceries = new ArrayList<>(); // Lista de compras

        while (flag) {
            printActions(); // Exibe as opções para o usuário

            switch (Integer.parseInt(scanner.nextLine())) { // Lê a entrada do usuário e converte para inteiro
                case 1 -> addItems(groceries); // Chama método para adicionar itens
                case 2 -> removeItems(groceries); // Chama método para remover itens
                default -> flag = false; // Qualquer outra entrada encerra o loop
            }

            // Ordena a lista de compras em ordem alfabética
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries); // Exibe a lista atualizada
        }
    }

    // Método para adicionar itens à lista de compras
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(","); // Divide a entrada em um array de strings

        for (String i : items) {
            String trimmed = i.trim(); // Remove espaços extras
            if (groceries.indexOf(trimmed) < 0) { // Evita adicionar duplicatas
                groceries.add(trimmed);
            }
        }
    }

    // Método para remover itens da lista de compras
    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim(); // Remove espaços extras
            groceries.remove(trimmed); // Remove o item da lista se existir
        }
    }

    // Método para exibir as opções disponíveis
    private static void printActions() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}

