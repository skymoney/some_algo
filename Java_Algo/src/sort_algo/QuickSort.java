package sort_algo;

public class QuickSort {
	
	public int partition(int[] data, int low, int high){
		int pivotkey = data[low];
		int tmp;
		while(low < high){
			while( low<high && data[high] >= pivotkey)
				high--;
			tmp = data[high];
			data[high] = data[low];
			data[low] = tmp;
			
			while( low<high && data[low] <= pivotkey)
				low++;
			tmp = data[high];
			data[high] = data[low];
			data[low] = tmp;
		}
		return low;
	}
	
	public void quicksort(int[] data, int low, int high){
		if(low<high){
			int piviotLoc = partition(data, low, high);
			quicksort(data, low, piviotLoc-1);
			quicksort(data, piviotLoc+1, high);
		}
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6, 10, 8};
		
		new QuickSort().quicksort(data, 0, 9);
		System.out.println("排完序");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
}
