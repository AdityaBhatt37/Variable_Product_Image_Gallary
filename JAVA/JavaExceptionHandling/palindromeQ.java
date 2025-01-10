import java.io.*;

public class palindromeQ {
    
    public static void main(String[] arg) throws IOException{

        PrintWriter pw = new PrintWriter("./number.txt");

        for(int i = 1; i<1000; i++){

            pw.println(i);
            pw.flush();
        }

        FileReader fr = new FileReader("number.txt");
        BufferedReader br = new BufferedReader(fr);

        PrintWriter pw2 = new PrintWriter("./palindrome.txt");
        
        String Line;
        int num = 0, rem, rev, onum;

        while((Line = br.readLine())!= null){

            num = Integer.parseInt(Line);
            rev = 0;
            onum = num;

            while(num!=0){

                rem = num%10;
                rev = rev*10+rem;
                num = num/10;

            }

            if(rev == onum){

                pw2.println(onum);
                pw2.flush();
            }
  
        }

        System.out.println("Data is inserted perfactly");
    }
}
