package sort_algo;

public class ShellSort {
	
	/**
	 * shell排序单次排序
	 * 插入排序的更一般形式，当delta=1时即为插入排序
	 * */
	public void shellInsertSort(int[] data, int size, int delta){
		for(int i=delta; i<size;i++){
			if(data[i] < data[i-delta]){
				int tmp = data[i];
				data[i] = data[i-delta];
				int idx = i - delta;
				while(tmp < data[idx]){
					data[idx+delta] = data[idx];
					idx -= delta;
					if(idx<0)
						break;
				}
				data[idx+delta] = tmp;
			}
			
			//打印每轮排序结果
			System.out.print("Round " + i + " : ");
			for(int j=0;j<size;j++){
				System.out.print(data[j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * shell sort
	 * 增量定为 n/2 n/4 ... 1
	 * */
	public void shellSort(int[] data){
		int size = data.length;
		int delta = size/2;
		while(delta>=1){
			this.shellInsertSort(data, size, delta);
			delta /= 2;
		}
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6};
		
		new ShellSort().shellSort(data);
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
	}
}
