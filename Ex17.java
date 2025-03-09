public class Ex17 {
    public static void main(String[] args) {
        int n = 43778; 
        int maxCifra = 0; 

        while (n > 0) { 
            int cifra = n % 10; 
            if (cifra > maxCifra) { 
                maxCifra = cifra; 
            }
            n /= 10; 
        }

        System.out.println("Cifra maxima este: " + maxCifra); 
    }
}
