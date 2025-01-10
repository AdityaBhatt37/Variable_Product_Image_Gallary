namespace BCa{

    using System;


    public class GreatestNumber{
    public static void Main(string[] arr){

        int num1, num2, num3;

        Console.Write("Enter Three numbers : ");
        num1 = int.Parse(Console.ReadLine());
        num2 = int.Parse(Console.ReadLine());
        num3 = int.Parse(Console.ReadLine());
        
        // Console.Write(num1);
        // Console.Write(num2);
        // Console.Write(num3);

        if((num1>num2)&&(num1>num3)){

            Console.WriteLine(num1+" is greater");
        }
        else if((num2>num1)&&(num2>num3)){

            Console.WriteLine(num2 +" is greater");
        }
        else{

            Console.WriteLine(num3 +" is greater");
        }

    }
}
}