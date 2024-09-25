package com.examples;


 class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}


 class UserAuthenticationB {

    public boolean login(String username, String password) {
        //Logic for aunthetication
        System.out.println("USer" + username + "autnhnetiated ");
        return true;
    }

}

 class Email {

    //Logic for sending email
    public void sendEmail(String username) {
        System.out.println("Semding welcome email to USer" + username);

    }
}

public class UserAutenticationA {

    public static void main(String[] args) {

        User username= new User("username", "password");
        UserAuthenticationB userAuthenticationB = new UserAuthenticationB();
        Boolean authenticated=userAuthenticationB.login(username.getUsername(), username.getPassword());
        Email email = new Email();
        if(authenticated) {
            email.sendEmail(username.getUsername());
        }

    }
}

