import java.util.*;
public class grade_system {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    if (marks>=90){
        System.out.println("Outstanding!");
    }
    else if (marks>=70){
        System.out.println("Awesome!");
    }
    else if (marks>=50){
        System.out.println("Nice");
    }
    else if (marks>=30){
        System.out.println("Okay!");
    }
    else if (marks>=20){
        System.out.println("Try harder!");
    }
    else  {
        System.out.println("Try again!");
    }
}
}