class Main{
    public static void main(String[] args){
        //Int to String
        
        int number = 123;
        String str = String.valueOf(number);
        System.out.println("Converted: " + str);
        
        int number = 123;
        String str = Integer.toString(number);
        System.out.println("Converted: " + str);
        
        int number = 123;
        String str = number + ""; // Just add empty string
        System.out.println("Converted: " + str);
        
        //String to int
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println("Converted: " + number);
        
        String str = "456";
        int number = Integer.valueOf(str);
        System.out.println("Converted: " + number);
    }
}
