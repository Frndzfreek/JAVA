package LOOPS;

class prime {
    public static void main(String[] args){
        int n = 78;
        if(n<2){
            System.out.println("Neither Prime nor composite");
        }
        else{
            boolean Prime=true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    Prime = false;
                    break;
                }
            }
            
            if (Prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        }
    }
}
