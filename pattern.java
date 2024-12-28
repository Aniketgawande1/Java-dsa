public class pattern {

    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows;i++){
            for(int j =1; j<=totCols;j++ ){
                if (i == 1 || i == totRows || j == 1|| j == totCols) {
                    System.out.print("*");
                    
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();

        }
    }

    public static void pyramid_triangle(int n ){
        for(int i = 1;  i<=n;i++ ){
            //spaces
            for(int j = 1; j <= n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        } 
    }

    public static void inverted_pyramid_triangle(int n ){
        for(int i = 1;  i<=n;i++ ){
            //spaces
            for(int j = 1; j <=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    public static void unknown(){
         // for (int i = 1; i <= 205; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
                
        //     }
        //     // System.out.println();
        // int n = 7;
        // for (int i = 1; i<=n; i++) {
        //     for (int j =1; j <=n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }
    public static void butterfly_pattern(int n){
        //1st half
        for (int i = 1; i <=n; i++) {
            //stars - i
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

        // 2nd half

        for (int i = n; i >=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            //spaces - 2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        hollow_rectangle(5, 5);
        pyramid_triangle(5);
        inverted_pyramid_triangle(6);
        butterfly_pattern(5);

       

            
        }
        
    }

    