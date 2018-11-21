package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double amount = 0;
        double deposit = 0;
        double balance = 0;

        System.out.println("Enter your initial amount: ");
        amount = input.nextDouble();

        balance = amountMoney(amount, deposit);


        System.out.println("Your final amount is: " + balance);

    }

    private static double amountMoney(double amount, double deposit) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {

            System.out.println("How much money would you like to deposit?");
            deposit = input.nextDouble();

            deposit = interestMoney(deposit,10.0);
            amount = amount + deposit;

            System.out.println("Your new balance is: " + amount);

        }
        return amount;
    }

    private static double interestMoney(double amount, double rate) {

        return (rate / 100 + 1) * amount;


    }

    }



