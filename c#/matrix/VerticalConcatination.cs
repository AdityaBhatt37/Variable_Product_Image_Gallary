namespace BCA{
    
    using System;
    
    public class VerticalCon{
        
        public static void Main(String[] args){
            
                   //Vertical Concatination of Matrix
            
            /*
             1 2   3 5
             3 4   7 9
             
             1 2
             3 4
             3 5
             7 9
             
            */
            
            int[,] arr1 = {
                
                {1,2},
                {3,4}
            };
            
            int[,] arr2 = {
                
                {3,5},
                {7,9}
            };
            
            
            int[,] arr = new int[4,2];
            
            for(int i = 0; i<2; i++){
                
                for(int j = 0; j<2; j++){
                    
                     arr[i,j] = arr1[i,j];
                }
                
            }
            
             for(int i = 2; i<4; i++){
                for(int k = 0; k<2; k++){
                    
                    arr[i,k] = arr2[i-2,k];
                }
            }
            
            
                for(int i = 0; i<arr.GetLength(0); i++){
                
                for(int j = 0; j<arr.GetLength(1); j++){
                    
                    Console.Write(arr[i,j]+" ");
                }
                
                Console.WriteLine();
            }
        }
    }
}