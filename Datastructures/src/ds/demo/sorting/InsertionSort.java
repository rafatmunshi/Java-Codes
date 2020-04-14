package ds.demo.sorting;

public class InsertionSort {

	static int[] insertionSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int value=arr[i];
			int hole=i;
			while(hole>0 && arr[hole-1]>value){
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
			printArray(arr);
			System.out.println("");
		}		
		return arr;		
	}
	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");			
		}
	}
	
	public static void main(String args[]){
		int[] array={5,4,3,2,1};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		array=insertionSort(array);
		printArray(array);
	}	
}
