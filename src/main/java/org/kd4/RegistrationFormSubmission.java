package org.kd4;

import com.flipkart.databuilderframework.engine.DataFlowBuilder;
import com.flipkart.databuilderframework.engine.DataFlowExecutor;
import com.flipkart.databuilderframework.engine.SimpleDataFlowExecutor;
import com.flipkart.databuilderframework.model.DataDelta;
import com.flipkart.databuilderframework.model.DataExecutionResponse;
import com.flipkart.databuilderframework.model.DataFlow;
import com.flipkart.databuilderframework.model.DataFlowInstance;
import org.kd4.builder.RegistrationCompleteBuilder;
import org.kd4.builder.UserAddressBuilder;
import org.kd4.builder.UserDetailsBuilder;
import org.kd4.data.RegistrationComplete;
import org.kd4.data.UserAddress;
import org.kd4.data.UserDetails;

public class RegistrationFormSubmission {
    public static void main(String[] args) throws Exception{
        System.out.println("Does this print");
        DataFlow dataFlow = new DataFlowBuilder()
                .withDataBuilder(new UserDetailsBuilder())
                .withDataBuilder(new UserAddressBuilder())
                .withDataBuilder(new RegistrationCompleteBuilder())
                .withTargetData("RegistrationComplete")
                .build();

        DataFlowExecutor dataFlowExecutor = new SimpleDataFlowExecutor();

        DataFlowInstance dataFlowInstance = new DataFlowInstance("registrationFormSubmission", dataFlow);

        DataDelta dataDelta = new DataDelta(new UserDetails("Deepak Kumar", "sloka@living.com"));
        DataExecutionResponse response = dataFlowExecutor.run(dataFlowInstance, dataDelta);

//        dataDelta = new DataDelta(new UserAddress("123 Main St, spring field"));
//        response = dataFlowExecutor.run(dataFlowInstance, dataDelta);

        RegistrationComplete registrationComplete = response.get(RegistrationComplete.class);
        System.out.println(registrationComplete.getConfirmationMessage());
    }
}
