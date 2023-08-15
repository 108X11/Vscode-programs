class ValueStore {

    int Rate; // Variables with standard data types
    int Qty;
    void AssignData(int A, int B) // method definition
    {
    Rate = A; // Assigning the values
    Qty = B;
    }
    int ComputeValue() // Another method to compute value
    {
    int value; // variable definition
    value = Rate * Qty;
    return value;
    }
}



public class OrderValueCompute // Public class
{
public static void main(String[] args) // Execution starts here
    {
        int value1; // variable definition
        int value2;
        ValueStore VS1; // Object VS1 definition
        VS1 = new ValueStore(); // Object VS1 instantiated
        ValueStore VS2; // Object VS2 definition
        VS2 = new ValueStore(); // Object VS2 instantiated
        VS1.AssignData (200,10); // Assigndata method in Object VS1 invoked
        //with values
        value1 = VS1.ComputeValue(); // Computedata method in object VS1
        // invoked
        VS2.AssignData (500,20); // Assigndata method in Object VS2
        // invoked with values
        value2 = VS2.ComputeValue(); // Computedata method in object VS2
        //invoked
        System.out.println("Order value 1 " +value1); // Output 1 displayed
        System.out.println("Order Value 2 " +value2); // Output 2 displayed
    }
}
    
