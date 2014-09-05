
public class Diving {

	public static int [] sort(int [] array) {
			for(int indexLow=0; indexLow<array.length; indexLow++) {
				for(int i=(indexLow+1); i<array.length; i++) {
					if(array[indexLow]>array[i]) 
						swap(indexLow,i,array);
				}
			}
		return array;
	}
	
	public static void swap(int indexLow, int i, int [] array) {
		int temp;
		temp = array[indexLow];
		array[indexLow] = array[i];
		array[i] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int myArray [] = {10,30,5,3};
			//b4 sorting
			for(int i=0; i<myArray.length; i++)
				System.out.print(myArray[i]+" ");
			Diving.sort(myArray);
			System.out.println();
			//after sorting
			for(int t:myArray) {
				System.out.print(t+" ");
			}
	}

	
}
