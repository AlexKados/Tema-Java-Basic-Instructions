public class Ex3 {
    public static void main(String[] args) {
        int numar1 = 5; 
        int numar2 = 8; 

        if (numar1 % 2 == 0 && numar2 % 2 == 0) {
            int media = (numar1 + numar2) / 2; 
            System.out.println("Media aritmetica: " + media);
        } 
        else if (numar1 % 2 != 0 && numar2 % 2 != 0) {
            int produs = numar1 * numar2; 
            System.out.println("Produsul: " + produs);
        } 
        else {
            int suma = numar1 + numar2; 
            System.out.println("Suma: " + suma);
        }
    }
}
