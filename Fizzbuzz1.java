//A FizzBuzz by Lundgren Alexander 140826

public class Test {
    
    public static void main(String[] args) {
        int 
            min=1, 
            max=101, 
            iFizz=3, 
            iBuzz=5;
        
        String
            fizz="fizz",
            buzz="buzz";
        
        for (;min < max; min++)
            System.out.print(fizz(min, iFizz, fizz)+buzz(min, iFizz, iBuzz, buzz)+"\n");
    }
    
    static String fizz(int min, int iFizz, String fizz) {
        if (min%iFizz==0)return fizz;
        return "";
    }
    
    static String buzz(int min, int iFizz, int iBuzz, String buzz) {
        if (min%iBuzz==0) return buzz;
        if ("".equals(fizz(min, iFizz, buzz))) return Integer.toString(min);
        return "";
    }
}
