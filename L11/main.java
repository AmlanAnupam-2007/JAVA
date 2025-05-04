import java.util.*;

class main{
    public static void main(String[]args){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("Tiger");
        animals.add("Zebra");
        System.out.println("Printing the list of items: ");
        System.out.println(animals);
        animals.clear();
        System.out.println("Empty Array  :"  +animals);
        if (animals.isEmpty()){
            System.out.println("Array is empty");
        }
        else{
            System.out.println("Array is not empty"):
        
        }
        animals.add("Gorilla");
        animals.add("Crocodile");
        System.out,println("The size of Array is: " +animals.size());
        System.out,println(animals.remove(1));
        System.out.println(animals);
    }
}