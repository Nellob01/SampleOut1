package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<ListItem> items = new ArrayList<>();

    public static ListItem createItem (String name, int quantity, String category) {

        if(category.equalsIgnoreCase("shoe")) {
            Shoe s = new Shoe(name, quantity);
            return s;

        }else if(category.equalsIgnoreCase("jeans")) {
            Jeans j = new Jeans(name, quantity);
            return j;

        }else if(category.equalsIgnoreCase("hats")) {
            Hats h = new Hats(name, quantity);
            return h;

        }else if(category.equalsIgnoreCase("socks")) {
            Socks n = new Socks(name, quantity);
            return n;

        }else if(category.equalsIgnoreCase("ties")) {
            Ties t = new Ties(name, quantity);
            return t;
        }
        return null;

    }



    public Main() {
    }

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (ListItem item : items) {
                String checkbox = "[" + item.quantity + "]";

                //System.out.println( i + ". " + item.name + " " + item.category  + checkbox );
                System.out.printf("%d. %s %s %s\n", i, item.name, item.category, checkbox);
                i++;}

            System.out.println("1. Enter item name");
            System.out.println("2. Remove an item");
            System.out.println("3. Edit item quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter item");
                String name = scanner.nextLine();
                System.out.println("Enter quantity");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter category [shoe/jeans/hats/socks/ties]" );
                String category = scanner.nextLine();

                items.add(createItem(name, quantity, category));





            } else if (option.equals("2")) {
                System.out.println("Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());

                items.remove(itemNum - 1);

            } else if(option.equals("3")) {

                System.out.println("Choose the item you want to edit");
                int itemNum = Integer.parseInt(scanner.nextLine());
                System.out.println("What would you like to edit quantity to?...");
                int number = Integer.parseInt(scanner.nextLine());

                ListItem item = items.get(itemNum - 1);
                item.quantity = number;

            }

        }
    }
}







