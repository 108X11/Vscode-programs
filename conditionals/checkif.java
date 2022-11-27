public class checkif {
    public static void main(String []args) {
        
        int x = 25, y = 10;
        float z = 4.0f, d = 3.1f;

        System.out.println(z > x + y || d == 3.9);
        System.out.println((y==10 || y==0) && (x != y || !(y ==0)));
    }
}
