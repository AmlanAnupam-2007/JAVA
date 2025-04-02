import java.util.Scanner;
 
public class Exceptions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{// this block hold the part on which we are not sure whether it can create error or not
            System.out.println("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println(x+"/"+y+"="+z);

        }
        catch(ArithmeticException ex){// this block showcase the type of error that is occuring and then helps us recognize it and correct it
            System.out.println("--- catch block ---");
            System.out.println(ex.toString());//converts the answer into string value for us to read
        }
        finally{//this is an universal block which does'nt care if the error will come or not and will surely run.
            System.out.println("--- final block ---");
            System.out.println("It will surely run!!");
            sc.close();
        }
        System.out.println("--- Done ---");
    }


}