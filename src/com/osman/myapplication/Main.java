package com.osman.myapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Global var
    final static int Id = 5;
    static String Name = "Ahmed";
    static double Balance = 2000.88;
    final static long Account = 8889;
    final static int Password = 9900;
    static ArrayList<Transaction> transactions;
    static Scanner Input = new Scanner(System.in);

    // Main method of the application
    public static void main(String[] args) {
        welcome(0,"");
        signIn();
    }
    static void welcome(int ch,String username) {
        if(ch == 1){
            System.out.println("--------------");
            System.out.println("-Welcome "+ username +"-");
            System.out.println("--------------");
            createTransactions();
            menu();
        }else{
            System.out.println("--------------");
            System.out.println("-Welcome Sir/Madam-");
            System.out.println("--------------");
        }
    }

    private static void createTransactions() {
        transactions = new ArrayList<>();
        transactions.add(new Transaction(2,"Salax Ali",20.8,229333));
        transactions.add(new Transaction(5,"Omar Abdi",90,228990));
        transactions.add(new Transaction(2,"Salax Ali",20.8,229338));

    }

    private static void signIn() {
        // Display message
        System.out.println("Please enter your credentials");
        System.out.print("password: ");
        int pass = Input.nextInt();
        // Check Password
        if(pass == Password){
            welcome(1, Name);
        }else {
            System.out.println("Sorry, Wrong credentials");
        }
    }

    private static void menu() {

        System.out.println("1. Balance");
        System.out.println("2. Transactions");
        System.out.println("3. Transfer Amount");
        System.out.println("0. END Session");
        System.out.print("Choose operation: ");

        int ch = Input.nextInt();

        switch (ch) {
            case 1 -> showBalance();
            case 2 -> transactions();
            case 0 -> endSession();
        }
    }

    private static void endSession() {
        System.out.println("-------------");
        System.out.println("Thank you, Goodbye");
        System.out.println("-------------");
    }

    private static void transactions() {

        for (Transaction transaction: transactions){
            System.out.println("You've sent "
                                + transaction.FullName
                                +  " an amount of  " + transaction.amount
                                + " with reference of " + transaction.ref);
        }
        System.out.println("-----------------");
        menu();
    }

    private static void showBalance() {
        System.out.println("Your balance is:" + Balance);
        System.out.println("------------------");
        menu();
    }
}
