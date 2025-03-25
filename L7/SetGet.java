class Student{
private String name;
public String getName(){
return name;
}
public void setName(String name){
    this.name = name;
}
}
class Main{
    public static void main(String[] args) {
        Student S = new Student();
        S.setName("Amlan");
        System.out.println(S.getName());
    }
}