//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal objAnimal = new Animal();
        objAnimal.eat();
        objAnimal.sleep();
        objAnimal.sound();

        objAnimal.sound();



        System.out.println("\n----------------");
        System.out.println("Reptile child of Animal");
        Reptile objReptile = new Reptile();
        objReptile.eat();
        objReptile.sleep();
        objReptile.crawl();
        System.out.println("\n----------------------------");
        Momal objMomal = new Momal();
        objMomal.sleep();
        objMomal.eat();
        objMomal.breastfeed();
        System.out.println("\n----------------------------");
        Human h = new Human();
        h.eat();
        h.sleep();
        h.breastfeed();
        h.speak();
        h.walk();


        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        Person m = new Person();
        System.out.println(m.MessageGreeting());
        Customer c = new Customer();
        System.out.println(c.MessageGreeting());

        System.out.println("\n----------------------------");
        Super S = new Super();
        S.display();
        System.out.println("Super speed"+ S.speed);
        System.out.println("\n----------------------------");
        Car C = new Car();
        System.out.println("Car's speed"+ C.speed);// parent
        C.display();
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.draw());
        System.out.println(vehicle.erase());
       vehicle.setVisible(false);
       vehicle.move(120,3999);
       vehicle.move(40000,3930);
       vehicle.setSize(12,45);
       vehicle.setColor("Yellow");
       Cars cars = new Cars();
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
       System.out.println(cars.draw());

        System.out.println(cars.erase());
        cars.setVisible(false);
        //inheritance Parent Vehicle and child Cars and have some method overriding
        cars.move(400,500);
        cars.setSize(10,12);
        cars.setColor("Blue!!");
        Boat boat = new Boat();
     System.out.println(boat.draw());
     System.out.println(boat.erase());
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        Ferry ferry = new Ferry();

        System.out.println(ferry.erase());
        System.out.println(ferry.erase());
        ferry.setVisible(true);
        ferry.move(23,45);
        ferry.setSize(78,90);
        ferry.setColor("Red!");
        System.out.println("\n----------------------------");
        System.out.println("\n----------------------------");
        SuperFerry Sup = new SuperFerry();
        System.out.println(Sup.draw());
        System.out.println(Sup.erase());
        Sup.setVisible(true);
        Sup.move(20000,30000);
        Sup.setSize(4000,49494);
        Sup.setColor("Green");
        Sup.moveRelative(50,60);


        System.out.println("(((((((((((((((((((()))))))))))))))))");
        Encapsulation En = new Encapsulation();
        En.setId(123456789);
        En.setUserName("CHEAVSARIN!!!");
        En.setEmail("cheavsarin@gmail.com");
        En.setPassword("sarin123456789");
        System.out.println("Enter your ID:"+ En.getId());
        System.out.println("Enter your UserName:"+ En.getUserName());
        System.out.println("Enter your Email :"+ En.getEmail());
        System.out.println("Enter your PassWord:"+ En.getPassword());

        System.out.println("(((((((((((((((((((()))))))))))))))))");
Encapsulation En1 = new Encapsulation();
En1.setId(2);
En1.setUserName("Ling");
En1.setEmail("cheavsarin65@gmail.com");
En1.setPassword("sarin123456788");
System.out.println("Enter your ID:"+ En1.getId());
System.out.println("Enter your UserName:"+ En1.getUserName());
System.out.println("Enter your Email:"+ En1.getEmail());
System.out.println("Enter your PassWord:"+ En1.getPassword());


System.out.println("=========================");
Exercise_Encapsulation EE = new Exercise_Encapsulation();
EE.setName("Ly Mey");
EE.setAge(29);
EE.setCountry("Cambodia");
System.out.println("This is your Name:"+EE.getName());
System.out.println("This is your Age:"+EE.getAge());
System.out.println("This is your Country:"+ EE.getCountry());
        System.out.println("=========================");
        Exercise_Encapsulation EE1 = new Exercise_Encapsulation();
        EE1.setName("Rothna");
        EE1.setAge(19);
        EE1.setCountry("Canada");
        System.out.println("This is your Name:"+EE1.getName());
        System.out.println("This is your Age:"+EE1.getAge());


        System.out.println("================================");
       Supers Su = new Supers();
       Su.printName();
        /// Dynamic polymorphism ---> override method

        /// Vehicle chile and Polymorphism parent   .
        //Parant can create object child so parent can as a child
        // so this is call Polymorphism
        Vehicles vehicles = new Polymorphism();
        vehicles.getInfo();
        vehicles.getInfo("Sarin");
        vehicles.getInfo(2);
        System.out.println("===============================================");
        vehicles.getInfo("Sarin Oveloading ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++=");

        // Static polymorphism --> method overloading
        Vehicles V = new Vehicles();
        V.getInfo();
        V.getInfo("Sarin");
        V.getInfo(2);







    }
}