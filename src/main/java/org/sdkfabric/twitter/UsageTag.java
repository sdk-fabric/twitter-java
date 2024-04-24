/**
 * UsageTag automatically generated by SDKgen please do not edit this file manually
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

public class UsageTag extends TagAbstract {
    public UsageTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * The Usage API in the Twitter API v2 allows developers to programmatically retrieve their project usage. Using thie endpoint, developers can keep a track and monitor of the number of Tweets they have pulled for a given billing cycle.
     */
    public TweetUsageResponse getTweets() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/2/usage/tweets", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, TweetUsageResponse.class);
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
