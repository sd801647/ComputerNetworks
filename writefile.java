import java.io.*;

public class writefile {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("file2.txt", true);
        String s = "I am a Developer";
        char charr[] = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            fout.write(charr[i]);
        }
        fout.close();
        System.out.println("Wrote Successfully");
    }
}
