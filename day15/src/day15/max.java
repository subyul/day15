package day15;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {11,87,42,100,24};
		int count = 0;
		
		while(true)
		{
			for(int i = 0; i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");	
			}
				System.out.println();
			System.out.println("입력 : ");
			int data = sc.nextInt();
			
			
			for(int i = 0; i<arr.length;i++)
			{
				if(data==arr[i])
				{
					arr[i]=0;
					count ++;
				}
			}
			
			if(count==5)
			{
				System.out.println("종료....");
				break;
			}
			
		}
		
	} 
}