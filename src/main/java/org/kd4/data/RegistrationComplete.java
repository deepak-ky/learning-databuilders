package org.kd4.data;

import com.flipkart.databuilderframework.model.Data;

public class RegistrationComplete extends Data {
    private String confirmationMessage;

    public RegistrationComplete(String confirmationMessage){
        super("RegistrationComplete");
        this.confirmationMessage = confirmationMessage;
    }

    public String getConfirmationMessage() {
        return confirmationMessage;
    }
}
