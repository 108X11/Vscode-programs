// Sample program to demonstrate Interfaces
interface Intface // Interface is defined
{ // It has its own data type
  public void dayname(); // Abstract method within the interface
}

class day1 implements Intface { // Class interacts through
  public void dayname() // interface implementation
  { // (each class is a variable for interface)
    System.out.println("Monday");
  }
}

class day2 implements Intface { // Another class
  public void dayname() {
    System.out.println("Tuesday");
  }
}

class day3 implements Intface { // Another class
  public void dayname() {
    System.out.println("Wednesday");
  }
}

public class subject { // Execution starts here
  public static void main(String[] args) {
    Intface t = new day1(); // Object of day1 class thru interface
    t.dayname(); // method invoked
    Intface tx = new day2(); // Object of day2 class thru interface
    tx.dayname();
  }
}