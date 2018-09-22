package WordCount;

import java.io.*;

public class CountLine {
	public int CountLine(String filePath) {
		int lineNumber=0;
		String line;
		File file=new File(filePath);
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		try {
			while((line=br.readLine())!=null) {
				lineNumber++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw=new FileWriter("D:\\eclipse\\Homework01\\workdata\\result.txt",true);
			fw.write(filePath+" "+"ÐÐÊý£º"+lineNumber);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineNumber;
	}
}
