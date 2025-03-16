public class This {
    int age;
    This(int age){
       this.age = age;
    }
    public static void main(String[] args) {
        This obj =  new This(18);
        System.out.println(obj.age);
    }
}
