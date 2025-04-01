interface Wheels{
    void rotateWheels();
}
interface Engine{
    void V12();
}
class Car implements Wheels,Engine{
    @Override
    public void V12() {
        System.out.println("Car is fast!");

    }
    @Override
    public void rotateWheels() {
        System.out.println("Tyres are nice!!");

    }
}

class multiple_Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.V12();
        myCar.rotateWheels();
    }
    
}
