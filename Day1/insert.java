import java.util.*;

public class insert{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		int [] arr=new int[20];
		System.out.println("Enter the size of the array:");
		int size=inp.nextInt();
		System.out.println("Enter array Element:");
		for(int i=0;i<size;i++)
		{
			arr[i]=inp.nextInt();
		}
		System.out.println("Array elements before Inserting:");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n Enter Element to insert at first position:");
		int data=inp.nextInt();
		System.out.println("Enter Element to insert at last position:");
		int data2=inp.nextInt();
		//insert data in begining and data2 in the end
		int j=size+1;
		for(int i=size;i>=0;i--)
		{
			arr[j]=arr[i];
			j--;
		}
		arr[0]=data;
		arr[size+2]=data2;
		System.out.println("Array elements After Inserting:");
		for(int i=0;i<size+2;i++)
		{
		System.out.print(arr[i]+ " ");
		}
	}
}
		
		