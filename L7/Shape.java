class Shape1{
    public double getArea(){
        return 0;
    }
    
}

class Triangle extends Shape1{
private double base;
private double height;

public Triangle( double base, double height){
    this.base = base;
    this.height = height;
}
public double getArea(){
    return 0.5*base*height;
}
}
class Square extends Shape1{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
}
class Shape{
    public static void main(String[] args) {
        Shape1[] shape = new Shape1[2];
        shape[0] = new Square(4);
        shape[1] = new Triangle(3,4);
        System.out.println("Area of the Triangle is "+shape[1].getArea());
        System.out.println("Area of the Square is "+shape[0].getArea());
    }
}












