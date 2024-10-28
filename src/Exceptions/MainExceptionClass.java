package Exceptions;

public class MainExceptionClass {
    public static void main(String[] args) throws InvalidAgeException {

        int age = 20;


            if(age < 28)
                throw new InvalidAgeException("Age is Less than 20");


    }
}
