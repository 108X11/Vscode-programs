import java.util.*;

public class data{
    public static void main(String []args) {
        

        ArrayList <String> names = new ArrayList<String>(); // Arraylist for holding String

        /*
         * get() geting index or getting value with index if you know
         * add() for adding in arraylist
         * addAll() adding all input arrays 
         * set () use for replacing array
         */

        names.add("Eva");
        names.add("James");
        names.add("Mark");
        names.add("Honey");
        names.add("Mary");

        System.out.println(names);
        System.out.println("The number of elements are: " + names.size());

        List <String> items = Arrays.asList("Money", "Monkey");

        names.addAll(items);

        System.out.println(names);
        System.out.println("The number of elements are: " + names.size());

        String item = names.get(2);

        System.out.println("The item is " + item);

        System.out.println(names);
        int index = names.indexOf("Money");
         if(index < 0){
            System.out.println("Items \"Money\" not found ");
         }else{
            System.out.println("Items \"Money\" found at " + index);
         }

         for(String Name : names){
         System.out.println("Names " + Name);
         }

    }
}