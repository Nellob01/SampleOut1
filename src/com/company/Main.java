package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<ListItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (ListItem item : items) {
                String checkbox = "[" + item.number + "]";


                System.out.println( i + ". " + item.text  + checkbox );
                i++; }

            System.out.println("1. Enter item name");
            System.out.println("2. Remove an item");
            System.out.println("3. Edit item quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter item");
                String text = scanner.nextLine();

                ListItem item = new ListItem(text, 0);
                items.add(item);



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
                item.number = number;

            }

        }
    }
}







