package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LostAndFound {
    static Scanner input = new Scanner(System.in);

    static List<Item> myItems = new ArrayList<>();

    public static void main(String[] args) {
        String opiton;
       /*  List<Item> myItems;
        myItems = new ArrayList<>();*/
        int menu = 0;

        Item items = new Item();
        items.setItemID(1234);
        items.setName("Hat");
        items.setCategory("Cloth");
        items.setFound(false);
        myItems.add(items);

        Item items1 = new Item();
        items1.setItemID(4456);
        items1.setName("Iphone");
        items1.setCategory("Phone");
        items.setFound(false);
        myItems.add(items1);
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to Lost and Found. Please choose what you want to do" +
                "\n 1.Add item \n 2.Show items \n 3.Delete found items \n 4.Undone deleted items ");

        int menuList = input.nextInt();
        input.nextLine();

        if (menuList == 1) {

            addItem();

        } else if (menuList == 2) {
            showItem();
        } else if(menuList==3)
            System.out.println("Thank you");
    }


    public static void addItem() {
        Item items = new Item();
        System.out.println("Enter item ID");
        int itemID = input.nextInt();
        input.nextLine();
        items.setItemID(itemID);
        System.out.println("Enter item Name");
        String name = input.nextLine();
        items.setName(name);
        System.out.println("Enter item Category");
        String category = input.nextLine();
        items.setCategory(category);
        System.out.println("Item found? true/false");
        boolean found =input.nextBoolean();
        items.setFound(found);
        myItems.add(items);
        mainMenu();
        // System.out.println("Do you want to add more item? Yes/No");

    }

    public static void showItem() {
        for (Item eachItem : myItems) {

            System.out.println("Name; " + eachItem.getName() + "\n" +
                    "Category: " + eachItem.getCategory() +
                    "\n" + "ItemID: " + eachItem.getItemID()+
                   "\n" +"IsLost: "+eachItem.isFound()+"\n");
        }
        mainMenu();

    }
  /*  public static void deletItem(){

        System.out.println("Which item you want to delete? Enter item ID\r");


        for (Item eachItem : myItems) {
            System.out.println("Name; " + eachItem.getName() + "\n" + "Category: " + eachItem.getCategory() + "\n" + "ItemID: " + eachItem.getItemID());
        }
        int removeID = input.nextInt();
        input.nextInt();


    }*/

}
