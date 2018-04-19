package ArrayPrograme;

public class SumOfEvenNoInArray
{
	public static int SumofEvenNos(int  arr[],int size)
	{
		int sum_e = 0;
		for(int i= 0;i<size;i++)
		{
			if(arr[i] % 2== 0)
			{
				sum_e += arr[i];
			}
		}
		return sum_e;
	}
	

	public static void main(String[] args)
	{
		int [] arr = {12, 44,53,67,87,90};
		int sum = SumofEvenNos(arr, 6);
		System.out.println(sum);

	}		

}
