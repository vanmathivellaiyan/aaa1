package aa;

import java.util.Scanner;

public class greatest {
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a>b)&&(a>c)){
			System.out.println("first no is greatest");
		}
		else if((b>c)&&(b>a)){
			System.out.println("Second no largest");
		}
		else if((c>a)&&(c>b)){
			System.out.println("third no is largest ");
		}
		else{
			System.out.println("not no is largest");
		}
	}

}
