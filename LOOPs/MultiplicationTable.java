package LOOPS;

class MultiplicationTable {
    public static void main(String[] args){
        //int n = 2;
        // for (int i =1;i<=10;i++){
        //     System.out.println(n+"x"+i+"="+n*i);
        // }
        //or
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
