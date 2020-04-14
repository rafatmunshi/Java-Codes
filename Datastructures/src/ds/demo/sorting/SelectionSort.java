package ds.demo.sorting;

public class SelectionSort {

	static int[] selectionSort(int arr[]){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				printArray(arr);
				System.out.println("");
			}			
		}		
		return arr;		
	}
	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");			
		}
	}
	
	public static void main(String args[]){
		int[] array={5,4,3,2,1,0,8,9,6,1,7};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		array=selectionSort(array);
		printArray(array);
	}	
}
