

class Hillstation {
    void location(){
System.out.println("Location is: ");
    }
    void famousfor(){
System.out.println("Famous for: ");
    }
}
 class manali extends Hillstation{
    void location(){
        System.out.println("Location is himachal pradesh ");
            }
            void famousfor(){
        System.out.println("Famous for Snow ");
            }

 }
 class shimla extends Hillstation{
 void location(){
    System.out.println("Location is Jammu Kashmir ");
        }
        void famousfor(){
    System.out.println("Famous for Resorts ");
        }
    }

class daringbadi extends Hillstation{
    void location(){
        System.out.println("Location is Odisha");
            }
            void famousfor(){
        System.out.println("Famous for Light snow and tea ");
            }
        }
 class Polymorphism{
    public static void main(String[] args) {
        Hillstation A = new Hillstation();
        Hillstation B = new manali();
        Hillstation C = new shimla();
        Hillstation D = new daringbadi();

        A.location();
        A.famousfor();
        B.location();
        B.famousfor();
        C.location();
        C.famousfor();
        D.location();
        D.famousfor();
            
    }
 }
 