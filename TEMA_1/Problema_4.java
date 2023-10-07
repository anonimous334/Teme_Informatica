public class Main
{
    public static void main(String[] args) {
        
        int n = 6;
        int a = 2;
        int b = 7;
        
        System.out.print(a+" "+b+" ");
        
        for (int i = 2; i < n; i++){
            if (a < b){
                a += b;
                System.out.print(a+" ");
            } else {
                b += a;
                System.out.print(b+" ");
            }
        }
        
    }
}
