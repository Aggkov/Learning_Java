public class User {
    private String fullName;
    private String username;
    private String password;
    private int role;

    public User(String fullName, String username, String password, int role) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "fullName= " + fullName + '[' +
                " username='" + username + ',' +
                ", password='" + password + ',' +
                " role=" + (role == 1? "Admin" : "User") + ']';

    }
}
