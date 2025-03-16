class Mammals{
    void mam(){
        System.out.println("This is mammal parent class!");
}
}

class Human extends Mammals{
    void hum(){
        System.out.println("Extended from mammal!");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Extended from mammal!");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.roar();
       Human obj1 = new Human();
       obj1.hum();
    }

    
}
