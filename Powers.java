public class Powers {
    
    static int square(int base) {
        return base * base;
    }
    
    
    static int cube(int base) {
        if (base > 8470) {
            System.out.println("Warning: The cube of " + base + " is outside of the range of int.");
        } else if (base == 0 || base == 1) {
            System.out.println("useless operation, but ok");
        } else {
            System.out.println("Nothing to worry about :-)");
        }
        return base * base * base;
    }


    public static void main(String[] args) {
        
    }
}
