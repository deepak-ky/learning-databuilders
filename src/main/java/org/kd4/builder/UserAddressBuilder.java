package org.kd4.builder;

import com.flipkart.databuilderframework.annotations.DataBuilderInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.engine.DataSetAccessor;
import com.flipkart.databuilderframework.model.Data;
import org.kd4.data.UserAddress;
import org.kd4.data.UserDetails;

@DataBuilderInfo(name = "UserAddressBuilder", consumes = {"UserDetails"}, produces = "UserAddress")
public class UserAddressBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext dataBuilderContext){
        DataSetAccessor accessor = dataBuilderContext.getDataSet().accessor();
        UserDetails userDetails = accessor.get("UserDetails", UserDetails.class);
        String address = userDetails.getName() + "-221 Baker Street-" + userDetails.getEmail();
        return new UserAddress(address);
    }
}
