/**
 * HideReplyResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class HideReplyResponse {
    private HideReplyUpdate data;
    @JsonSetter("data")
    public void setData(HideReplyUpdate data) {
        this.data = data;
    }
    @JsonGetter("data")
    public HideReplyUpdate getData() {
        return this.data;
    }
}
