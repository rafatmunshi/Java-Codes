package ds.demo.sorting;


public class QuickSort {

	static int[] quickSort(int arr[],int start, int end){
		int pindex;
		if(start<end){
			pindex=partition(arr, start, end);
			quickSort(arr, start, pindex-1);
			quickSort(arr, pindex+1, end);		
		}
		printArray(arr);
		System.out.println("");				
		return arr;		
	}

	static int partition(int[] arr,int start,int end){
		int pivot=arr[end];
		int pindex=start;
		for(int i=start;i<end;i++){
			if(arr[i]<=pivot){
				swap(arr,i,pindex);
				pindex++;
			}
		}
		swap(arr,pindex,end);
		return pindex;
	}
	
	static void swap(int[] arr,int a,int b){
		int temp;	
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");			
		}
	}
	
	public static void main(String args[]){
		int[] array={7,2,1,6,8,5,3,4};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");		
		array=quickSort(array,0,array.length-1);
		printArray(array);
	}	
}
