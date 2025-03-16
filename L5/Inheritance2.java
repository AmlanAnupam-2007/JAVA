class Animal  {
    void eat(){
        System.out.println("Animal is eating!");
    }  
}

class Lion extends Animal{
    void roar(){
        System.out.println("Lion roars!");
    }
}
class Cub extends Lion{
    void weep(){
        System.out.println("Cub is weeping!");
    }
}
public class Inheritance2{
    public static void main(String[] args) {
        Cub obj = new Cub();
        obj.weep();
        obj.eat();
        obj.roar();
    }
}