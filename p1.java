<<<<<<< HEAD
import java.util.Scanner;

public class currentbill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 250) {
            bill = 0;
        } else {
            bill = (units - 250) * 2;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
=======
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
>>>>>>> ac2215960279cf1adadd0825b1c0c6d5c547b765
}