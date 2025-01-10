 using System;

namespace BCA{
    
    public class TwoD{
        
        public static void Main(String[] arg){
            
            
            Console.Write("Enter number of rows : ");
            int row = int.Parse(Console.ReadLine());
            
            Console.Write("Enter number of column : ");
            int col = int.Parse(Console.ReadLine());
            
            int[,] arr = new int[row,col];
            
            //Taking input from the user
            
            for(int i = 0; i<arr.GetLength(0); i++){
                
                for(int j = 0; j<arr.GetLength(1); j++){
                    
                    Console.Write($"Enter the Elements in [{i} {j}] : ");
                    
                    arr[i,j] = int.Parse(Console.ReadLine());
                }
            }
            
            Console.WriteLine("The output of a string is : ");
            for(int i = 0; i<arr.GetLength(0); i++){
                
                for(int j = 0; j<arr.GetLength(1); j++){
                    
                    Console.Write(arr[i,j]+" ");
                }
                
                Console.WriteLine();
            }
        }
    }
}