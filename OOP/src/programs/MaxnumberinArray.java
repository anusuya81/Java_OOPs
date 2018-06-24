package programs;

public class MaxnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,67,35,7,54};
		System.out.println(MaxValue(num));
	}
public static int MaxValue(int[] numbers)
{
	int max=numbers[0];
for(int i=1;i<numbers.length;i++)
{
	if(max<numbers[i])
	{
		max=numbers[i];
	}
}
	return max;
}
}
