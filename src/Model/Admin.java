package Model;

public class Admin {
    private String username;
    private String password;

    public Admin(){
        username="Admin";
        password="Admin";
    }
    public Admin(String username,String password){
        this.username=username;
        this.password=password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    
   
    public String toString() {
        return "[ Username : "+username+" ] is Admin Now";
    }
}