public class Ex4 {
    public static void main(String[] args) {
        int numar1 = 7; 
        int numar2 = 1; 
        int numar3 = 4; 

        
        int minim = numar1; 
        
        if (numar2 < minim) {
            minim = numar2; 
        }
        if (numar3 < minim) {
            minim = numar3; 
        }
        
        
        System.out.println("Valoarea minima este: " + minim);
    }
}
