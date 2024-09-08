package org.launchcode;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle:");

        Double height = input.nextDouble();

        System.out.println("Enter the width of the rectangle:");

        Double width = input.nextDouble();

        Double area = (width * height);
        System.out.println("Your rectangle has a height of " + height + " and a width of " + width + ". This means the area of your rectangle is " + area + ".");

    }
}
