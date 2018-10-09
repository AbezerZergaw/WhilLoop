package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


    }

    private static ArrayList<Item> getUserInput() {
        Scanner input = new Scanner(System.in);

        String name, catagory, quit;
        int itemID;
        boolean isFound;

        ArrayList<Item> lostFound = new ArrayList<>();
        System.out.println("Lost and found items");


        do {
            // Create new item
            Item item = new Item();
            System.out.println("Enter item ID");
            itemID = input.nextInt();

            System.out.println("Enter item Name");
            name = input.nextLine();

            System.out.println("Enter item Category");
            catagory = input.nextLine();

            System.out.println("Item found? true/false");
          //  item.setFound();
            isFound = input.nextBoolean();



            item = new Item(itemID, name, catagory, isFound);

            lostFound.add(item);

            System.out.println("Do you want to add more item? Yes/No");

            quit = input.nextLine();
            System.out.println();


        } while (quit.equalsIgnoreCase("Yes"));
        return lostFound;

    }
}