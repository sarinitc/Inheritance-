public class SuperFerry extends Ferry{
    int t;
    int h;
    public  String draw(){
        return "This is overiding SuperFerry Draw";
    }
    public  String erase(){
        return "This is overiding SuperFerry Erase!";
    }
    public void moveRelative (int newT, int newH){
        t = newT;
        h = newH;

    }
}
