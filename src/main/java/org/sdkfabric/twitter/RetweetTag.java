/**
 * RetweetTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.*;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetweetTag extends TagAbstract {
    public RetweetTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Returns the Retweets for a given Tweet ID.
     */
    public TweetCollection getAll(String tweetId, String expansions, Integer maxResults, Fields fields) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("tweet_id", tweetId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("expansions", expansions);
            queryParams.put("max_results", maxResults);
            queryParams.put("fields", fields);

            List<String> queryStructNames = new ArrayList<>();
            queryStructNames.add("fields");

            URIBuilder builder = new URIBuilder(this.parser.url("/2/tweets/:tweet_id/retweets", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<TweetCollection>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<Errors>(){});

                    throw new ErrorsException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }



}
