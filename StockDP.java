public class StockDP {
   public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4};
    int pro=0;
int mini=arr[0];
for(int i=1;i<arr.length;i++){
    int cost=arr[i]-mini;
    pro=Math.max(pro,cost);
    mini=Math.min(mini,arr[i]);
}
System.out.println(pro);
   }
}
