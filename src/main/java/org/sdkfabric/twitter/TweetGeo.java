/**
 * TweetGeo automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class TweetGeo {
    private String placeId;
    @JsonSetter("place_id")
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    @JsonGetter("place_id")
    public String getPlaceId() {
        return this.placeId;
    }
}