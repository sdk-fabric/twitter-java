/**
 * Trend automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Trend {
    private String trendName;
    private Integer tweetCount;
    @JsonSetter("trend_name")
    public void setTrendName(String trendName) {
        this.trendName = trendName;
    }
    @JsonGetter("trend_name")
    public String getTrendName() {
        return this.trendName;
    }
    @JsonSetter("tweet_count")
    public void setTweetCount(Integer tweetCount) {
        this.tweetCount = tweetCount;
    }
    @JsonGetter("tweet_count")
    public Integer getTweetCount() {
        return this.tweetCount;
    }
}