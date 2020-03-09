
# JiraExpressionAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **kotlin.String** | The analysed expression. | 
**valid** | **kotlin.Boolean** | Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations). | 
**errors** | [**kotlin.Array&lt;JiraExpressionValidationError&gt;**](JiraExpressionValidationError.md) | A list of validation errors. Not included if the expression is valid. |  [optional]



