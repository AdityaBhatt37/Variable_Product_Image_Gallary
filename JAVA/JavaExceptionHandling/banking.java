import java.util.*;

class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String msg){

        System.out.println(msg);
    }

}

public class banking {
    
    public static void main(String argument[]){

        try{

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the amount for withdrawl : ");
            int balance = obj.nextInt();
            insufficientBalance(balance);
        }

        catch(Exception e){

            System.out.println(e);
        }
    }

    public static void insufficientBalance(int bal) throws InsufficientBalanceException{

        if(bal>5000){

            throw new InsufficientBalanceException("Insufficient Balance");
        }

        else{

            System.out.println("Successfully Withdrawled");
        }
    }
}
