public class direction {
    public static float sortestpath(String path) {
        int x=0;
        int y=0;
    for(int i=0;i<path.length();i++){
         char dir =path.charAt(i);
        if(dir == 'W'){
            x--;
        }
        else if(dir == 'N'){
            y++;
        }
        else if(dir == 'E'){
            x++;
        }
        else{
            y--;
        }
    }
    int x2 =x*x;
    int y2 =y*y;
     return (float)Math.sqrt(x2+y2);
        
    }

    public static void main(String[] args) {
        String path="WSEWWNNSWE";

        System.out.println(sortestpath(path));
    }
}
