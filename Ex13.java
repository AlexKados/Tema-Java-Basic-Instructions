public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Perechile de numere a caror suma este 1000:");
        
        for (int a = 17; a < 1000; a += 17) { 
            int b = 1000 - a; 
            
            if (b % 19 == 0) { 
                System.out.println("(" + a + ", " + b + ")"); 
            }
        }
    }
}
