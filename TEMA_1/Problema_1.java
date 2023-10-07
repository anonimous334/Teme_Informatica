public class Main
{
    public static void main(String[] args) {
        
        //int n = 20;
        
        //int x = 0;
        //int y = 1;
        
        //System.out.print(x+" "+y+" ");
        
        /*for(int i = 2; i < n; i++){
            if (x < y){
                x += y;
                System.out.print(x+" ");
            }
            else {
                y += x;
                System.out.print(y+" ");
            }
        }*/
        /*int i = 2;
        
        while (i != n){
            if (x < y){
                x += y;
                System.out.print(x+" ");
            }
            else {
                y += x;
                System.out.print(y+" ");
            }
            i++;
        }*/
        
        int n = 1234579;
        int rez = 0;
        
        while (n != 0){
            int c = n % 10;
            if (c % 2 == 1){
                rez = rez * 10 + c;
            }
            n /= 10;
        }
        
        System.out.println(rez);
    }
}
