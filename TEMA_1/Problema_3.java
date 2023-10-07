public class Main
{
    public static void main(String[] args) {
        
        int n = 12;
        
        System.out.print("Divizorii proprii ai lui " +n+" sunt: ");
        
        for (int i = n/2; i >= 2; i--){
            if (n % i == 0){
                System.out.print(i+" ");
            }
        }
        
    }
}
