package OOPs;

import java.util.Scanner;
class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println(title+" "+author+" "+price);
    }
}
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String title=scan.nextLine();
        String author=scan.nextLine();
        double price=scan.nextDouble();
        Book book=new Book(title,author,price);
        book.display();
    }
}