/**
 * Client automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.twitter;

import app.sdkgen.client.ClientAbstract;
import app.sdkgen.client.Credentials.*;
import app.sdkgen.client.CredentialsInterface;
import app.sdkgen.client.Exception.Authenticator.InvalidCredentialsException;
import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
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
import java.util.List;
import java.util.Map;

public class Client extends ClientAbstract {
    public Client(String baseUrl, CredentialsInterface credentials) throws InvalidCredentialsException {
        super(baseUrl, credentials);
    }

    public TweetTag tweet()
    {
        return new TweetTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public UsageTag usage()
    {
        return new UsageTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public UserTag user()
    {
        return new UserTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BookmarkTag bookmark()
    {
        return new BookmarkTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public SearchTag search()
    {
        return new SearchTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }



    public static Client build(String token) throws InvalidCredentialsException
    {
        return new Client("https://api.twitter.com", new HttpBearer(token));
    }
}
