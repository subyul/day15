package day15;
import java.util.Random;
public class no {
public static void main(String[] args) {
	Random ran = new Random();
	int arr[] = new int[5];
	int temp [] = new int [5];
	
	for(int i = 0; i<arr.length;i++)
	{
		int num = ran.nextInt(10)+1;
		
		arr[i] = num;
		temp[i] = arr[i];
		
		for(int j = 0;j<arr.length;j++)
		{
			if(i!=j)
			{
				if(arr[i]==temp[j])
				{
					i--;
				}
			}
		}
			
	}
	for(int i = 0; i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
