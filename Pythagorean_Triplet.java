/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a,b,c;
		boolean flag;
		System.out.println("Enter the ang1:");
		a=sc.nextInt();
		System.out.println("Enter the ang2:");
		b=sc.nextInt();
		System.out.println("Enter the ang3:");
		c=sc.nextInt();
		int hyp=a;
		if(hyp<b){
		    hyp=b;
		}else if(hyp<c){
		    hyp=c;
		}
		if(hyp==a){
		    flag=(hyp*hyp==b*b+c*c);
		}else if(hyp==b){
		    flag=(hyp*hyp==a*a+c*c);
		}else{
		    flag=(hyp*hyp==a*a+b*b);
		}
		if(flag==true){
		    System.out.println("True");
		}else{
		    System.out.println("False");
		}
		
		
		
	}
}
