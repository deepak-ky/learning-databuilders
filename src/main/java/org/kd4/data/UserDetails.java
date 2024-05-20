package org.kd4.data;

import com.flipkart.databuilderframework.model.Data;

public class UserDetails extends Data {
    private String name;
    private String email;

    public UserDetails(String name, String email){
        super("UserDetails");
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
