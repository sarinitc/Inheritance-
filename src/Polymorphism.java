//  Polymorphism
// Poly( many) + Morphism (form) ---> many form
// example Person can be a doctor and can be a police
// Polymorphism have 2 type   Static ( overloading method  and Dynamic  compile( override method ) run time


// override method dynamic polymorphism
public class Polymorphism extends Vehicles {
    // override method
    @Override
    public  void getInfo
    (){
        System.out.println("This is override method from Vehicle from Polymorphsim");
    }

}
