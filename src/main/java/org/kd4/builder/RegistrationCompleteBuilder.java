package org.kd4.builder;

import com.flipkart.databuilderframework.annotations.DataBuilderInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.engine.DataSetAccessor;
import com.flipkart.databuilderframework.model.Data;
import org.kd4.data.RegistrationComplete;
import org.kd4.data.UserAddress;

@DataBuilderInfo(name = "RegistrationCompleteBuilder", consumes = {"UserAddress"}, produces = "RegistrationComplete")
public class RegistrationCompleteBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext dataBuilderContext){
        DataSetAccessor accessor = dataBuilderContext.getDataSet().accessor();
        UserAddress userAddress = accessor.get("UserAddress", UserAddress.class);
        String confirmationMessage = "Registration Completed Successfully for " + userAddress.getAddress();
        return new RegistrationComplete(confirmationMessage);
    }
}
