package com.example.BookStoreApplication.Auth;

public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;


        public RegisterRequest() {
        }

        public RegisterRequest(String firstname,String lastname, String email, String password) {
            this.firstname = firstname;
            this.lastname=lastname;
            this.email = email;
            this.password = password;
        }
        private RegisterRequest(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String email;
        private String password;

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public RegisterRequest build() {
            return new RegisterRequest(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
