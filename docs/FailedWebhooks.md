
# FailedWebhooks

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**kotlin.Array&lt;FailedWebhook&gt;**](FailedWebhook.md) | The list of webhooks. | 
**maxResults** | **kotlin.Int** | The maximum number of items on the page. If the list of values is shorter than this number, then there are no more pages. | 
**next** | [**java.net.URI**](java.net.URI.md) | The URL to the next page of results. Present only if the request returned at least one result.The next page may be empty at the time of receiving the response, but new failed webhooks may appear in time. You can save the URL to the next page and query for new results periodically (for example, every hour). |  [optional]



