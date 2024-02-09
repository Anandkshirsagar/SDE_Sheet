public class ArrayModerate {
    public static String SumTwo(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return "Yes";
                }
            }
        }

   return "No"; }

   public static void OnceTwos(int arr1[]){//Brute Aproch
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==0)cnt0++;
            if(arr1[i]==1)cnt1++;
            if(arr1[i]==2)cnt2++;
        }
        for(int y:arr1){
            System.out.print(y+" ");
        }
        for(int i=0;i<cnt0;i++){
            arr1[i]=0;
        }
        for(int j=cnt0;j<cnt0+cnt1;j++){
            arr1[j]=1;
        }
        for(int k=cnt0+cnt1;k<arr1.length;k++){
            arr1[k]=2;
        }
        System.out.println("After Arrange ");
        for(int x:arr1){
            System.out.print(x+" ");
        }
        }

        public static void OnceTwos1(int arr1[]){//optimal solution
       int low=0,mid=0,high=arr1.length-1;
       while(mid<=high){
        if(arr1[mid]==0){
            int swap=arr1[mid];
            arr1[mid]=arr1[low];
            arr1[low]=swap;
        mid++;
    low++;}
    else if(arr1[mid]==1){
        mid++;
    }
    else{
        int swap=arr1[mid];
        arr1[mid]=arr1[high];
        arr1[high]=swap;
        high--;
    }
       }
       for(int y:arr1){
        System.out.print(y+" ");
       }
        }

        public static void majority(int arr[]){
            
         for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                   }
            }
            if(cnt>arr.length/2){
                System.out.println(arr[i]+" "+cnt);
                break;
            }
         }
        }
 
        public static int maxSubArrSum(int arr1[]){
        int maxi=0;
       
        for(int i=0;i<arr1.length;i++){
            int sum=0;
            for(int j=i;j<arr1.length;j++){
            sum+=arr1[j];
            maxi=Math.max(sum,maxi);
            }
        }
        return maxi;}

        public static int stocks1(int arr2[]){
            int miniDayprice=arr2[0];
         for(int i=1;i<arr2.length;i++){
          int cost=arr2[i]-miniDayprice;
          int profit=Math.max(miniDayprice,cost);
          miniDayprice=Math.min(miniDayprice, arr2[i]);
         }
       return miniDayprice; }

       public static void Rearrange(int rearr[]){
        int n=rearr.length;
         int ans[]=new int[n];
         int j=0;
         int k=1;
         for(int i=0;i<n;i++){
         if(rearr[i]<0){
            ans[k]=rearr[i];
            k+=2;
         }
         if(rearr[i]>0){
            ans[j]=rearr[i];
            j+=2;
         }
         }
         for(int x:ans){
            System.out.print(x+" ");
         }
       }

    public static void main(String[] args) {
        //int arr[]={2,6,5,8,11};
        int Target=14;
       // System.out.println(SumTwo(arr,Target));
        //int arr1[]={1,1,0,2,0,1,2};
        //OnceTwos(arr1);
        //OnceTwos1(arr1);
        //int arr[]={1,1,2,3,3,3,3,3,3};
       // majority(arr);
       //int arr1[]={-2,-3,4,-1,-2,1,5,-3};   //7
       //System.out.println(maxSubArrSum(arr1));
       int arr2[]={7,1,5,3,6,4};
       //System.out.println(stocks1(arr2));
       int rearr[]={1,-2,-3,4,5,-6};
       Rearrange(rearr);
    }
}
