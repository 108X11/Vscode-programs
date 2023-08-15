import java.util.Scanner;

public class compVol {

    /* Program  Volume of Cylinder */ 

      public static void main(String args[]){   

      Scanner s = new Scanner(System.in);       
      
      System.out.println("Enter the radius:");       
      double radius=s.nextDouble(); 
      System.out.println("Enter the height:");       
      double height=s.nextDouble(); 
         
      System.out.println("Volume Of  Cylinder is:" + computeVol(radius,height)); 
      } 
      public static double computeVol(double radius,double height){          
        double vol=3.1416*radius*radius*height; 
       return vol;  
        }   
}

