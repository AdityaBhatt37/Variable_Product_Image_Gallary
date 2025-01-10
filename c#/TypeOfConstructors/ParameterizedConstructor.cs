namespace BCA
{
    using System;

    public class ParameterizedConstructor
    {

        public ParameterizedConstructor(int x)
        {
            Console.WriteLine("The value of x is : "+x);

        }

        public static void Main(string[] args)
        {

            ParameterizedConstructor obj = new ParameterizedConstructor(3);
        }

    }

}