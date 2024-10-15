
import java.util.*;
public class Prime_Factorization
{
	public static void main(String[] args) {
		int num1,num2=2;
		Scanner sc=new Scanner(System.in);
		
		num1=sc.nextInt();
		while(num1>1){
		    if(num1%num2==0){
		        
		        System.out.println(num2);
		        num1=num1/num2;
		        
		    }else{
		        num2++;
		    }
		    
		    
		}
		
	}
}