/**
 * TweetMedia automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class TweetMedia {
    private java.util.List<String> mediaIds;
    private java.util.List<String> taggedUserIds;
    @JsonSetter("media_ids")
    public void setMediaIds(java.util.List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }
    @JsonGetter("media_ids")
    public java.util.List<String> getMediaIds() {
        return this.mediaIds;
    }
    @JsonSetter("tagged_user_ids")
    public void setTaggedUserIds(java.util.List<String> taggedUserIds) {
        this.taggedUserIds = taggedUserIds;
    }
    @JsonGetter("tagged_user_ids")
    public java.util.List<String> getTaggedUserIds() {
        return this.taggedUserIds;
    }
}
