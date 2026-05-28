import java.util.*;
class productxceptself{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
int[] res=new int[n];
res[0]=1;
int pro=1;
for(int i=1;i<n;i++){
	res[i]=res[i-1]*arr[i];
	pro=res[i];
}
System.out.println("Product:"+pro);
}
}