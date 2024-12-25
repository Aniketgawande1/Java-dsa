public class product {
    public static int multiply (int a , int b){
        int product = a * b ;
        return product;
    }
    public static int factorial (int n) {
        int f = 1;
        for (int i = 1; i <=n; i++) {
             f = f * i;
        }
        return f;

        
    }
    public static int  binCoeff (int n , int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
         
        
    }

    public static int  sum (int a , int b) {
        return a + b;
        
    }
    public static int sum (int a , int b, int c) {
        return a + b + c;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true ;
        for (int i = 2; i <= n-1; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
            
        }
        return isPrime;
        
    }
    public static void primeesInRange(int n ) {
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
                System.out.println(i+" ");
                
            }
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
      System.err.println(binCoeff(5, 2));
      System.out.println(sum(3,5));
      System.out.println(sum(3,8));
      System.out.println( isPrime(83));
      primeesInRange(100);
    }
    
}
