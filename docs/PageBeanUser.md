
# PageBeanUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the page. |  [optional] [readonly]
**nextPage** | [**java.net.URI**](java.net.URI.md) | If there is another page of results, the URL of the next page. |  [optional] [readonly]
**maxResults** | **kotlin.Int** | The maximum number of items that could be returned. |  [optional] [readonly]
**startAt** | **kotlin.Long** | The index of the first item returned. |  [optional] [readonly]
**total** | **kotlin.Long** | The number of items returned. |  [optional] [readonly]
**isLast** | **kotlin.Boolean** | Whether this is the last page. |  [optional] [readonly]
**values** | [**kotlin.Array&lt;User&gt;**](User.md) | The list of items. |  [optional] [readonly]



