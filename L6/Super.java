class SuperClass{
    int roll = 2;
}

class Subclass extends SuperClass{
    int roll = 3;
    void Display(){
    System.out.println(roll);
    System.out.println(super.roll);
    }
}

public class Super {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.Display();
    }
    
}
