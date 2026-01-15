public class Exercise_Encapsulation {
    private  String name;
    private  int age;
    private  String country;
    // set
    public void setName (String name ){
        this.name= name;

    }
    public  void setAge(int age) {
    this.age= age;
    }
    public  void setCountry(String country){
        this.country= country;
    }
    // get
    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public  String getCountry(){
        return country;
    }

}
