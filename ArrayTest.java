package Array;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		
		int pincome[]= {82, 52, -2, 31, 26, 11};
		System.out.println("Array before storting");
		print(pincome);
		int[]rpincome = sort(pincome);
		
		System.out.println("Array after storting");
		
	}

	private static int[] sort(int[] avalues) {
		// TODO Auto-generated method stub
		for (int i =0; i<avalues.length; i++)
		{
			for(int j=0; j<avalues.length - 1 -i; j++)
			{
				if(avalues[j]>avalues[j+1])
				{
					int tmp = avalues[j];
					avalues[j]=avalues[j+1];
					avalues[j+1] = tmp;
				}
			}
		}
		return avalues;
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("----------Display Begin------");
		for (int i=0; i<arr.length;i++)
		{
			System.out.println("Percapita income of city"+ i + " is  " + arr[i]);
		}
	}

}
