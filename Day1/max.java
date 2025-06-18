import java.util.*;

public class max{
	public static void main(String[] args)
	{ 
		Scanner inp=new Scanner(System.in);
		int [] arr=new int[20];
		System.out.println("Enter the size of the array:");
		int size=inp.nextInt();
		System.out.println("Enter array Element:");
		int k=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=inp.nextInt();
			if(k<arr[i])
				k=arr[i];
			
		}
		System.out.println("The Maximum Element:"+ k);
	}
}
