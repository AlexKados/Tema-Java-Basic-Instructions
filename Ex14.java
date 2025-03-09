public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Perechile de numere a caror suma este 1000:");
        
        for (int a = 1; a < 1000; a++) { 
            if (a % 17 == 0 || a % 13 == 0) { 
                int b = 1000 - a; 
                
                if (b % 19 == 0 || b % 7 == 0) { 
                    System.out.println("(" + a + ", " + b + ")"); 
                }
            }
        }
    }
}
