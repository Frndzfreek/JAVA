package OOPs;

// class Student{
//     String regno;
//     String name;//global variable
//     float fee;
    
//     Student(String regno,String name,float fee){
//         regno=regno;
//         name=name;
//         fee=fee;
//     }
//     void display(){
//         System.out.println(regno+" "+name+" "+fee);
//     }
//     public static void main(String[] args){
//         Student obj = new Student("24BVD1068","madhu",25.7f);
//         obj.display();
//     }
// }


// class Student{
//     String regno;
//     String name;//global variable
//     float fee;
    
//     Student(String regno,String name,float fee){
//         this.regno=regno;
//         this.name=name;
//         this.fee=fee;
//     }
//     void display(){
//         System.out.println(regno+" "+name+" "+fee);
//     }
//     public static void main(String[] args){
//         Student obj = new Student("24BVD1068","madhu",25.7f);
//         obj.display();
//     }
// }


// class Student{//this=to invoke current class method
//     String regno,name;//global variable
//     float fee;
    
//     Student(String regno,String name,float fee){//constructor parameters
//         this.regno=regno;
//         this.name=name;
//         this.fee=fee;
//     }
//     void greet(){
//         System.out.println("welcome");
//     }
//     void display(){
//         //this.greet();//calls greet method inside display method
//         System.out.println(regno+" "+name+" "+fee);
//     }
//     public static void main(String[] args){
//         Student obj1 = new Student("24BVD1068","madhu",25.7f);
//         obj1.greet();
//         obj1.display();
//     }
// }


class Student{//this=to invoke current class constructor
    String regno,name,programme;//global variable
    float fee;
    
    Student(String regno,String name,String programme){//constructor 3-parameters
        this.regno=regno;
        this.name=name;
        this.programme=programme;
    }
    //constructor overloading
    Student(String regno,String name,String programme,float fee){//constructor 4-parameters
        this(regno,name,programme);//invoking the prev constructor
        this.fee=fee;
    }
    
    void display(){
        System.out.println(regno+" "+programme+" "+fee);
    }
    
    public static void main(String[] args){
        Student s1=new Student("24BVD1068","madhu","Electrical");
        Student s2=new Student("24BVD1068","madhu","Electrical",2000f);
        s1.display();
        s2.display();
    }
}
