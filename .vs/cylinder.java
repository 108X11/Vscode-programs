/*
* A program to compute for the volume of a cylinder*/

import java.util.Scanner; // Scanner class
public class cylinder{
        public static void main(String[] args){
<<<<<<< HEAD
            Scanner input = new Scanner(System.in);   //   
            float radius; 
            float height;          
=======
            Scanner input = new Scanner(System.in);   //Predefined standard Input Object    
            float radius; 
            float height;          // declare height here    
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70
            double volume; 
        
            System.out.println("Enter radius:");    
            radius = input.nextFloat(); 
        
           System.out.println("Enter height:");       // Statement to enter the height    
            height = input.nextFloat();    
            volume = 3.14*(radius*radius)*height;        // Cylinder Volume Formula 
            System.out.println("The volume of the cylinder is: " + volume);
        


    /*float radius, area, circum;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Radius of Circle: ");
    radius = s.nextFloat();
    
    area = (float)(3.14*radius*radius);
    circum = (float)(2*3.14*radius);


    System.out.println("Area of Circle " +area);
    System.out.println("Circumference of a circle = " +circum);*/
        }
    }












