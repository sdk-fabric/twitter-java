/**
 * TweetCreateResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class TweetCreateResponse {
    private TweetCreateResponseMessage data;
    @JsonSetter("data")
    public void setData(TweetCreateResponseMessage data) {
        this.data = data;
    }
    @JsonGetter("data")
    public TweetCreateResponseMessage getData() {
        return this.data;
    }
}
