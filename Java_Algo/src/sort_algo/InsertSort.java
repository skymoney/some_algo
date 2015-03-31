package sort_algo;

/**
 * 插入排序
 * 稳定
 * 时间复杂度 O(n^2)
 * */
public class InsertSort {
	
	public int[] sort(int[] to_sort_data){
		if(to_sort_data.length == 0){
			return to_sort_data;
		}
		//int[] to_sort_data = data;
		for(int i=1;i<to_sort_data.length;i++){
			if(to_sort_data[i] < to_sort_data[i-1]){
				//如果第i个元素大于之前的有序列最后一个，不需要排序
				int tmp = to_sort_data[i];	//设为哨兵元素
				to_sort_data[i] = to_sort_data[i-1];	//先后移一个元素
				int idx = i-1;		//标志当前的比较idx
				//System.out.println(idx);
				while(tmp < to_sort_data[idx]){
					to_sort_data[idx+1] = to_sort_data[idx];
					idx--;
					if(idx == -1){
						break;
					}
				}
				to_sort_data[idx+1] = tmp;  //比较完成，在对应位置插入
			}
			
			System.out.print("Round " + i + " : ");
			for(int j=0;j<to_sort_data.length;j++){
				System.out.print(to_sort_data[j] + " ");
			}
			System.out.println();
		}
		
		return to_sort_data;
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6};
		int[] sorted_data = new InsertSort().sort(data);
		
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
	}
}
