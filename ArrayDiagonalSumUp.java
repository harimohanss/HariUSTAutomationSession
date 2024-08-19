package HW;

public class ArrayDiagonalSumUp {
	
	public static void main (String[] args)
	{
		//2 Array of size 4*4 to sum up all the elements of diagonal values  
		int[][]array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		int firstDiagSum = 0;
		int secondDiagSum = 0;
		
		
		for (int i =0; i< array.length; i++)
		{
			for(int j =0; i< array[i].length; j++)
			{
				if(i==j)
				{
					firstDiagSum += array[i][j];
				}
				if(i+j==array.length -1)
				{
					secondDiagSum +=array[i][j];
				}
			}
		}
			System.out.println("Sum of first diagonal: " + firstDiagSum);
			System.out.println("Sum of second diagonal: " + secondDiagSum);
	}

}
