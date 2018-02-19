public class ImmutableLogin {
    private final String username;
    private final String password;

    public ImmutableLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String toString(){
        return "[ " + this.username + " ][" + this.password + " ]";
    }
}