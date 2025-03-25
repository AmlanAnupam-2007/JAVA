class Parent {
    protected void protect(){
        System.out.println("I am inside the protected method!");
    }
    
}
class child extends Parent{
    private void privateMethod(){
        System.out.println("I am inside Private Method!");
    }
}
class access{
    public static void main(String[] args) {
        child Kid = new child();
        //Kid.privateMethod();
        Kid.protect();
    }
}