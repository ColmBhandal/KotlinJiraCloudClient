
# SearchResults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **kotlin.String** | Expand options that include additional search result details in the response. |  [optional] [readonly]
**startAt** | **kotlin.Int** | The index of the first item returned on the page. |  [optional] [readonly]
**maxResults** | **kotlin.Int** | The maximum number of results that could be on the page. |  [optional] [readonly]
**total** | **kotlin.Int** | The number of results on the page. |  [optional] [readonly]
**issues** | [**kotlin.Array&lt;IssueBean&gt;**](IssueBean.md) | The list of issues found by the search. |  [optional] [readonly]
**warningMessages** | **kotlin.Array&lt;kotlin.String&gt;** | Any warnings related to the JQL query. |  [optional] [readonly]
**names** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The ID and name of each field in the search results. |  [optional] [readonly]
**schema** | [**kotlin.collections.Map&lt;kotlin.String, JsonTypeBean&gt;**](JsonTypeBean.md) | The schema describing the field types in the search results. |  [optional] [readonly]



