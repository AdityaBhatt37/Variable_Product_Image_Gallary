// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        
        
        int[] arr = {1,2,10,3,4,56,10};
        
        Array.Sort(arr);
        
        //Printing sorted array;
        foreach(int key in arr){
            
            Console.Write(key+" ");
        }
        Console.WriteLine();
        
        //Using of Reverse method
        
        Array.Reverse(arr);
        
        //printing reversed array
        
        foreach(int key in arr){
            
            Console.Write(key+" ");
        }
        Console.WriteLine();
        
        
        //USING OF CLEAR METHOD
        
        Array.Clear(arr,1,1);
        
        //Printing the array after clear method
        
        foreach(int key in arr){
            
            Console.Write(key+" ");
        }
        
        Console.WriteLine();
        
        //Using of GetValue method
        
        int val = (int)arr.GetValue(3);
        
        Console.WriteLine($"The value of val is : "+val);
        
        //using of GetUpperBond method
        
        int up = (int)arr.GetUpperBound(0);
        Console.WriteLine("The value of upper bond is : "+up);
        
        int low = (int)arr.GetLowerBound(0);
        Console.WriteLine("The value of Lower bound is : "+low);
        
        
    }
}