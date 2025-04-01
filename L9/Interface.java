interface Myinterface{
    public void method1();
    public void method2();
    
}
class Interface implements Myinterface{
    public void method1(){
        System.out.println("Using method1 here");

    }
    public void method2(){
        System.out.println("Using method2 here");
    }
    public static void main(String[] args) {
        Myinterface obj = new Interface();
        obj.method1();
        obj.method2();
    }
}