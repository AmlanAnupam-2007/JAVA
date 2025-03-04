class Employee{
    int empl_No;
    String name;
    float sal;

    Employee(){
    System.out.println("Details of the Employee");
    empl_No = 1234;
    name =  "Amlan";
    sal = 2345f;


    }

}
class main{
    public static void main(String[] args) {
        Employee empl = new Employee();
        Employee empl2 = new Employee();
        Employee empl3 = new Employee();

        System.out.println(empl.empl_No+" "+empl2.empl_No+" "+empl3.empl_No+" ");
        System.out.println(empl.name+" "+empl2.name+" "+empl3.name+" ");
        System.out.println(empl.sal+" "+empl2.sal+" "+empl3.sal+" ");
    }


}