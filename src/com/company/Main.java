package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(2);
        int points = 10;

        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("green");
        colours.add("red");

        while (points > -1) {
            System.out.println("whats the next counter going to be?");
            String nextCounter = colours.get(rand.nextInt());
            String guess = input.next();
            System.out.println(nextCounter);
            System.out.println(guess);
        }
    }
}
