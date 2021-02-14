package solutions.denev;

public class Sixth
{
	public static void main(String[] args)
	{
		System.out.println(binarySearch(new int[] { 1, 2, 3}, 0, 2, 5));
		System.out.println(binarySearch(new int[] { 1, 2, 3}, 0, 2, 3));
	}
	
	public static boolean binarySearch(int[] arr, int from, int to, int k)
	{
		if (to >= from) 
        {
            int mid = from + (to - from) / 2; 
   
            if (arr[mid] == k) 
               return true; 
   
            if (arr[mid] > k)
            {
            	return binarySearch(arr, from, mid - 1, k);
            }
            
            return binarySearch(arr, mid + 1, to, k); 
        }
		
		return false;
	}
}
