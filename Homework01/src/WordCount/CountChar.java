package WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountChar {
	public int CharNum(String filePath) throws IOException {
		int charNumber=0;
		String line;
		File file=new File(filePath);
		FileReader fr = null;
		FileWriter fw=null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		StringBuffer sb=new StringBuffer();
		line=br.readLine();
		while(line!=null) {
			sb=sb.append(line);
			line=br.readLine();
		}
		String info=sb.toString();
		charNumber=info.length();
		br.close();
		try {
			fw=new FileWriter("D:\\eclipse\\Homework01\\workdata\\result.txt",true);
			fw.write(filePath+" "+"ÐÐÊý£º"+charNumber);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*if((line=br.readLine())!=null) {
			char[] ch=line.toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(!Character.isWhitespace(ch[i])) {
					charNumber++;
				}
			}
		}*/
		return charNumber;
}
}
