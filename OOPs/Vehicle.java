class Vehicle{
    int speed;
    Vehicle(int speed){
        this.speed=speed;
    }
    
    public void maxspeed(){
        System.out.println("Too fast");
    }
}
class Bike extends Vehicle{
    Bike(int speed){
        super(speed);
    }
    @Override
    public void maxspeed(){
        System.out.println("Too slow");
    }
}
class Main{
    public static void main(String[] args){
        Vehicle obj1=new Vehicle(12);
        obj1.maxspeed();
        Bike obj2=new Bike(13);
        obj2.maxspeed();
    }
}