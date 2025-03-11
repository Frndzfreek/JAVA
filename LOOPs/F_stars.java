package LOOPS;

class F_stars {
    public static void main(String[] args){
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //}

        //Diamond
        int n = 5; // number of rows
        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("$");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
