/**
 * UserTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class UserTag extends TagAbstract {
    public UserTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public TweetCollectionResponse getTimeline(String userId, String startTime, String endTime, String sinceId, String untilId, String exclude, String expansions, int maxResults, String paginationToken, String mediaFields, String placeFields, String pollFields, String tweetFields, String userFields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("user_id", userId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("start_time", startTime);
            queryParams.put("end_time", endTime);
            queryParams.put("since_id", sinceId);
            queryParams.put("until_id", untilId);
            queryParams.put("exclude", exclude);
            queryParams.put("expansions", expansions);
            queryParams.put("max_results", maxResults);
            queryParams.put("pagination_token", paginationToken);
            queryParams.put("media.fields", mediaFields);
            queryParams.put("place.fields", placeFields);
            queryParams.put("poll.fields", pollFields);
            queryParams.put("tweet.fields", tweetFields);
            queryParams.put("user.fields", userFields);

            URIBuilder builder = new URIBuilder(this.parser.url("/2/users/:user_id/timelines/reverse_chronological", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetCollectionResponse.class);
            }

            switch (resp.code) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Tweets liked by a user
     */
    public TweetCollectionResponse getLikedTweets(String userId, String expansions, String maxResults, String paginationToken, String mediaFields, String placeFields, String pollFields, String tweetFields, String userFields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("user_id", userId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("expansions", expansions);
            queryParams.put("max_results", maxResults);
            queryParams.put("pagination_token", paginationToken);
            queryParams.put("media.fields", mediaFields);
            queryParams.put("place.fields", placeFields);
            queryParams.put("poll.fields", pollFields);
            queryParams.put("tweet.fields", tweetFields);
            queryParams.put("user.fields", userFields);

            URIBuilder builder = new URIBuilder(this.parser.url("/2/users/:user_id/liked_tweets", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetCollectionResponse.class);
            }

            switch (resp.code) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}
