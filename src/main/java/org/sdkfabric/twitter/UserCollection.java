/**
 * UserCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class UserCollection {
    private List<User> data;
    @JsonSetter("data")
    public void setData(List<User> data) {
        this.data = data;
    }
    @JsonGetter("data")
    public List<User> getData() {
        return this.data;
    }
}
