package sort_algo;

public class HeapSort {
	/**
	 * 调整堆
	 * 堆存储为data，待调整位置为 pos
	 * 调整为一个小项堆
	 * */
	public void headAdjust(int[] data, int pos, int length){
		int tmp = data[pos];
		int child = 2 * pos + 1;  //当前点的左子节点，从0开始计数所以为 2*i+1
		
		while(child < length){
			if( (child+1) < length && data[child] > data[child+1]){
				child ++;
			}
			
			if(data[pos] > data[child]){
				//如果较小的子节点小于父节点，则子节点移动到父节点
				data[pos] = data[child];
				pos = child;
				child  = 2 * pos + 1;
			}else{
				break;
			}
			data[pos] = tmp;
		}
	}
	
	/**
	 * 初始化一个堆，构建成一个小项堆
	 * */
	public void initHead(int[] data){
		//最后一个拥有子节点的位置 i = (legth-1)/2;
		for(int i=(data.length-1)/2 ;i>=0;i--){
			this.headAdjust(data, i, data.length);
		}
	}
	
	public void headSort(int[] data){
		this.initHead(data);
		
		System.out.println("初始化小项堆： ");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		for(int i=data.length -1 ;i>0;i--){
			//从最后一个元素开始调整
			int tmp = data[0];
			data[0] = data[i];
			data[i] = tmp;
			this.headAdjust(data, 0, i);
		}
	}
	
	public static void main(String[] args){
		int[] data = {3,1,5,7,2,4,9,6};
		
		new HeapSort().headSort(data);
		System.out.print("排序后： ");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
		}
	}
}
