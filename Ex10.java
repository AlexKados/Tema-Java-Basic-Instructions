public class Ex10 {
    public static void main(String[] args) {
        int numar = 1001; 

        while (true) { 
            boolean estePrim = true; 
            
            for (int i = 2; i * i <= numar; i++) { 
                if (numar % i == 0) {
                    estePrim = false;
                    break;
                }
            }
            
            if (estePrim) { 
                System.out.println("Cel mai mic numar prim mai mare ca 1000 este: " + numar);
                break;
            }
            
            numar++; 
        }
    }
}
