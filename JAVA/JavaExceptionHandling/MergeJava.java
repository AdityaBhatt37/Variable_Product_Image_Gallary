import java.io.*;
import java.io.IOException;

public class MergeJava {
    
    public static void main(String[] argu) throws IOException{

        PrintWriter pw = new PrintWriter("./merge.txt");

        FileReader fr = new FileReader("number.txt");
        BufferedReader br = new BufferedReader(fr);

        FileReader fr2 = new FileReader("palindrome.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        String num;
        int numm = 0;

        String palin;
        int palinn = 0;

        while((num=br.readLine())!= null){

            numm = Integer.parseInt(num);
            pw.println(numm);
            pw.flush();
        }

        

    }
}
