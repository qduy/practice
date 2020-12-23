package Exception_Handling.CustomExeption;

public class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Not valid");
        }
        else {
            System.out.println("welcome");
        }
    }

    public static void main(String[] args) {
       try {
           validate(12);
       }catch (Exception in){
           System.out.println("Exception occured: " + in);
       }
        System.out.println("rest of code....");
    }
}
