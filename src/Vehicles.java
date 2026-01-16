// Static polymorphism ---> method overloading


public class Vehicles {
    public  void getInfo(){
        System.out.println("This is general information ");

    }
    public void getInfo(String name){
        System.out.println("This vehicle name:"+ name);
    }
    public  void getInfo(int leg){
        System.out.println("This is animal leg:"+ leg);

    }

}
