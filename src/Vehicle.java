//Parent Vehicle >>> child Cars and Boat
//  Cars parent Ferry and method draw , erase overriding  .
//  Ferry parent and child SuperFerry and method draw , erase overriding .


public class Vehicle {
    boolean  Vehicle;
    int a;
    int b;
    int x;
    int y;

    public String draw (){
        return "This is Draw!!";
    }
    public String erase(){
        return "This is Erase";
    }
    void setVisible(boolean v){
        Vehicle = v;
        System.out.println("True or false:"+v);

    }
// constructor with parameter
     void move (int newX, int newY){
         x = newX;
         y= newY;
         System.out.println("NewX:"+newX);
         System.out.println("NewY:"+newY);



     }

     void setSize(int newA, int newB){
         a = newA;
         b = newB;
         System.out.println("Enter your size:"+newA);
         System.out.println("Enter you site here!!"+newB);

     }
     String color;
      void setColor(String color){
         this.color = color;
         System.out.println("Enter your color:"+color);


      }

}
