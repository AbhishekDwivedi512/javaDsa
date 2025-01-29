public class RemoveDuplicate{

public static void  removeduplicate( Palindrom str,int idx,StringBuilder newStr,boolean map[]){
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    //kam
    char CurrentChar= str.charAt(idx);
    if(map[CurrentChar -'a'] == true){
        removeduplicate(str, idx+1, newStr, map);
    }else
    {
        map[CurrentChar -'a'] =true;
        removeduplicate(str, idx+1, newStr.append(CurrentChar), map);
    }
    
}
public static void main(Palindrom[] args) {
    Palindrom str = "appnacollege";
    removeduplicate(str, 0,new StringBuilder(), new boolean[26]);
}
} 