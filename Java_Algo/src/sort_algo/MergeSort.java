package sort_algo;

/**
 * 归并排序
 * */
public class MergeSort {
	
	public int[] sorted_merge(int[] a, int[] b){
		int aIdx = 0;
		int bIdx = 0;
		int cIdx = 0;
		int[] c = new int[a.length + b.length];
		while( aIdx < a.length && bIdx < b.length){
			if(a[aIdx] < b[bIdx])
				c[cIdx++] = a[aIdx++];
			else
				c[cIdx++] = b[bIdx++];
		}
		
		while(aIdx<a.length)
			c[cIdx++] = a[aIdx++];
		while(bIdx<b.length)
			c[cIdx++] = b[bIdx++];
		
		return c;
	}
	
	public int[] mergeSort(int[] data){
		if(data.length <= 1)
			return data;
		int half = data.length / 2;
		int[] left = new int[half];
		int[] right = new int[data.length - half];
		
		//alloc data to left and right
		System.arraycopy(data, 0, left, 0, left.length);
		System.arraycopy(data, half, right, 0, right.length);
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return sorted_merge(left, right);
	}
	
	public static void main(String[] args){
		int data[] = {3,1,5,7,2,4,9,6,10,8};
		int[] b = new MergeSort().mergeSort(data);
		
		System.out.println("归并排序结束： ");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i] + " ");
		}
	}
}
