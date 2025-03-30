abstract class Objects{
    void Shape(){
        System.out.println("In the abstract class this is non abstract method");
    }
abstract void showShape();
}
class Sphere extends Objects{
    void showShape(){
        System.out.println("This is a Sphere.");
    }
}
class Cube extends Objects{
    void showShape(){
        System.out.println("This is a Cube.");
    }
}
class Cuboid extends Objects{
    void showShape(){
        System.out.println("This is a Cuboid.");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Objects obj = new Sphere();
        obj.showShape();
        obj = new Cube();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj.Shape();//non abstract method being called
    }
}
