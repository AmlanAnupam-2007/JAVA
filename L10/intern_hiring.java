class NotEligibleException extends Exception{
    public NotEligibleException (String message){
        super(message);
    }
}
class InternHiring{
    public static void checkEligibility(int age, double cgpa) throws NotEligibleException{
        if (age<18|| cgpa<7.0){
            throw new NotEligibleException("Not eligible for intership: Age must 18+ and CGPA 7");
        }
        System.out.println("Eligible for intership!");
    }
    public static void main(String[] args){
        try {
            checkEligibility(19, 8);
            
        }
        catch(NotEligibleException e){//e is the object of the noteligibilityexception
            System.out.println("Execption: "+e.getMessage());

        }
        }


    }














public class intern_hiring {
    
}
