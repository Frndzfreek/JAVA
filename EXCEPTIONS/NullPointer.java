package EXCEPTIONS;

class NullPointer{
    public static void main(String[] args){
        try{
            String s=null;
            System.out.println(s.length());
            
            int[] arr=new int[2];
            System.out.println(arr[5]);
        }catch(NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}