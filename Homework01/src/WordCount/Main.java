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
		System.out.println("������������ļ���ַ��");
		filePath=sc.nextLine();
		while(flag) {
			System.out.println("1.ͳ���ַ���");
			System.out.println("2.ͳ�Ƶ�����");
			System.out.println("3.ͳ������");
			System.out.println("4.���ز˵�");
			System.out.println("5.�˳�ϵͳ");
			System.out.println("���������������������ʾ�����֣���");
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
				System.out.println(filePath+" "+"�ַ�����"+num1);
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
				System.out.println(filePath+" "+"��������"+num2);
				break;
			case 3:
				CountLine cl=new CountLine();
				int num3=cl.CountLine(filePath);
				System.out.println(filePath+" "+"������"+num3);
				break;
			case 4:
				break;
				default:
					System.out.println("�������ֲ���ȷ");
					break;
			}
		}
	}
}
