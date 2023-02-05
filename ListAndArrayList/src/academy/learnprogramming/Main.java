package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static GloceryList gloceryList = new GloceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    gloceryList.printGloceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                default:
                    quit = true;
                    break;
            }
        }
        scanner.close();
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of glocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t Other - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the glocery item: ");
        gloceryList.addGloceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter current item: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        gloceryList.modifyGloceryItem(currentItem,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter replacement item: ");
        String itemNo = scanner.nextLine();
        gloceryList.removeGloceryItem(itemNo);
    }

    public static void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(gloceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our glocery list");
        }else{
            System.out.println(searchItem + " is not found in the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList <String> newArray = new ArrayList<String>();
        newArray.addAll(gloceryList.getGloceryList());


        ArrayList<String> nextArray = new ArrayList<String>(gloceryList.getGloceryList());

        String [] myArray = new String[gloceryList.getGloceryList().size()];
        myArray = gloceryList.getGloceryList().toArray(myArray);
    }

}
