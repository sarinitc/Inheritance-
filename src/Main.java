//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal objAnimal = new Animal();
        objAnimal.eat();
        objAnimal.sleep();
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


    }
}