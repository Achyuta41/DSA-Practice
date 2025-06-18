import java.util.*;

public class search{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		int [] arr=new int[20];
		System.out.println("Enter the size of the array:");
		int size=inp.nextInt();
		System.out.println("Enter array Element:");
		int k=0;    //act as a flag variable 
		int ind=0;  //index 
		for(int i=0;i<size;i++)
		{
			arr[i]=inp.nextInt();
		}
		System.out.println("Enter Element to search:");
		int se=inp.nextInt(); //search element 
	    for(int i=0;i<size;i++)
		{
			if(arr[i]==se){ind=i;
			k=0;
			break;}
			else{ ind=-1;
			k=1;}
		}
		if(k==0)
		System.out.println("Element is found at "+ ind);
	    else
		 System.out.println("Element is not found "+ ind);

	}
}
