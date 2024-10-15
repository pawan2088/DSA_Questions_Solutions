/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int GCD=0,LCM,num1,num2;
		Scanner sc=new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		int small=(num1>num2?num2:num1);
		//calculating GCD
		for(int i=2;i<=small;i++){
		    if(num1%i==0 && num2%i==0){
		        GCD=i;
		    }
		}
		System.out.println("GCD:");
		System.out.println(GCD);
		//calculating LCM
		LCM=(num1*num2)/GCD;
		System.out.println("LCM:");
		System.out.println(LCM);
		
	}
}