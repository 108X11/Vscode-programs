/*
* A program to compute for the volume of a cylinder*/

import java.util.Scanner; // Scanner class
public class cylinder{
        public static void main(String[] args){
        /*Scanner input = new Scanner(System.in); //Predefined standard Input Object
        float radius;
        ; // declare height here
        double volume;

        System.out.println("Enter radius:");
        radius = input.nextFloat();
        ; // Statement to enter the height
        height = input.nextFloat();
        volume = // Cylinder Volume Formula
        System.out.println("The volume of the cylinder is: " + volume);*/


    float radius, area, circum;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Radius of Circle: ");
    radius = s.nextFloat();
    
    area = (float)(3.14*radius*radius);
    circum = (float)(2*3.14*radius);


    System.out.println("Area of Circle " +area);
    System.out.println("Circumference of a circle = " +circum);
        }
    }












