namespace BCa{
    
    using System;
    public class Fibonacci{
        
        public static void Main(String[] args){
            
            int n1=0, n2 = 1, n3, number, i;
            Console.Write("Enter a Fibonacci number : ");
            number = int.Parse(Console.ReadLine());
            
            Console.Write(n1+" "+n2+" ");
            for(i=2; i<number; i++){
                
                n3 = n1+n2;
                Console.Write(n3+" ");
                n1=n2;
                n2=n3;
                
            }
            
        }
    }
}