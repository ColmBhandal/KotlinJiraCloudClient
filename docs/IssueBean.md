
# IssueBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **kotlin.String** | Expand options that include additional issue details in the response. |  [optional] [readonly]
**id** | **kotlin.String** | The ID of the issue. |  [optional] [readonly]
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the issue details. |  [optional] [readonly]
**key** | **kotlin.String** | The key of the issue. |  [optional] [readonly]
**renderedFields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The rendered value of each field present on the issue. |  [optional] [readonly]
**properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Details of the issue properties identified in the request. |  [optional] [readonly]
**names** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | The ID and name of each field present on the issue. |  [optional] [readonly]
**schema** | [**kotlin.collections.Map&lt;kotlin.String, JsonTypeBean&gt;**](JsonTypeBean.md) | The schema describing each field present on the issue. |  [optional] [readonly]
**transitions** | [**kotlin.Array&lt;IssueTransition&gt;**](IssueTransition.md) | The transitions that can be performed on the issue. |  [optional] [readonly]
**operations** | [**Operations**](Operations.md) | The operations that can be performed on the issue. |  [optional] [readonly]
**editmeta** | [**IssueUpdateMetadata**](IssueUpdateMetadata.md) | The metadata for the fields on the issue that can be amended. |  [optional] [readonly]
**changelog** | [**PageOfChangelogs**](PageOfChangelogs.md) | Details of changelogs associated with the issue. |  [optional] [readonly]
**versionedRepresentations** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;&gt;** | The versions of each field on the issue. |  [optional] [readonly]
**fieldsToInclude** | [**IncludedFields**](IncludedFields.md) |  |  [optional]
**fields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]



