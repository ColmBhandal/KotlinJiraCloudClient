
# RemoveOptionFromIssuesResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modifiedIssues** | **kotlin.Array&lt;kotlin.Long&gt;** | The IDs of the modified issues. |  [optional]
**unmodifiedIssues** | **kotlin.Array&lt;kotlin.Long&gt;** | The IDs of the unchanged issues, those issues where errors prevent modification. |  [optional]
**errors** | [**SimpleErrorCollection**](SimpleErrorCollection.md) | A collection of errors related to unchanged issues. The collection size is limited, which means not all errors may be returned. |  [optional]



