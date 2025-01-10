namespace BCA{
    
    using System;
    
    public class Arithmatic{
        
        public static void Main(String[] arg){
            
            int n1,n2,result;
            
            Console.Write("Enter n1 : ");
            n1 = int.Parse(Console.ReadLine());
            
            Console.Write("Enter n2 : ");
            n2 = int.Parse(Console.ReadLine());
            
            result = n1+n2;
            
            Console.WriteLine("The sum of numbers is : "+result);
            
            result = n1-n2;
             Console.WriteLine("The subtraction of numbers is : "+result);
            
            result = n1*n2;
             Console.WriteLine("The multiplication of numbers is : "+result);
            
            result = n1/n2;
             Console.WriteLine("The division of numbers is : "+result);
            
            result = n1%n2;
             Console.WriteLine("The modulus of numbers is : "+result);
            
            int r, x = 10;
            
            
            r = ++x;
            
            Console.WriteLine("The value of x is {0} and the value of result is {1}",x,r);
            
            
            x = 10;
            r = 0;
            r = x++;
            Console.WriteLine("The value of x is {0} and the value of result is {1}",x,r);
              Console.WriteLine("The value of Result is "+r);
            
            
            x = 10;
            r = 0;
            r = --x;
            Console.WriteLine("The value of x is {0} and the value of result is {1}",x,r);
          
            
            x = 10;
            r = 0;
            r = x--;
            Console.WriteLine("The value of x is {0} and the value of result is {1}",x,r);
            
        }
    }
}