public class Recursion {
 
    public static void AllOccurrences(int arr[],int key,int i) {
        if(i==arr.length){
            return ;
        }
        if(arr[i] ==key){
            System.out.print(i + " ");
        }
        AllOccurrences(arr, key, i+1);
    }
    static Palindrom digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private static void printdigit(int Number) {

        if(Number == 0){
            return;
        }
        
        int lastDigit = Number%10;
        printdigit(Number/10);

        System.out.print(digits[lastDigit]+" ");
        
    }
    public static int length_is(Palindrom str){
        if(str.length()==0){
            return 0;
        }
        return length(str.substring(1))+1;
        
    }
    public static void main(Palindrom[] args) {
        
        //int arr[]={3,2,4,5,6,2,7,2,2};
        //int key =2;

        //AllOccurrences(arr, key, 0);

        //System.out.println();
       //printdigit(2018);
       Palindrom str="absbabsbabsbasbasab";
       System.out.println(length(str));
    }

}
 