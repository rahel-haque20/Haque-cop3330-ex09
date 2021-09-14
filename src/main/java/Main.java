/*
* UCF COP 3330 Fall 2021 Assignment 9 Solution
* Copyright 2021 Rahel Haque
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int gallon = 350;

        System.out.println("Please enter the length of ceiling");
        Scanner measure = new Scanner(System.in);
        int length = measure.nextInt();

        System.out.println("Please enter the width of ceiling");
        int width = measure.nextInt();

        int area = length*width;

        int estimate = area/gallon;

        if((area%gallon)!=0)
            estimate+=1;

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", estimate, area);

    }
}