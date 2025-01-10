namespace BCA{
    
    using System;
    
    public class HorizontalCon{
        
        public static void Main(String[] args){
            
            //Horizontal Concatination of Matrix
            
            /*
             1 2   3 5
             3 4   7 9
             
             1 2 3 5
             3 4 7 9
            */
            
            int[,] arr1 = {
                
                {1,2},
                {3,4}
            };
            
            int[,] arr2 = {
                
                {3,5},
                {7,9}
            };
            
            int[,] arr = new int[2,4];
            
            for(int i = 0; i<2; i++){
                
                for(int j = 0; j<2; j++){
                    
                    arr[i,j] = arr1[i,j];
                }
                
                for(int k = 2; k<4; k++){
                    
                    arr[i,k] = arr2[i,k-2];
                }
            }
            
            
            //OUTPUT
            
            for(int i = 0; i<arr.GetLength(0); i++){
                
                for(int j = 0; j<arr.GetLength(1); j++){
                    
                    Console.Write(arr[i,j]+" ");
                }
                
                Console.WriteLine();
            }
        }
    }
}