package WordCount;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		String filePath;
		int ch;
		System.out.println("请输入需操作文件地址：");
		filePath=sc.nextLine();
		while(flag) {
			System.out.println("1.统计字符数");
			System.out.println("2.统计单词数");
			System.out.println("3.统计行数");
			System.out.println("4.返回菜单");
			System.out.println("5.退出系统");
			System.out.println("请输入所需操作（输入提示的数字）：");
			ch=sc.nextInt();
			if(ch==5) {
				flag=false;
				break;
			}
			switch(ch) {
			case 1:
				CountChar cc=new CountChar();
				int num1 = 0;
				try {
					num1 = cc.CharNum(filePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(filePath+" "+"字符数："+num1);
				break;
			case 2:
				CountWord cw=new CountWord();
				int num2 = 0;
				try {
					num2 = cw.countWord(filePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(filePath+" "+"单词数："+num2);
				break;
			case 3:
				CountLine cl=new CountLine();
				int num3=cl.CountLine(filePath);
				System.out.println(filePath+" "+"行数："+num3);
				break;
			case 4:
				break;
				default:
					System.out.println("输入数字不正确");
					break;
			}
		}
	}
}
