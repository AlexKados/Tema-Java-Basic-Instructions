public class Ex7 {
    public static void main(String[] args) {
        int n = 4; 
        int suma = 0; 

        for (int i = 1; i <= n; i++) {
            suma += i; 
        }

        double media = (double) suma / n;

        
        System.out.println("Media aritmetica a primelor " + n + " numere este: " + media);
    }
}
