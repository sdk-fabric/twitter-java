/**
 * TweetUsageResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class TweetUsageResponse {
    private TweetUsage data;
    @JsonSetter("data")
    public void setData(TweetUsage data) {
        this.data = data;
    }
    @JsonGetter("data")
    public TweetUsage getData() {
        return this.data;
    }
}
