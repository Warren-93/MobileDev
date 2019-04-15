package project.suzieqcraft.Model;

public class User {

    protected String username;
    protected String userEmail;
    protected boolean loggedIn;

    public User() {
        this.userEmail = "";
        this.username = "";
        this.loggedIn = false;
    }

    public boolean setLoggedIn(){
        this.loggedIn = true;
        return loggedIn;
    }

    public boolean setLoggedOut(boolean loggedIn){
        this.loggedIn = false;
        return loggedIn;
    }

    public boolean isLoggedIn(){
        return this.loggedIn;
    }

    public String setEmail(String userEmail){
        this.userEmail = userEmail;
        return this.userEmail;
    }

    public String getEmail(){
        return this.userEmail;
    }

    public String setUsername(String username){
        this.username = username;
        return this.username;
    }
}
