/**
 * TweetMedia automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import com.fasterxml.jackson.annotation.*;

public class TweetMedia {
    @JsonPropertyDescription("A list of Media IDs being attached to the Tweet. This is only required if the request includes the tagged_user_ids.")
    private java.util.List<String> mediaIds;
    @JsonPropertyDescription("A list of User IDs being tagged in the Tweet with Media. If the user you're tagging doesn't have photo-tagging enabled, their names won't show up in the list of tagged users even though the Tweet is successfully created.")
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

