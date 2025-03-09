public class Ex12 {
    public static void main(String[] args) {
        int n = 80; 

        System.out.println("Divizorii primi ai lui " + n + " sunt:");
        
        for (int i = 2; i <= n; i++) { 
            if (n % i == 0 && estePrim(i)) { 
                System.out.println(i); 
            }
        }
    }

    public static boolean estePrim(int numar) {
        if (numar < 2) {
            return false;
        }
        for (int i = 2; i * i <= numar; i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }
}
