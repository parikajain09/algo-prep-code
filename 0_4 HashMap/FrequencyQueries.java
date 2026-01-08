import java.util.*;

public class FrequencyQueries
{
	public static void main(String[] args) {
		

      
		// write your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int[] queries = new int[M];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}
		for(int j = 0; j < M; j++){
			queries[j] = sc.nextInt();
		}
       HashMap <Integer,Integer> hm = new HashMap <> ();
		for(int i = 0 ; i < N ; i++){
			if(hm.containsKey(arr[i]) == true){
				int temp = hm.get(arr[i]);
				hm.put(arr[i],temp + 1);
			}
			else{
				hm.put(arr[i],1);
			}
		}
		for(int j = 0; j < M; j++){
			if(hm.containsKey(queries[j]) == true){
				
				System.out.println(hm.get(queries[j]));
			}
			else{
				System.out.println(0);
			}
		}
	
    }
}

// Time Complexity: O(N + M)
// Space Complexity: O(N)

// Sample Input
// 9 2
// 2 8 6 9 8 6 8 2 11
// 2 8

// Sample Output
// 2
// 3

