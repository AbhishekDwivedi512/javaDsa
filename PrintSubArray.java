public class PrintSubArray {
    
    public static void printsubarray(int arr[]) {
        int ts =0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    
                }
                
                System.out.println();
            }
            System.out.println();
        }
        
       
    }
    public static void maximumSubArray(int arr[]) {
        int MaxSum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int CurrentSum=0;
                for(int k=i;k<=j;k++){  
                   CurrentSum +=arr[k];
                }
                   System.out.println(CurrentSum);
                   if(MaxSum<CurrentSum){
                    MaxSum = CurrentSum;
                   }

               
            }
           
        }
        System.out.println("The maximum Sum of the array ="+MaxSum);
        
    }
    
        public int maxSubArray(int[] nums) {
            int maxSum=Integer.MIN_VALUE;
            int [] prifix = new int[nums.length];
            prifix[0]=nums[0];
            for(int i=1;i<prifix.length;i++){
                prifix[i] =prifix[i-1]+nums[i];
            }
            for(int i=0;i<nums.length;i++)   //prifix array
            {
    
                for(int j=i;j<nums.length;j++)
                {
                    
                  int currentSum = i ==0 ? prifix[j]: prifix[j] -prifix[i-1];
                    
                    if(maxSum<currentSum){
                        maxSum =currentSum;
                    }
                }
            }
            return maxSum;
        }
    public static void main(String[] args) {
        
        int arr[] ={2,4,6,8,10};
       // printsubarray(arr);
       maximumSubArray(arr);
    }
}
