package OOPs;

class addition{
    //method
   void add(int a,int b){
       int c = a+b;
       System.out.println(c);
   }
   //method overloading
   void add(int a, int b,int c){
       int d=a+b+c;
       System.out.println(d);
   }
   
   public static void main(String[] args){
       addition obj=new addition();
       obj.add(3,4,1);
       
   }
}
