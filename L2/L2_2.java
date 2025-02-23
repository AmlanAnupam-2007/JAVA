public class L2_2 {
    public static void main(String[]args){
        int a = 2;
        int b = 3;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(a+b+"!=5 as new value is assigned.");
        int equn = ++a + b++; //a++ is post-increment ++b is pre-increment
        System.out.println(equn);
        int large = (a>b)?a:b;
        System.out.println(large);



    }
}
