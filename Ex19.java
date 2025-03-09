public class Ex19 {
    public static void main(String[] args) {
        int n = 536; 
        int invers = 0; 

        while (n > 0) { 
            int cifra = n % 10; 
            invers = invers * 10 + cifra; 
            n /= 10; 
        }

        System.out.println("Inversul numarului este: " + invers); 
    }
}
