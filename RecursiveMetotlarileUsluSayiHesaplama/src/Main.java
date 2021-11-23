public class Main {

    static int usluSayi(int base , int exponent){
        if (exponent == 1)
            return base;

        return base * usluSayi(base,exponent-1);
    }

    public static void main(String[] args) {
	    System.out.println(usluSayi(5,3));
    }
}
