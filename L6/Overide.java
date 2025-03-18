class Parent{
    public void Display(){
        System.out.println("Hello from Parent!");
        
    }
}
class Child extends Parent{
    @Override // this overides tha data
    public void Display(){
        System.out.println("Hello from Child!");
    }
}

public class Overide {
    public static void main(String[] args) {
        Parent P1 = new Child();
        P1.Display();
        Parent P = new Parent();
        P.Display();
    }
    
}
