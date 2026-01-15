public class Cars extends Vehicle {
    @Override
    public String draw(){
     return "This is overrideing child from parent Cars ";
    }
    @Override
    public String erase(){
        return "This is overriding child from Parents Erase Cars!!";
    }
}

