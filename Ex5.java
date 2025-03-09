public class Ex5 {
    public static void main(String[] args) {
        int n = 6;
        int suma = 0; 
        
        for (int i = 1, numarPar = 2; i <= n; i++, numarPar += 2) {
            suma += numarPar; 
        }
        
        
        System.out.println("Suma primelor " + n + " numere pare este: " + suma);
    }
}

