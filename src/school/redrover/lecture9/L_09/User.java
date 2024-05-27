package school.redrover.lecture9.L_09;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean active;

    public User (String username) {
        if (username.equals("iPhone")) {
            throw new RuntimeException("Bad username");
        } else {
            this.username = username;
                    }
    }

    public String getUsername() {
        return username;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String fullname) {
        String[]parts = fullname.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }


    public boolean isActive() {
        return active;
    }
    public void setPassword(String password){
        if(password.length() < 8) {
            System.out.println("Password is too short");
        } else {
            this.password = password;
        }
    }

    public boolean isPasswordCorrect(String passwordAttempt){
        return password.equals(passwordAttempt);
    }

}
