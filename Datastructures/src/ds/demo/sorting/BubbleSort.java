package ds.demo.sorting;

public class BubbleSort {

	static int[] bubbleSort(int arr[]){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		int[] array={5,4,3,2,1,0,8,9,6,1,7};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		array=bubbleSort(array);
		printArray(array);
	}	
}
