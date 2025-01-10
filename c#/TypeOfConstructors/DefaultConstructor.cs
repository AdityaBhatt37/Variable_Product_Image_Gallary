namespace BCA
{
    using System;

    public class DefaultConstructor{

        public DefaultConstructor()
        {
            Console.WriteLine("Default Constructor envoked automatically");

        }

        public static void Main(string[] args)
        {

            DefaultConstructor obj = new DefaultConstructor();
        }

    }

}