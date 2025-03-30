package com.example.BookStoreApplication.Auth;

public class AuthenticationRequest {
    private String email;
    private String password;
    private AuthenticationRequest(){

    }
    private AuthenticationRequest(String email,String password){
        this.email=email;
        this.password=password;

    }
    private AuthenticationRequest(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
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
        private String email;
        private String password;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public AuthenticationRequest build() {
            return new AuthenticationRequest(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
