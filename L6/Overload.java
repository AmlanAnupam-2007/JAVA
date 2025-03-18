class Student{
    int roll;
    String name;
    int redg_no;

    Student(){}//DEFAULT CONSTRUCTOR(doesnt take any parameters)

    Student(int roll,String name,int redg_no){
        this.roll = roll;
        this.name = name;
        this.redg_no = redg_no;
    }
    Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
    
    void displayDetails(){
        System.out.println("Your name is: " +this.name+" and your roll no. is: " +this.roll + " and your redg no. is: " +this.redg_no);
    } 
}

class Overload{
    public static void main(String[] args) {
        Student S1= new Student();//this cannot have any value as this is for the default constructor
        Student S2= new Student(2,"Amlan",24101);
        Student S3= new Student(3,"Anupam");

        S1.displayDetails();
        S2.displayDetails();
        S3.displayDetails();


}
}
