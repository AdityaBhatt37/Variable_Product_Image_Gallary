/* TAKING INPUT FROM USER
* INHERITANCE IN JAVA
* CONCEPT OF WRAPPER CLASS IN JAVA
* CONSTRUCTOR IN JAVA
* INNER CLASS IN JAVA
* METHOD OVERRIDING IN JAVA
* STATIC KEYWORD IN JAVA(STATIC METHOD, STATIC VARIABLES CONCEPTS)
* ABSTRACT CLASS IN JAVA (AND ALL THE CONCEPT REGARDING ABSTRACT)
* DYNAMIC BINDING(DYNAMIC DISPATCH)//UPCASTING AND DOWNCASTINIG IN JAVA
* STRING IN JAVA
* STRING BUFFER IN JAVA
* STRING BUILDER IN JAVA
* MULTIPLE THREADING IN JAVA
* SYNCHRONIZATION IN JAVA
* THREAD LIFE CYCLE IN JAVA
* INTERFACE IN JAVA
* FILE HANDLING IN JAVA(CREATING NEW FILE)
* FILE WRITER CLASS IN JAVA
* FILE HANDLING IN JAVA (STREAM ,FILE CLASS IN JAVA)
* FILE READER CLASS IN JAVA
* BUFFERED WRITER CLASS IN JAVA
* BUFFERED READER CLASS IN JAVA
* WAP TO MERGE TWO FILE AND MAKE ONE FILE OF IT. 
*/

import java.util.*;

class UniversalCode {

    public static void main(String[] arg) {

        Scanner obj = new Scanner(System.in);

        System.out.println();
        System.out.print("Do you want to do revision then print 'yes' : ");
        String yes = obj.next();

        if (yes.equalsIgnoreCase("yes")) {

            while (true) {

                System.out.println();
                // Options:
                System.out.println("1 -> TAKING INPUT FROM USER.");
                System.out.println("2 -> INHERITANCE IN JAVA.");
                System.out.println("3 -> CONCEPT OF WRAPPER CLASS IN JAVA.");
                System.out.println("4 -> CONSTRUCTOR IN JAVA.");
                System.out.println("5 -> INNER CLASS IN JAVA.");
                System.out.println("6 -> METHOD OVERRIDING IN JAVA.");
                System.out.println("7 -> STATIC KEYWORD IN JAVA(STATIC METHOD, STATIC VARIABLES CONCEPTS).");
                System.out.println("8 -> ABSTRACT CLASS IN JAVA (AND ALL THE CONCEPT REGARDING ABSTRACT).");
                System.out.println("9 -> UPCASTING AND DOWNCASTING IN JAVA");
                System.out.println("10 -> STRING IN JAVA.");
                System.out.println("11 -> STRING BUFFER IN JAVA.");
                System.out.println("12 -> STRING BUILDER IN JAVA.");
                System.out.println("13 -> MULTIPLE THREADING IN JAVA.");
                System.out.println("14 -> SYNCHRONIZATION IN JAVA.");
                System.out.println("15 -> THREAD LIFE CYCLE IN JAVA.");
                System.out.println("16 -> INTERFACE IN JAVA.");
                System.out.println("17 -> FILE HANDLING IN JAVA(CREATING NEW FILE).");
                System.out.println("18 -> FILE WRITER CLASS IN JAVA.");
                System.out.println("19 -> FILE HANDLING IN JAVA (STREAM ,FILE CLASS IN JAVA).");
                System.out.println("20 -> FILE READER CLASS IN JAVA.");
                System.out.println("21 -> BUFFERED WRITER CLASS IN JAVA.");
                System.out.println("22 -> BUFFERED READER CLASS IN JAVA.");
                System.out.println("23 -> WAP TO MERGE TWO FILE AND MAKE ONE FILE OF IT..");

                System.out.println();
                System.out.print("ENTER NUMBER ACCORDING TO THE NUMBERING OF TOPICS : ");
                int choice = obj.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println(
                                "\n\n//TAKING INPUT FROM USER #CODE#\n\n" +
                                        "static void takingInputFromUser(){\n" +
                                        "    Scanner obj = new Scanner(System.in);\n" +
                                        "    //Taking an integer(int)value\n" +
                                        "\n" +
                                        "    System.out.print(\"Enter an integer(int) value : \");\n" +
                                        "    int a = obj.nextInt();\n" +
                                        "    System.out.println(\"The value of integer is : \" + a);\n" +
                                        "\n" +
                                        "    System.out.println();\n" +
                                        "    System.out.print(\"Enter a String value : \");\n" +
                                        "    String str2 = obj.next();\n" +
                                        "    System.out.println(\"The value of Str is : \" + str2);\n" +
                                        "\n" +
                                        "    System.out.println();\n" +
                                        "    System.out.print(\"Enter a Double value : \");\n" +
                                        "    double db = obj.nextDouble();\n" +
                                        "    System.out.println(\"The value of double value is : \" + db);\n" +
                                        "\n" +
                                        "    System.out.println();\n" +
                                        "    System.out.print(\"Enter a Float value : \");\n" +
                                        "    float f = obj.nextFloat();\n" +
                                        "    System.out.println(\"The float value is : \" + f);\n" +
                                        "\n" +
                                        "    System.out.println();\n" +
                                        "    //System.out.println(\"Enter the Boolean value : \");\n" +
                                        "    // Boolean bool = obj.nextBoolean();\n" +
                                        "    // System.out.println(\"The value of Bool is : \" + bool);\n" +
                                        "    // System.out.println();\n" +
                                        "}\n\n" +
                                        "//OUTPUT OF CODE \n");
                        takingInputFromUser();

                        break;

                    case 2:

                        System.out.println("There are 5 types of Inheritance in Java :");
                        int ch;

                        System.out.println("1: SINGLE INHERITANCE");
                        System.out.println("2: MULTIPLE INHERITANCE");
                        System.out.println("3: MULTILEVEL INHERITANCE");
                        System.out.println("4: HIERARCHICAL INHERITANCE");
                        System.out.println("5: HYBRID INHERITANCE");

                        System.out.println();

                        System.out.print("Enter the choice according the numbring of types of inheritance : ");
                        ch = obj.nextInt();

                        switch (ch) {

                            case 1:
                                System.out.println(
                                        "//Inheritance in java #CODE#\n\n" +

                                                "//There are 5 types of inheritance in java\n\n" +

                                                "//1->SIMPLE INHERITANCE\n\n" +
                                                "class Base{\n\n" +

                                                "    int a = 3;\n" +
                                                "    void bfunc(){\n\n" +

                                                "        System.out.println(\"This is the method of Base Class in simple inheritance.\");\n"
                                                +
                                                "    }\n" +
                                                "}\n\n" +

                                                "class Derived extends Base{\n\n" +

                                                "    void dfunc(){\n\n" +
                                                "        System.out.println(\"This is the method of derived Class in Simple inheritance.\");\n"
                                                +
                                                "    }\n" +
                                                "}\n\n\n\n" +
                                                "//OUTPUT -> Below is the object creating inside Main Method -: \n\n" +

                                                "Derived dr = new Derived();\n" +
                                                "System.out.println(\"The value of a is : \" + dr.a);\n" +
                                                "dr.bfunc();\n" +
                                                "dr.dfunc();\n" +

                                                "\n//OUTPUT");

                                Derived dr = new Derived();
                                System.out.println("The value of a is : " + dr.a);
                                dr.bfunc();
                                dr.dfunc();

                                break;

                            case 2:

                                break;

                            case 3:

                                break;

                            case 4:

                                break;

                            case 5:

                                break;

                        }

                        break;

                    case 3:
                        System.out.println(
                                "\n\n//WRAPPER CLASS USING parseInt() METHOD #CODE#\n\n" +
                                        "static void wrapperClassProgram(){\n" +
                                        "    Scanner obj = new Scanner(System.in);\n" +
                                        "\n" +
                                        "    System.out.print(\"Enter any integer number : \");\n" +
                                        "    String str = obj.next();\n\n" +
                                        "    int inte = Integer.parseInt(str);\n" +
                                        "    System.out.print(\"The value of inte is : \" + inte);\n" +
                                        "}" +
                                        "\n\n//OUTPUT\n");

                        wrapperClassProgram();
                        System.out.println("\n");

                        break;

                    case 4:
                        System.out.println(
                                "//1->SIMPLE INHERITANCE//ALONG WITH CONSTRUCTOR CONCEPT\n" +
                                        "class Base{\n" +
                                        "\n" +
                                        "    int a = 3;\n" +
                                        "    Base(){ //->Non Argument Constructor\n" +
                                        "\n" +
                                        "        System.out.println(\"Calling of non-argument constructor of Base class\\n\");\n"
                                        +
                                        "    }\n" +
                                        "\n" +
                                        "    void bfunc(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is the method of Base Class in simple inheritance.\");\n"
                                        +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "class Derived extends Base{\n" +
                                        "\n" +
                                        "    Derived(){}\n" +
                                        "\n" +
                                        "    Derived(int a, int b){//Parametarized Constructor\n" +
                                        "\n" +
                                        "        System.out.println(\"Sum of two numbers using Parameterized Constructor\");\n"
                                        +
                                        "    }\n" +
                                        "    void dfunc(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is the method of derived Class in Simple inheritance.\");\n"
                                        +
                                        "    }\n" +
                                        "}\n\nOUTPUT\n");

                        Derived d = new Derived(3, 7);
                        break;

                    case 5:

                        System.out.println(
                                "// INNER CLASS CONCEPT IN JAVA\n" +
                                        "\n" +
                                        "// NON STATIC INNER CLASS\n" +
                                        "class outer {\n" +
                                        "\n" +
                                        "    int a = 3;\n" +
                                        "\n" +
                                        "    class inner {\n" +
                                        "\n" +
                                        "        void innerfunc() {\n" +
                                        "            System.out.println(\"The value of a is : \" + 3);\n" +
                                        "\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "// STATIC INNER CLASS\n" +
                                        "class StaticOuter {\n" +
                                        "\n" +
                                        "    int var = 5;\n" +
                                        "    static int v = 7;\n" +
                                        "\n" +
                                        "    static class StaticInner {\n" +
                                        "\n" +
                                        "        void func() {\n" +
                                        "            // System.out.println(\"The value of var is : \"+var);//Cant access global\n"
                                        +
                                        "            // variable.\n" +
                                        "\n" +
                                        "            System.out.println(\"The value of static variable v is : \" + v);\n"
                                        +
                                        "\n" +
                                        "        }\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "public class INNERClass {\n" +
                                        "\n" +
                                        "    public static void main(String arg[]) {\n" +
                                        "\n" +
                                        "        // BELOW IS THE USE FOR NON STATIC INNER CLASS\n" +
                                        "        outer objOuter = new outer();\n" +
                                        "\n" +
                                        "        outer.inner objInner = objOuter.new inner();// creation of object for inner class\n"
                                        +
                                        "\n" +
                                        "        objInner.innerfunc();\n" +
                                        "\n" +
                                        "        // BELOW IS THE USE FOR STATIC INNER CLASS\n" +
                                        "        StaticOuter StaticOuterObj = new StaticOuter();\n" +
                                        "\n" +
                                        "        StaticOuter.StaticInner StaticInnerObj = new StaticOuter.StaticInner();\n"
                                        +
                                        "        // Creation of object for static inner class\n" +
                                        "\n" +
                                        "        StaticInnerObj.func();\n" +
                                        "    }\n" +
                                        "}\n\n");
                        break;

                    case 6:

                        System.out.println(
                                "\n\n//METHOD OVERRIDING CONCEPT\n" +
                                        "\n" +
                                        "class parent{\n" +
                                        "\n" +
                                        "    int a = 3;\n" +
                                        "    void method(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is the method of parent class\");\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "class child extends parent{\n" +
                                        "\n" +
                                        "    int a = 7;\n" +
                                        "    \n" +
                                        "    void method(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is method of child class\");\n" +
                                        "\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "                        //The code in Main method : \n" +
                                        "                        child chi = new child();\n" +
                                        "                        System.out.println(\"The value of a is : \"+ch.a);\n" +
                                        "                        ch.method();\n");

                        childd chi = new childd();
                        System.out.println("The value of a is : " + chi.a);
                        chi.method();
                        System.out.println("\n\n");


                        System.out.println(
                                "\n\n//METHOD OVERRIDING CONCEPT ALONG WITH CONCEPT OF FINAL KEYWORD AND SUPER KEYWORD.\n"
                                        +
                                        "\n" +
                                        "class parentt{\n" +
                                        "\n" +
                                        "    int a = 3;\n" +
                                        "    void method(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is the method of parent class\");\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    final void  method2(){ //We cannot create method2 again in this program which make it overriden.\n"
                                        +
                                        "\n" +
                                        "        System.out.println(\"this is final method of parent class cant be created another \");\n"
                                        +
                                        "    }\n" +
                                        "\n" +
                                        "}\n" +
                                        "\n" +
                                        "class childd extends parentt{\n" +
                                        "\n" +
                                        "    child(){\n" +
                                        "\n" +
                                        "        System.out.println(\"The value of a is : \"+super.a); // whenever the object of child class will made\n"
                                        +
                                        "        // this will automatically print the value of variable a which is of parent class.\n"
                                        +
                                        "    }\n" +
                                        "    int a = 7;\n" +
                                        "    \n" +
                                        "    void method(){\n" +
                                        "\n" +
                                        "        super.method();//This super keyword will call the method of parent class.\n"
                                        +
                                        "        System.out.println(\"This is method of child class\");\n" +
                                        "\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    // void method2(){ //->ERROR WILL COME\n" +
                                        "\n" +
                                        "    // }\n" +
                                        "}\n" +
                                        "\n" +
                                        "                        //The code in Main method : \"\n" +
                                        "                        childd chii = new childd();\n" +
                                        "                        System.out.println(\"The value of a is : \"+chii.a);\n"
                                        +
                                        "                        chii.method();\n\n");
                        childd chii = new childd();
                        System.out.println("The value of a is : " + chii.a);
                        chii.method();
                        System.out.println("\n\n");

                        break;

                    case 7:
                        System.out.println();
                        System.out.println(
                                "\n\n// STATIC KEYWORD IN JAVA(STATIC METHOD, STATIC VARIABLES CONCEPTS).\n" +
                                        "\n" +
                                        "class staticExample{\n" +
                                        "    \n" +
                                        "    //  static int var = 73; //object independent.\n" +
                                        "\n" +
                                        "     static void meth(){// class object independent but not class independent.\n"
                                        +
                                        "        \n" +
                                        "\n" +
                                        "        System.out.println(\"\\n\\n->This is a static method and can be accessed without an object.\");\n"
                                        +
                                        "        System.out.println(\"->Static method can only access static variables in a program.\");\n"
                                        +
                                        "        System.out.println(\"->Static method can't access global variables.\");\n"
                                        +
                                        "        System.out.println(\"->We can access global variables only if we create an object of that class in a static method.\");\n"
                                        +
                                        "     }\n" +
                                        "\n" +
                                        "}\n" +
                                        "\nOUTPUT\n\n" +
                                        "staticExample.meth();\n" +
                                        "System.out.println(\"The value of static variable is : \" + var);\n");

                        System.out.println();
                        staticExample.meth();
                        System.out.println("The value of static variable is : " + var);

                        break;

                    case 8:
                        norma normaObj = new norma();

                        System.out.println(
                                "\n\n//ABASTRACT CLASS/METHOD IN JAVA\n" +
                                        "\n" +
                                        "abstract class abs{\n" +
                                        "\n" +
                                        "\n" +
                                        "    void method1(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is a normal method of the abstract class\");\n"
                                        +
                                        "    }\n" +
                                        "\n" +
                                        "    abstract public void absMethod1();\n" +
                                        "    abstract public void absMethod2();\n" +
                                        "}\n" +
                                        "\n" +
                                        "abstract class abs2 extends abs{\n" +
                                        " \n" +
                                        "    public void absMethod1(){\n" +
                                        "\n" +
                                        "        System.out.println(\"Namaste.\");\n" +
                                        "    }\n" +
                                        "\n" +
                                        "   //we declare this method as abstract because\n" +
                                        "   // it does not override all the abstract methods of abs class which is abstract.\n"
                                        +
                                        "}\n" +
                                        "\n" +
                                        "\n" +
                                        "class norma extends abs{\n" +
                                        "\n" +
                                        "    public void absMethod1(){\n" +
                                        "\n" +
                                        "        System.out.println(\"Namaskaar.\");\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    public void absMethod2(){\n" +
                                        "\n" +
                                        "        System.out.println(\"Good Morning.\");\n" +
                                        "    }" +
                                        "\n\n\nBelow is the Code in Main Method -:\n\n" +
                                        "normalObj.absMethod1();\n" +
                                        "normaObj.absMethod2();\n" +
                                        "\n\n\n//OUTPUT\n\n");
                        normaObj.absMethod1();
                        normaObj.absMethod2();
                        System.out.println();

                        break;

                    case 9:

                        System.out.println(
                                "\n\n\n//UPCASTING AND DOWNCASTING IN JAVA.\n" +
                                        "\n" +
                                        "class paren{\n" +
                                        "\n" +
                                        "    void func(){\n" +
                                        "        System.out.println(\"This is parent function\");\n" +
                                        "    }\n" +
                                        "\n" +
                                        "}\n" +
                                        "\n" +
                                        "\n" +
                                        "class children extends paren{\n" +
                                        "\n" +
                                        "    void funcc(){\n" +
                                        "\n" +
                                        "        System.out.println(\"This is child class\");\n" +
                                        "    }\n" +
                                        "}\n" +
                                        "\n" +
                                        "\n" +
                                        "       \n\nBELOW IS THE CODE OF MAIN METHOD \n\n   //UPCASTING\n" +
                                        "        paren parentObj = new children();//Implicit Upcasting. \n" +
                                        "        parentObj.func();\n" +
                                        "        \n" +
                                        "        paren parentObj2 = (paren) new children();//Explicit Upcasting.\n" +
                                        "        parentObj2.func();\n" +
                                        "        //we cant access the funcc() method of child class.\n" +
                                        "\n" +
                                        "\n" +
                                        "        //DOWNCASTING\n" +
                                        "        // children childObj = new paren();//Implicit Downcasting.\n" +
                                        "        // childObj.func();\n" +
                                        "        // childObj.funcc(); \n" +
                                        "\n" +
                                        "        System.out.println();\n" +
                                        "        children childObj2 = (children) parentObj;//Explicit Downcasting.\n" +
                                        "        childObj2.func();\n" +
                                        "        childObj2.funcc(); \n\n\nOUTPUT\n");

                        // UPCASTING
                        paren parentObj = new children();// Implicit Upcasting.
                        parentObj.func();

                        paren parentObj2 = (paren) new children();// Explicit Upcasting.
                        parentObj2.func();
                        // we cant access the funcc() method of child class.

                        // DOWNCASTING
                        // children childObj = new paren();//Implicit Downcasting.
                        // childObj.func();
                        // childObj.funcc();

                        System.out.println();
                        children childObj2 = (children) parentObj;// Explicit Downcasting.
                        childObj2.func();
                        childObj2.funcc();
                        System.out.println("\n");

                        break;

                    case 10:

                        break;
                }
            }
        }

    }





    // TAKING INPUT FROM USER #CODE#
    static void takingInputFromUser() {
        Scanner obj = new Scanner(System.in);
        // Taking an integer(int)value

        System.out.print("Enter an integer(int) value : ");
        int a = obj.nextInt();
        System.out.println("The value of integer is : " + a);

        System.out.println();
        System.out.print("Enter an String value : ");
        String str2 = obj.next();
        System.out.println("The value of Str is : " + str2);

        System.out.println();
        System.out.print("Enter an Double value : ");
        double db = obj.nextDouble();
        System.out.println("The value of double value is : " + db);

        System.out.println();
        System.out.print("Enter an Float value : ");
        float f = obj.nextFloat();
        System.out.println("The float value is : " + f);

        System.out.println();
        // System.out.println("Enter the Boolean value : ");
        // Boolean bool = obj.nextBoolean();
        // System.out.println("Theh value of Bool is : "+ bool);
        // System.out.println();
    }






    // WRAPPER CLASS USING parseInt() METHOD #CODE#

    static void wrapperClassProgram() {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter any integer number : ");
        String str = obj.next();

        int inte = Integer.parseInt(str);
        System.out.print("The value of inte is : " + inte);
    }

    // Static variable createing
    static int var = 73;

}






// Inheritance in java AND Constructor #CODE#

// There are 5 types of inheritance in java

// 1->SIMPLE INHERITANCE//ALONG WITH CONSTRUCTOR CONCEPT.

class Base {

    int a = 3;

    Base() { // ->Non Argument Constructor

        System.out.println("Calling of non argument constructor of Base class\n");
    }

    void bfunc() {

        System.out.println("This is the method of Base Class in simple inheritance.");
    }
}

class Derived extends Base {

    Derived() {
    }

    Derived(int a, int b) {// Parametarized Constructor

        System.out.println("Sum of two numbers using Parameterized Constructor : " + (a + b));
    }

    void dfunc() {

        System.out.println("This is the method of derived Class in Simple inheritance.");
    }

}

// INNER CLASS CONCEPT IN JAVA

// NON STATIC INNER CLASS

// class outer {

// int a = 3;

// class inner {

// void innerfunc() {
// System.out.println("The value of a is : " + 3);

// }
// }
// }

// // STATIC INNER CLASS
// class StaticOuter {

// int var = 5;
// static int v = 7;

// static class StaticInner {

// void func() {
// // System.out.println("The value of var is : "+var);//Cant access global
// // variable.

// System.out.println("The value of static variable v is : " + v);

// }
// }
// }

// public class INNERClass {

// public static void main(String arg[]) {

// // BELOW IS THE USE FOR NON STATIC INNER CLASS
// outer objOuter = new outer();

// outer.inner objInner = objOuter.new inner();// creation of object for inner
// class

// objInner.innerfunc();

// // BELOW IS THE USE FOR STATIC INNER CLASS
// StaticOuter StaticOuterObj = new StaticOuter();

// StaticOuter.StaticInner StaticInnerObj = new StaticOuter.StaticInner();
// // Creation of object for static inner class

// StaticInnerObj.func();
// }

// }




// METHOD OVERRIDING CONCEPT ALONG WITH CONCEPT OF FINAL KEYWORD AND SUPER
// KEYWORD.

class parentt {

    int a = 3;

    void method() {

        System.out.println("This is the method of parent class");
    }

    final void method2() { // We cannot create method2 again in this program which make it overriden.

        System.out.println("this is final method of parent class cant be created another ");
    }

}

class childd extends parentt {

    childd() {

        System.out.println("The value of a is : " + super.a); // whenever the object of child class will made
        // this will automatically print the value of variable a which is of parent
        // class.
    }

    int a = 7;

    void method() {

        super.method();// This super keywork will call the method of parent class.
        System.out.println("This is method of child class");

    }

    // void method2(){ //->ERROR WILL COME

    // }
}






// STATIC KEYWORD IN JAVA(STATIC METHOD, STATIC VARIABLES CONCEPTS).

class staticExample {

    // static int var = 73; //object independent.

    static void meth() {// class object independent but not class independent.

        System.out.println("\n\n->This is static method can be access without object.");
        System.out.println("->static method can only access static variable in a program. ");
        System.out.println("->static method cant access global variable. ");
        System.out.println("->We can acess global variable only if we create object of that class in static method.");
    }

}





// ABASTRACT CLASS/METHOD IN JAVA

abstract class abs {

    void method1() {

        System.out.println("This is normal method of abstract class");
    }

    abstract public void absMethod1();

    abstract public void absMethod2();
}

abstract class abs2 extends abs {

    public void absMethod1() {

        System.out.println("Namaste.");
    }

    // we declare this method as abstract because
    // it does not overrides all the abstract methods of abs class which is
    // abstract.
}

class norma extends abs {

    public void absMethod1() {

        System.out.println("Namaskaar.");
    }

    public void absMethod2() {

        System.out.println("Good Morning.");
    }
}





// UPCASTING AND DOWNCASTING IN JAVA.

class paren {

    void func() {
        System.out.println("This is parent function");
    }

}

class children extends paren {

    void funcc() {

        System.out.println("This is child class");
    }
}
