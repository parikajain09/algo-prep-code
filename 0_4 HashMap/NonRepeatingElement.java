import java.util.*;
public class NonRepeatingElement {
	public static void main(String[] args) {
		// write your code here
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] arr = new long[N];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextLong();
		}
		boolean found = false;
		HashMap <Long,Integer> hm = new HashMap<>();
		for(int i = 0 ; i < N; i++){
			if(hm.containsKey(arr[i]) == true){
				int temp = hm.get(arr[i]);
				hm.put(arr[i], temp+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}
		for(int j = 0; j < N; j++){
			long val = arr[j];
			if( hm.get(val) == 1){
               System.out.println(val);
			   found = true;
			}
			
		}
		if (found == false){
			System.out.println(-1);
		}
		
	}
}

//Time Complexity: O(N+N) ~= O(2N) ~= O(N)
//Space Complexity: O(N)

//Input:
// 5        
// 2 3 1 3 2
//Output:   
// 1


//Input:
// 4
// 9 9 9 9
//Output:   
// -1
