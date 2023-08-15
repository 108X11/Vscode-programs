

public class asess2 {


    static final String ALPHABET[] = {" ","A","B","C","D","E","F","G","H","I","J","K","L",
        "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};//final == constant,
    public static void main(String[] args) {
        String []inputs={"1815212212215022321521821214","19021221522215021621821517218112132131921417"};//sample input given
        String output="";
        
        
        System.out.println("INPUT:");
        for(String input:inputs)
        {
            System.out.println(input);
        }
        System.out.println("OUTPUT");
        
        
        for(int i=0;i < inputs.length;i++)
        {
            while(inputs[i].length()>0)// di magtatapos ang loop kung di mauubos ang string!
            {
                try// trying something with the block of code kung meron mang error ayy diretso agad sa catch
                {

                    if(inputs[i].substring(0,1).equals("0"))//zero will automatically a space 
                    {
                        output+=ALPHABET[Integer.parseInt(inputs[i].substring(0,1))];
                        inputs[i] =inputs[i].substring(1,inputs[i].length());// output will be updated
                        continue;
                    }
                    if(isDoubleDigit(inputs[i].substring(0, 1)))//Checking the 1st index selected if is a double digit
                    {
                        output+=ALPHABET[Integer.parseInt(inputs[i].substring(1,3))];// output will be updated
                        inputs[i] =inputs[i].substring(3,inputs[i].length());//removing the 1st 3 index of the string
                    }
                    else//this will be executed if false. Not double digit
                    {
                        output+=ALPHABET[Integer.parseInt(inputs[i].substring(1,2))];// output will be updated
                        inputs[i] =inputs[i].substring(2,inputs[i].length());//removing the 1st 2 index of the string 
                    }
                
                }catch(Exception e)//handling error!
                {
                    System.err.println("Unknown Error");
                }
            
                
            }
            System.out.println(output);//finish product
            output="";//reset output
        }
    }
    static boolean isDoubleDigit(String substring)// returning a a boolean value(tama or mali)
    {
        return Integer.parseInt(substring)==2;//return a true if the digit is equal to 2
    }
    

}
