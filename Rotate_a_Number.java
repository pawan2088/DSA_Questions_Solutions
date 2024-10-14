
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n,num,sum=0,len=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		System.out.println("Enter the Step: ");
		n=sc.nextInt();
		//finding the length of number
		int temp=num;
		while(temp>0){
		    len++;
		    temp=temp/10;
		}
		if(n>len){
		    while(n>=len){
		        n=n-len;
		    }
		}
		for(int i=0;i<n;i++){
		    int rem=num%10;
		    sum=sum+rem*(int)Math.pow(10,i);
		    num=num/10;
		}

		int a=len-n;
	    sum=sum*(int)Math.pow(10,a);
	    for(int i=0;i<a;i++){
	        int rem=num%10;
	        sum=sum+rem*(int)Math.pow(10,i);
	        num=num/10;
	    }System.out.print(sum);
	    
    
}
    
}
