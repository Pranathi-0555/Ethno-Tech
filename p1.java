import java.util.*;
class p1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		pairsum(arr,target,n);
	}
		public static void pairsum(int[] arr,int target,int n){
			HashSet<Integer> set=new HashSet<>();
			for(int num:arr){
				int rem=target-num;
				if(set.contains(rem)){
					System.out.println("["+num+","+rem+"]");
				}
				set.add(num);
			}
		}
}