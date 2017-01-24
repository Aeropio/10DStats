import java.util.*;

public class MeanMed{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		//declare array of num size
		int arr[] = new int[num];
		int index=0;
		for(int i=0;i<num;i++){
			arr[index++] = sc.nextInt();
			
		}
		//mean 
		float mean = 0.0f;
		int sumOfNum = 0;
		for(int i:arr){
			sumOfNum += i;
		}
		mean = (float)sumOfNum/arr.length;
		System.out.println(mean);
		//median
		Arrays.sort(arr);
		float median = 0.0f;
		if(arr.length%2==0){
			int index1 = (arr.length/2)-1;
			int index2 = arr.length/2;
			int sum = (arr[index1]+arr[index2]);
			median = (float)sum/2;
			System.out.println(median);

		}
		else{
			median = (float)arr[(arr.length/2)+1];
		}

		//mode
		int mode = 0;
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		for(int i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i,1);
			}
		}
		//System.out.println("///////////////////////////");
		int maximum = -1;
		int key = 0;
		 for(Map.Entry m:map.entrySet()){ 
		 	int value = (int)m.getValue();
		 	if(value>maximum) {
		 		maximum = value;
		 		int temp = (int)m.getKey();
		 		key = temp;
		 	}
   			
  		} 
  		mode = key;
  		System.out.println(mode);

		
	}
}