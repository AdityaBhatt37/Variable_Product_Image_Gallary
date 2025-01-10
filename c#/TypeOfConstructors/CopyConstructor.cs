namespace BCA{
    
    using System;
    
    public class CopyConstructor{
        
        public String str;
        
        //Parameterized Constructor
        CopyConstructor(String str){
            
            this.str = str;
        }
        
        
        //Copy Constructor
        CopyConstructor(CopyConstructor obj){
            
            str = obj.str;
        }
        
        
       public static void Main(String[] args){
        
            CopyConstructor objec = new CopyConstructor("This is String writeen inside parameterized constructor");
            
            CopyConstructor CopyNewObj = new CopyConstructor(objec);
            
            Console.WriteLine(objec.str);
            Console.WriteLine(CopyNewObj.str);
            
            
            
        
       }
    }
}