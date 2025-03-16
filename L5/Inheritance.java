class parent
{
   int age;
   int roll;
   String name;
   void naming(String name,int roll) {
    System.out.println("Name: "+name+"Roll no: "+roll);
   }
}

class child extends parent //extends keyword to inherit the parent class
{
    void aging(int age)
    {
        System.out.println("Age of the child is: "+age);
    }
}
class Inheritance
{
    public static void main(String[] args) {
        child C = new child();
        C.aging(14);
        C.naming("Amlan Anupam",12);


    }
}