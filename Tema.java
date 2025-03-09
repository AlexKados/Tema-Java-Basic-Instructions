
public class Tema {
	
	public static void main(String[] args) {
        int numar = 12; 
        
       
        if (numar < 1 || numar > 10) {
            System.out.println("INVALID"); 
        } else if (numar > 5) {
            System.out.println("ADMIS"); 
        } else { 
            System.out.println("RESPINS"); 
        }
    }
}