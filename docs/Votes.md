
# Votes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL of these issue vote details. |  [optional] [readonly]
**votes** | **kotlin.Long** | The number of votes on the issue. |  [optional] [readonly]
**hasVoted** | **kotlin.Boolean** | Whether the user making this request has voted on the issue. |  [optional] [readonly]
**voters** | [**kotlin.Array&lt;User&gt;**](User.md) | List of the users who have voted on this issue. An empty list is returned when the calling user doesn&#39;t have the *View voters and watchers* project permission. |  [optional] [readonly]



