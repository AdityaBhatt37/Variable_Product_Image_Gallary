//HCF PROGRAM

namespace BCA{
    
    using System;
    
    public class HCF{
        
        public static void Main(String[] args){
            
            int n1,n2;
            Console.Write("Enter two numbers : ");
            n1 = int.Parse(Console.ReadLine());
            n2 = int.Parse(Console.ReadLine());
            
            int min = 0;
            
            if(n1<n2){
                
                min = n1;
            }
            else{
                
                min = n2;
            }
            
            
            
            for(int i = min; i>=2; i--){
                
                if((n1%i== 0) && (n2%i == 0)){
                    
                    min = i;
                    break;
                    
                }
                
            }
            
            Console.Write("The HCF of {0} and {1} is : {2}",n1,n2,min);
            
        }
    }
}