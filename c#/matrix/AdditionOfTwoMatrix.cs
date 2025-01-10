using System;

namespace BCA{
    
    public class F2{
        
        public static void Main(String[] arg){
            
            
            Console.Write("Enter the value of row : ");
            int row = int.Parse(Console.ReadLine());
            
            Console.Write("Enter the value of col : ");
           int col = int.Parse(Console.ReadLine());
            
            
            int[,] arr1 = new int[row,col];
            
            int[,] arr2 = new int[row,col];
            
            int[,] arr = new int[row,col];
            
            //Getting the input in arr1;
            for(int i = 0; i<row; i++){
                
                for(int j = 0; j<col; j++){
                    
                    Console.Write($"Enter the Element in arr1[{i},{j}]: ");
                    
                    arr1[i,j] = int.Parse(Console.ReadLine());
                }
            }
            
            
            //GETTING input in arr2
            for(int i = 0; i<row; i++){
                
                for(int j = 0; j<col; j++){
                    
                    Console.Write($"Enter the element in arr2[{i},{j}] : ");
                    
                    arr2[i,j] = int.Parse(Console.ReadLine());
                }
            }
            
            //ADDING TWO ARRAY AND STORING THE RESULT IN ARR
            for(int i = 0; i<row; i++){
                
                for(int j = 0; j<col; j++){
                    
                    arr[i,j] = arr1[i,j]+arr2[i,j];
                }
            }
            
            //Getting the value of result array
            
            for(int i = 0; i<row; i++){
                
                for(int j = 0; j<col; j++){
                    
                    Console.Write(arr[i,j]+" ");
                }
                
                Console.WriteLine();
            }
        }
    }
}