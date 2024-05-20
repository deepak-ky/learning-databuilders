package org.kd4.data;

import com.flipkart.databuilderframework.model.Data;

public class UserAddress extends Data {
    private String address;

    public UserAddress(String address){
        super("UserAddress");
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
