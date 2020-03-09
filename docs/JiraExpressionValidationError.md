
# JiraExpressionValidationError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **kotlin.String** | The detailed message about the error. | 
**type** | [**inline**](#TypeEnum) | The error type. | 
**line** | **kotlin.Int** | The text line in which the error occurred. If absent, the error pertains to the entire expression. |  [optional]
**column** | **kotlin.Int** | The text column in which the error occurred. If absent, the error pertains to the entire expression. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | syntax, other



