package section3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3FileHandling {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\Kartik\\eclipse-workspace-Spring\\JAVAPaper_20aug24\\textDemo1.txt");
		BufferedReader br=new BufferedReader(f);
		int data;
		int word=1,line=1,num = 0;
		
		while((data=br.read())!=-1)
		{
			
			char ch=(char)data;
			if(ch=='\n') {
				line++;
			}
			if(ch==' ')
			{
				word++;
			}
			if(ch>=48&&ch<=57)
			{
				num++;
			}

		}
		System.out.println("Lines:"+line+"\nWords:"+word+"\nnumber:"+num);
	}
}
