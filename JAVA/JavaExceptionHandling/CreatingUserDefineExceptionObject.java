 class invalidException extends Exception{

    invalidException(String msg){
        System.out.println(msg);
    }

 }

 class CreatingUserDefineExceptionObject {
    
    public static void main(String[] arguments){

        try{
        validate(13);
        }
        catch(Exception e){

            System.out.println(e);
        }
        
    }

  public static void validate(int age) throws invalidException{

        if(age<18){

            throw new invalidException("Not able to vote");
        }
        else{

            System.out.println("Able to vote");
        }
    }

}
