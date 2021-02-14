package solutions.hristov;

public class First
{
	public static void main(String[] args)
	{
		System.out.println(checkForEqualElements(new int[] {1, 2, 3}, new int[] {4, 1}, 0, 0));
		System.out.println(elementCountInArray(new int[] {1, 1, 1, 2, 3, 1, 1}, 0, 1, 0));
	}
	
	public static boolean checkForEqualElements(int[] a, int[] b, int firstIndex, int secondIndex)
	{
		if (secondIndex >= b.length)
		{
			secondIndex = 0;
			firstIndex++;
		}
			
		if (firstIndex >= a.length)
		{
			return false;
		}
		
			if(a[firstIndex] == b[secondIndex])
		{
			return true;
		}
		
		return checkForEqualElements(a, b, firstIndex, secondIndex + 1);
	}
	
	static int elementCountInArray(int[] array, int index, int element, int count)
	{
		if (index == array.length)
		{
			return count;
		}
		
		if (array[index] == element)
		{
			count++;
		}
		
		return elementCountInArray(array, index + 1, element, count);
	}
}
