package com.example.puppys;

import java.util.Scanner;

public class K9 {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner keyboard = new Scanner(System.in);

        String answer = " ";

        PitBull zilla = new PitBull();


        do {


            System.out.println("What color is your pit ? : ");
            zilla.setColor(keyboard.nextLine());

            System.out.println("What is your pits bloodline ? : ");
            zilla.setBloodLine(keyboard.nextLine());

            System.out.println("Who bred your pit ? : ");
            zilla.setBreeder(keyboard.nextLine());

            System.out.println("Is your pit blue ? : (Y/N)");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {

                System.out.println("So is mine!!!! ");

                stop = true;
            }
        }while (!stop);

    }
            }

