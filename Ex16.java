public class Ex16 {
    public static void main(String[] args) {
        int n = 64736; 

        System.out.println("Cifrele numarului " + n + " sunt:");

        while (n > 0) { 
            int cifra = n % 10; 
            System.out.println(cifra); 
            n /= 10; 
        }
    }
}
