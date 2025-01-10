//WHAT IS EXCEPTION HANDLING IN JAVA

/*
 * What is the Exception -> Any unwanted or unexpted event that may interupt the normal flow of program 
 *                          is called exception.
 * so, Exception Handling is the mechanism in which if there is any chance of rising any exception
 * then we can give any alternative way to all program so that our program should have graceful termination.
 * IN java Exception is an object.
 * 
 * 
 * 
 * Hierarchy of Java Exception classes
 * The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: 
 * Exception and Error. The hierarchy of Java Exception classes is given below:
 * 
 * https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png
 * 
 * 
 * Types of Java Exceptions: In java their is 2 types of exception.
 * 1->CHECKED EXCEPTION -:
 *    Checked Exception are those exception which directly inherit the Throwable class except
 *    Runtime Exception and Error.
 *    Checked Exception are checkd at compile time or checked by compiler.
 * 
 * ->If there is a chnace of rising any checked exception in the program than compulsory 
 *   we have to perform exeption Handling other wise we will get compile time error.
 * 
 *    Ex->SQLException,ClassNotFoundException,IOException
 * 
 * 
 * 2->UNCHECKED EXCEPTION -:
 *    Unchecked exeption are those exception which are not checked by the compiler.
 *    they are checked at the runtime so, called runtime exeption.
 *    
 *    Ex->ArithmeticException, IndexOutOfBoundException, NumberFormatException, NullPointerException.
 *     
 * 
 * 
 * 
 */


 //BELOW IS THE EXAMPLE OF ALL UNCHECKED EXEPTION : 
 
 import java.util.*;
class BasicsOfJavaException{

    public static void main(String[] arguments){

        //ArithmeticException -> divide a number by 0.
        try{

            Scanner obj = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int a = obj.nextInt();

            System.out.print("Enter second number : ");
            int b = obj.nextInt();

            System.out.println("The division of two number is : "+(a/b));
        }

        catch(ArithmeticException e){

            System.out.println("you are dividing number with 0");
        }

        //IndexOutOfBoundsException -> accessing the access length of array.

         try{

            int arr[] = {1,2,3,4,5};

            System.out.println(arr[6]);
         }

         catch(IndexOutOfBoundsException e){

            System.out.println("accessing the over length from an array : ");
         }
        


         //NullPointerException -> Trying to perform any operation on null assigned variable.

         try{

            String x = null;

            System.out.println("The length of x is : "+ x.length());

         }

         catch(NullPointerException e){

            System.out.println("You are printing a null assign string");
         }


         //NumberFormatException -> when we are trying to convert the sting value in integer

         try{
          String n = "abc";

          int i = Integer.parseInt(n);
          
         }

         catch(NumberFormatException e){

            System.out.println("you are trying to convert sting into integer");
         }
    }
}