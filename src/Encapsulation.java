//Private data + Public methods = Encapsulation
//  is the process of hiding data using private variables and providing controlled access through public methods.
public class Encapsulation {
    // id , username, email, password, private
    // method get(), set()---> public
    private int id ;
    private String username;
    private String email;
    private String password;

    // set --> void with param
    public  void setId(int id ){
        this.id = id;
    }
    public void setUserName(String username){
        this.username= username;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public  void setPassword(String password){
        this.password = password;
    }
    // get ---> return type no param
    public int getId(){
        return id;
    }
    public  String getUserName(){
        return username;
    }
    public  String getEmail() {
        return email;
    }
    public String getPassword(){
        return  password;
    }



}
