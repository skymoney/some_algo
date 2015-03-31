package sort_algo;

/**
 *简单选择排序
 * 每轮遍历，将最小的值和第一个元素交换
 *
 *改进：
 *	可以考虑二元选择，每轮遍历选取最小和最大的，这样最多遍历 [n/2] 轮
 **/
public class SimpleSelectionSort {
	public int minKey(int[] data, int start, int end){
		int k = start;
		int tmp = data[start];
		for(int i=start+1;i<end;i++){
			if(data[i] < tmp){
				k = i;
				tmp = data[i];
			}
		}
		return k;
	}
	
	public void simpleSelectSort(int[] data){
		int k = 0;
		
		for(int i=0;i<data.length;i++){
			k = this.minKey(data, i, data.length);
			int tmp = data[i];
			data[i] = data[k];
			data[k] = tmp;
		}
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6};
		
		new SimpleSelectionSort().simpleSelectSort(data);
		
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
}
