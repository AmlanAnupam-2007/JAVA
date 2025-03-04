public class Static {
   static int num = 2;
    void increment(){
        num = num+1;
    }
    
public static void main(String[] args) {
    Static obj1 = new Static();
    Static obj2 = new Static();
    Static obj3 = new Static();

    obj1.increment();
    obj2.increment();
    obj3.increment();

    System.out.println(obj1.num);
    System.out.println(obj2.num);
    System.out.println(obj3.num);
}
}
