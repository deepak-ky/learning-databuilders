package org.kd4.builder;

import com.flipkart.databuilderframework.annotations.DataBuilderInfo;
import com.flipkart.databuilderframework.engine.DataBuilder;
import com.flipkart.databuilderframework.engine.DataBuilderContext;
import com.flipkart.databuilderframework.model.Data;
import org.kd4.data.UserDetails;

@DataBuilderInfo(name = "UserDetailsBuilder", consumes = {}, produces = "UserDetails")
public class UserDetailsBuilder extends DataBuilder {
    @Override
    public Data process(DataBuilderContext dataBuilderContext){
        return new UserDetails("Deepak", "deepak@gmail.com");
        // return new UserAddress("221B Baker Street");
    }
}
