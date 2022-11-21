public class flowchart {
    public static void main(String []args){

        int x = 5, y = 2, z = 3;

        if(x > y){
            if(x > z){
                System.out.println(x);
            }else{
                System.out.println(z);
            }
        }else{
            if(y > z){
                System.out.println(y);
            }else{
                System.out.println(z);
            }
        }
    }
}
