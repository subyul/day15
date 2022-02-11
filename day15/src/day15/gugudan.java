package day15;
import java.util.Scanner;
import java.util.Random;
public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int [] answer = new int [5];
		int [] yes = null;
		int [] no = null;
		
		int [] result = new int [5];
		
		int yes_idx = -1;
		int no_idx = -1;
		int count1 = 0;
		int count2 = 0;
		int i = 0;
		
		while (i<5)
		{
			int gu1 = ran.nextInt(10);
			int gu2 = ran.nextInt(10);
			if(gu1==0||gu2==0)
			{
				continue;
			}
			System.out.print(gu1 + " * "+gu2 + " = ");
			int dap = sc.nextInt();
			result[i] = dap;
			if(dap == gu1*gu2)
			{
				answer[i] = 1;
				count1 ++;
				System.out.println("정답");
				
			}
			else
			{
				answer[i] = -1;
				count2 ++;
				System.out.println("오답");
				
			}
			i++;
			
		}
		yes = new int[count1];
		no  = new int[count2];
		
		/*for(int j = 0; j<answer.length;j++)
		{
			if(answer[j]==-1)
			{
				no[j] = answer[j];
			}
			else if(answer[j]==1)
			{
				yes[j] = answer[j];
			}
		}*/
		int k = 0;
		for(int j = 0;j<answer.length;j++)
		{
			if(answer[j]==1)
			{
				yes[k] = j;
				k++;
			}
		}
		 k = 0;
		for(int j = 0;j<answer.length;j++)
		{
			if(answer[j]==-1)
			{
				no[k] = j;
				k++;
			}
		}
		for(int j = 0; j<answer.length;j++)
		{
			System.out.print(answer[j]+" ");
		}
		System.out.println();
		for(int j = 0; j<count1;j++)
		{
			System.out.print(yes[j]+" ");
		}
		System.out.println();
		for(int j = 0; j<count2;j++)
		{
			System.out.print(no[j]+" ");
		}
	}

}
