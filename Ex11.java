public class Ex11 {
    public static void main(String[] args) {
        int n = 36; 

        System.out.println("Divizorii lui " + n + " sunt:");
        
        for (int i = 1; i <= n; i++) { 
            if (n % i == 0) { 
                System.out.println(i); 
            }
        }
    }
}
