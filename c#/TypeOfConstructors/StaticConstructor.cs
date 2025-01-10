
namespace BCA{
        using System;
public class StaticConstructor{
    


    static StaticConstructor()
    {

    Console.WriteLine("I am static constructor");

    }
    
    public static void print(){
        
        Console.WriteLine("I am User define method below the sttaic Constructor");
    }

    public static void Main(string[] args)
    {

    Console.WriteLine("I am string writen inside the Main method above print() method ");
    
    StaticConstructor.print();
        
    }
}
}