
# twitter-java

This [SDK](https://github.com/sdk-fabric/twitter-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/sdkfabric/twitter

## Usage

```java
import org.sdkfabric.twitter.Client;

Client client = Client::build("[access_token]");

// Returns a variety of information about the Tweet specified by the requested ID or list of IDs.
TweetCollection response = client.tweet().getall("ids", "expansions", null);

// Returns a variety of information about a single Tweet specified by the requested ID.
TweetEntity response = client.tweet().get("tweet_id", "expansions", null);

// Creates a Tweet on behalf of an authenticated user.
TweetCreateResponse response = client.tweet().create(new Tweet());

// Allows a user or authenticated user ID to delete a Tweet.
TweetDeleteResponse response = client.tweet().delete("tweet_id");

// Hides or unhides a reply to a Tweet.
HidereplyResponse response = client.tweet().hidereply("tweet_id", new Hidereply());

// Allows you to get information about a Tweet’s liking users.
UserCollection response = client.tweet().getlikingusers("tweet_id", "expansions", 1, "pagination_token");

// The Usage API in the Twitter API v2 allows developers to programmatically retrieve their project usage.
TweetUsageResponse response = client.usage().gettweets();

// Returns a variety of information about one or more users specified by the requested IDs.
UserCollection response = client.user().getall("ids", "expansions", null);

// Returns a variety of information about a single user specified by the requested ID.
User response = client.user().get("user_id", "expansions", null);

// Allows you to retrieve a collection of the most recent Tweets and Retweets posted by you and users you follow.
TweetCollection response = client.user().gettimeline("user_id", "exclude", "expansions", null, null);

// Tweets liked by a user.
TweetCollection response = client.user().getlikedtweets("user_id", "expansions", 1, "pagination_token", null);

// Allows a user or authenticated user ID to unlike a Tweet.
LikeResponse response = client.user().removelike("user_id", "tweet_id");

// Causes the user ID identified in the path parameter to Like the target Tweet.
LikeResponse response = client.user().createlike("user_id", new SingleTweet());

// Returns a variety of information about one or more users specified by their usernames.
UserCollection response = client.user().findbyname("usernames", "expansions", null);

// Returns information about an authorized user.
User response = client.user().getme("expansions", "fields");

// Allows you to get an authenticated user's 800 most recent bookmarked Tweets.
TweetCollection response = client.bookmark().getall("user_id", "expansions", "pagination_token", null);

BookmarkResponse response = client.bookmark().create("user_id", new SingleTweet());

BookmarkResponse response = client.bookmark().delete("user_id", "tweet_id");

TweetCollection response = client.search().getrecent("query", "sort_order", "expansions", null, null);

// Returns Quote Tweets for a Tweet specified by the requested Tweet ID.
TweetCollection response = client.quote().getall("tweet_id", "exclude", "expansions", 1, "pagination_token", null);

// The Trends lookup endpoint allow developers to get the Trends for a location, specified using the where-on-earth id (WOEID).
TrendCollection response = client.trends().getbywoeid("woeid");

// Returns the Retweets for a given Tweet ID.
TweetCollection response = client.retweet().getall("tweet_id", "expansions", 1, null);
```
