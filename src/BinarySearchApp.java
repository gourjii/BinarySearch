
public class BinarySearchApp {
	
	public static void main(String[] args) {
		BinarySearch s = new BinarySearch();
		int[] a = {1,2,4,5,3,6}; //play with this array
		int target = 5; //searching this value
		int index = 0;
		s.setArr(BinarySearch.sortArray(a));
		try{
			index = BinarySearch.binSearch(s.getArr(), target);
			System.out.println("while looking for " + target 
					+ " result of search is position " + index 
					+ " with value " + s.getArr()[index]);
		}
		catch (NullPointerException n){
			System.out.println("value not found");
		}
		
		
		System.out.println("----printing out your array----");
		for (int i = 0; i<a.length; i++)
				{System.out.println(s.getArr()[i]);}
	}
}
