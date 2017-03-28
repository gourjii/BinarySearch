import java.util.Arrays;

public class BinarySearch {
	int[] arr = new int[1000];
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public static int[] sortArray (int[] a){
		Arrays.sort(a);
		return a;
	}
	
	public static int binSearch (int[] a, int target){ //case with duplicate values is not covered
		int min = -1; // first available value -1
		int max = a.length; // = last available value + 1
		int currPos;// = max/2; // =mid index rounded up
		
		while (max-min > 1)
		{
			currPos = min + (max - min)/2;
			if (a[currPos] == target)
				{return currPos;}
			else if (a[currPos] > target)
				{max = currPos;}
			else {min = currPos;}
			//System.out.println(currPos + ", min " + min + ", max " + max);
		}
		throw new NullPointerException("value not found");
	}
	
}
