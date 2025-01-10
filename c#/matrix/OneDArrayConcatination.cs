using System;
using System.Linq; // Add this for Union method

namespace BCA
{
    public class Program
    {
        public static void printArray(int[] number)
        {
            foreach (var i in number)
            {
                Console.Write(i);
            }
        }

        public static void Main(string[] args)
        {
            int[] number1 = { 2, 7, 9, 10, 15 };
            int[] number2 = { 5, 9, 18, 4, 9, 20 };

            int[] number = number1.Union(number2).ToArray();

            printArray(number);
        }
    }
}