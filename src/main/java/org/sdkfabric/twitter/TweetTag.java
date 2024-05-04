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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TweetTag extends TagAbstract {
    public TweetTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Returns a variety of information about the Tweet specified by the requested ID or list of IDs.
     */
    public TweetCollection getAll(String ids, String expansions, Fields fields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("ids", ids);
            queryParams.put("expansions", expansions);
            queryParams.put("fields", fields);

            List<String> queryStructNames = new ArrayList<String>();
            queryStructNames.put('fields'),

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetCollection.class);
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
    public TweetEntity get(String tweetId, String expansions, Fields fields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("tweet_id", tweetId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("expansions", expansions);
            queryParams.put("fields", fields);

            List<String> queryStructNames = new ArrayList<String>();
            queryStructNames.put('fields'),

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetEntity.class);
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

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

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

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

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

    /**
     * Hides or unhides a reply to a Tweet.
     */
    public HideReplyResponse hideReply(String tweetId, HideReply payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("tweet_id", tweetId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id/hidden", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, HideReplyResponse.class);
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
