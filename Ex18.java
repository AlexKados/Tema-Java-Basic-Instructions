public class Ex18 {
    public static void main(String[] args) {
        int n = 116378; 
        int minCifra = 9; 

        while (n > 0) { 
            int cifra = n % 10; 
            if (cifra < minCifra) { 
                minCifra = cifra; 
            }
            n /= 10; 
        }

        System.out.println("Cifra minima este: " + minCifra);
    }
}
