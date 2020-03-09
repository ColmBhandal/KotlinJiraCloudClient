
# JexpJqlIssues

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **kotlin.String** | The JQL query. |  [optional]
**startAt** | **kotlin.Long** | The index of the first issue to return from the JQL query. |  [optional]
**maxResults** | **kotlin.Int** | The maximum number of issues to return from the JQL query. Inspect &#x60;meta.issues.jql.maxResults&#x60; in the response to ensure the maximum value has not been exceeded. |  [optional]
**validation** | [**inline**](#ValidationEnum) | Determines how to validate the JQL query and treat the validation results. |  [optional]


<a name="ValidationEnum"></a>
## Enum: validation
Name | Value
---- | -----
validation | strict, warn, none



