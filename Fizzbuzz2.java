package test;

public class Fizzbuzztwo {
    public static void main(String[] args) {
        int fizz=3, buzz=5,
            min=1, max=100;
        fizzbuzz(fizz, buzz, min, max);
    }
    
    static void fizzbuzz(int fizz, int buzz, int min, int max) {
        for (;min<max;min++) {
            if (bfizzbuzz(min, fizz)) System.out.print("fizz");
            if (bfizzbuzz(min, buzz)) System.out.print("buzz");
            if (!bfizzbuzz(min, fizz)&&!bfizzbuzz(min, buzz)) System.out.print(min);
            System.out.print("\n");
        }
    }
    
    static boolean bfizzbuzz(int a, int b) {
        return a%b==0;
    }
}
