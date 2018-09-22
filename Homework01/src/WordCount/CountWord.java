package WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountWord {
	public int countWord(String filePath) throws IOException {
		int wordNumber=0;
		String line;
		String [] saveWord;
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
		StringBuffer sb=new StringBuffer();
		while((line=br.readLine())!=null) {
			sb.append(line);
		}
		String str=sb.toString().replaceAll("[^a-zA-Z^]", " ");
		saveWord=str.split("\\s+");
		wordNumber=saveWord.length;
		br.close();
		try {
			fw=new FileWriter("D:\\eclipse\\Homework01\\workdata\\result.txt",true);
			fw.write(filePath+" "+"ÐÐÊý£º"+wordNumber);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wordNumber;
	}
}
