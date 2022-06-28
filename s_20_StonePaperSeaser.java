package com.company;

import java.util.Random;
import java.util.Scanner;

public class s_20_StonePaperSeaser {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock ,1 for Paper ,2 for Seaser ");
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        // 0 for Rock
        //1 for  Paper
        //2 for seaser
        System.out.println("Enter your choice ");
        int userInput  =sc.nextInt();
        int computerInput =random.nextInt(3);

        //Print the User input
        if(userInput==0) {
            System.out.println("User input is Rock");
        }
        else if(userInput==1)
        {
            System.out.println("User input is Paper");
        }
        else {
            System.out.println("User input is Seaser");
        }


        //Print the ComputerInput
        if(computerInput==0) {
            System.out.println("Computer input is Rock");
        }
        else if(computerInput==1)
        {
            System.out.println("Computer input is Paper");
        }
        else {
            System.out.println("Cpomputer input is Seaser");
        }


        /// code for the game
        if(userInput==computerInput)
        {
            System.out.println("Match Draw");
        }
        else if(userInput ==0 && computerInput==2 || userInput==2 && computerInput==1 ||
                userInput ==1 && computerInput ==0 ) {
            System.out.println("Congratulation ! You won !");
        }

        else{
            System.out.println("opps! Better luck naxt time");
        }







    }
}
