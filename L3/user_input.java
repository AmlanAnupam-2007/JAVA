import java.util.Scanner;
public class user_input {
    public static void main (String args[]){
      Scanner sc =  new Scanner(System.in);
      String b = sc.nextLine();//String has the highest priority in java thus it'll come before int and double
      int a = sc.nextInt();
      Double c = sc.nextDouble();
      System.out.println("Hey user! your lucky number is: "+a+" and your name is " +b+" your account number is: " +c);



    }
}
