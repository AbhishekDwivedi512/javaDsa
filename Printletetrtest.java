public class Printletetrtest {
    public static void Printletter(String fullname) {

        for(int i=0;i<=fullname.length()-1;i++){
            System.out.println(fullname.charAt(i));
        }

    }
    public static boolean Plaindrom(String str) {
        int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            } 
    }
     return true;
    }
    public static void main(String[] args) {
        String fullname="AbhishekDwivedi";
        String str ="nitinm";

       // Printletter(fullname);
        System.out.println(Plaindrom(str));
       
    }
}
