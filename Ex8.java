public class Ex8 {
    public static void main(String[] args) {
        int n = 3; 
        int fact = 1; 
        
        for (int i = 1; i <= n; i++) { 
            fact *= i; 
        }
        
        System.out.println("Factorialul lui " + n + " este: " + fact); 
    }
}
