import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_class1 {
	public void ReadData(int lineNumber) throws IOException
	{
	
	File f = new File("C:\\Users\\marc\\Desktop\\File.txt");

    FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String s;
	int line = 0;
	while((s=br.readLine())!=null)
	{
		line++;
		if(line==lineNumber)
		{
		   System.out.println(s);
	}
	}
	}
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

	{
	File_class1 ob = new File_class1();
	ob.ReadData(3);
	

}
}
}
