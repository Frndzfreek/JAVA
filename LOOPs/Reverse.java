public class Reverse {
    public static void main(String[] args){
        //counting number
        // int num=34567;
        // int a = num;
        // int count=0;
        // while(a>0){
        //     a/=10;
        //     count++;
        // }
        // if(num==0){
        //     count = 1;
        // }
        // System.out.println(count);


        String original="Hello";
        String reversed="";
        for (int i = original.length()-1;i>=0;i--){
            reversed+=original.charAt(i);
        }
        System.out.println(reversed);
    }
}
