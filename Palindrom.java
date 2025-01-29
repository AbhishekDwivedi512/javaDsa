
public class Palindrom {
    public static void main(String[] args) {
            
    String s = "nitin";
    String reverse = "";
    for(int i=s.length()-1;i>=0;i--)
    reverse=reverse+s.charAt(i);
    if(s.equals(reverse)){
        System.out.println("String is palindrom");
    }
    else{
        System.out.println("string is not palindrom");
    }
}
}
