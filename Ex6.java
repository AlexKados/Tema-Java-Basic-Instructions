public class Ex6 {
    public static void main(String[] args) {
        int n = 5; 
        int suma = 0; 

        for (int i = 1; i <= n * 2; i += 2) { 
            suma += i; 
        }

        System.out.println("Suma primelor " + n + " numere impare este: " + suma);
    }
}
