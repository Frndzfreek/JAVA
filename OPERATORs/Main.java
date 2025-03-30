public class Main {
    public static void main(String[] args){
        String A="madhu";
        String B= "mitha";
        String b = (A+B);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(b.length());
        String c= A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String d= B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(c+" "+d);

    }
}
