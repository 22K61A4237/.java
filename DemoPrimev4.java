import java.util.*;
public class DemoPrimev4{
    public static void main(String args[]) {
        int i,num,flag = 0,count;
        System.out.println("Enter n value: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
               System.out.println("Prime numbers between 1 to "+n+" are ");
        for( num=2; num<=n; num++)
    {
	count=0;
	for(i=1;i<=num;i++)
	{
        if(num%i == 0) 
        {
            count++;
        }
	}
	if(count==2)
            System.out.println(num+"   ");
       }
    }
}