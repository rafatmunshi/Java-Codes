package ds.demo.sorting;

public class MergeSort {

	static int[] mergeSort(int[] array) {
		// TODO Auto-generated method stub
		int[] leftArray=null;
		int[] rightArray=null;             
		if(array.length<=1){
			return array;
		}
		int midpoint=(array.length)/2;
		if(array.length%2==0){
			leftArray=new int[midpoint];
			rightArray=new int[midpoint];
		}else{
			leftArray=new int[midpoint];
			rightArray=new int[midpoint+1];
		}
		for(int i=0;i<midpoint;i++){
			leftArray[i]=array[i];
		}
		for(int i=0;i<rightArray.length;i++){
			rightArray[i]=array[midpoint+i];
		}		
		int result[]=new int[array.length];		
		leftArray=mergeSort(leftArray);
		rightArray=mergeSort(rightArray);
		result=merge(leftArray,rightArray);
		printArray(result);
		System.out.println("");
		return result;
	}
	static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");			
		}
	}
	
	static int[] merge(int left[], int right[]){
	
		int result[]=new int[left.length + right.length];
		int leftPoint=0,rightPoint=0,resultPoint=0;
		while(leftPoint<left.length || rightPoint<right.length){
			if(leftPoint<left.length && rightPoint<right.length){
				if(left[leftPoint]<right[rightPoint]){
					result[resultPoint++]=left[leftPoint++];
				}else{
					result[resultPoint++]=right[rightPoint++];
				}
			}else if(leftPoint<left.length){
				result[resultPoint++]=left[leftPoint++];
			}else if(rightPoint<right.length){
				result[resultPoint++]=right[rightPoint++];
			}
		}		
		return result;
	}	
	
	public static void main(String args[]){
		int[] array={5,4,3,2,1,0,8,9,6,1};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		array=mergeSort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}