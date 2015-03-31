package sort_algo;

/**
 * 冒泡排序
 * */
public class BubbleSort {
	
	public void bubbleSort(int[] data){
		for(int i=0;i<data.length;i++){
			for(int j=i;j<data.length;j++){
				if(data[i] > data[j]){
					int tmp = data[j];
					data[j] = data[i];
					data[i] = tmp;
				}
			}
		}
		
		System.out.print("完成后: ");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6};
		new BubbleSort().bubbleSort(data);
	}
}
