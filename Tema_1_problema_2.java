public class Main
{
    public static void main(String[] args) {
        
        int n = 2104639;
        int nr_p = 0;
        int nr_i = 0;
        
        while (n != 0){
            int c = n % 10;
            if (c % 2 == 1){
                nr_i++;
            } else nr_p++;
            n /= 10;
        }
        
        System.out.println("Numere pare: "+nr_p+" Numere impare: "+nr_i);
    }
}
