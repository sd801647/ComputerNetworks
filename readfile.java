import java.io.File;
import java.io.IOException;

public class readfile
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("file1.txt");
		f1.createNewFile();
		System.out.println("Is Exist : "+f1.exists());
		System.out.println("File Size : "+f1.length());
		System.out.println("Can read: "+f1.canRead());
		System.out.println("Can Write: "+f1.canWrite());
	}
}