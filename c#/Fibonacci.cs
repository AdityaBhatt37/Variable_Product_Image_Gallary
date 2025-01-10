namespace BCA{
    
    using System;
    
    //Fibonacci Series
    
    public class Fibonacci{
        
        public static void Main(String[] arg){
            
            int FirstTerm = 0, SecondTerm = 1, NextTerm = 0,Term;
            
            Console.Write("Enter a Term : ");
            Term = int.Parse(Console.ReadLine());
            
            Console.Write(FirstTerm);
            Console.Write(SecondTerm);
            NextTerm = FirstTerm+SecondTerm;
        
            for(int i = 2; i<Term; i++){
                
                Console.Write(NextTerm);
                FirstTerm = SecondTerm;
                SecondTerm = NextTerm;
                NextTerm = FirstTerm+SecondTerm;
            
                
            }
        }
    }
}