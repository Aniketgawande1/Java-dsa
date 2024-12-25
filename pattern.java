public class pattern {

    public static void main(String[] args) {
        // for (int i = 1; i <= 205; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
                
        //     }
        //     // System.out.println();
        int n = 7;
        for (int i = 1; i<=n; i++) {
            for (int j =1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


            
        }
        
    }
