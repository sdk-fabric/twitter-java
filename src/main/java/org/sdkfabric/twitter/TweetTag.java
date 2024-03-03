/**
 * TweetTag automatically generated by SDKgen please do not edit this file manually
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

public class TweetTag extends TagAbstract {
    public TweetTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Returns a variety of information about the Tweet specified by the requested ID or list of IDs.
     */
    public TweetCollectionResponse getAll(String ids, String expansions, String mediaFields, String placeFields, String pollFields, String tweetFields, String userFields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("ids", ids);
            queryParams.put("expansions", expansions);
            queryParams.put("media.fields", mediaFields);
            queryParams.put("place.fields", placeFields);
            queryParams.put("poll.fields", pollFields);
            queryParams.put("tweet.fields", tweetFields);
            queryParams.put("user.fields", userFields);

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets", pathParams));
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
     * Returns a variety of information about a single Tweet specified by the requested ID.
     */
    public TweetEntityResponse get(String tweetId, String expansions, String mediaFields, String placeFields, String pollFields, String tweetFields, String userFields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("tweet_id", tweetId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("expansions", expansions);
            queryParams.put("media.fields", mediaFields);
            queryParams.put("place.fields", placeFields);
            queryParams.put("poll.fields", pollFields);
            queryParams.put("tweet.fields", tweetFields);
            queryParams.put("user.fields", userFields);

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetEntityResponse.class);
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
     * Creates a Tweet on behalf of an authenticated user.
     */
    public TweetCreateResponse create(Tweet payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets", pathParams));
            this.parser.query(builder, queryParams);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetCreateResponse.class);
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
     * Allows a user or authenticated user ID to delete a Tweet.
     */
    public TweetDeleteResponse delete(String tweetId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("tweet_id", tweetId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id", pathParams));
            this.parser.query(builder, queryParams);

            HttpDelete request = new HttpDelete(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetDeleteResponse.class);
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