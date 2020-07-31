import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_class2 {

	public void ReadDatafromRange(int intialline, int finalline) throws IOException
	{
	
	File f = new File("C:\\Users\\marc\\Desktop\\File.txt");

    FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	
	int line = 0;
	while((br.readLine())!=null)
	{
		line++;
		if(line==intialline)
		{
			for(int i=line;i<finalline;i++)
			{
		   System.out.println(br.readLine());
	}
	}}
	}
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

	{
	File_class2 ob = new File_class2();
	ob.ReadDatafromRange(2, 4);
	
	

}
}

}
