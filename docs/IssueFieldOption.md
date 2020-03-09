
# IssueFieldOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The unique identifier for the option. This is only unique within the select field&#39;s set of options. | 
**value** | **kotlin.String** | The option&#39;s name, which is displayed in Jira. | 
**properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The properties of the object, as arbitrary key-value pairs. These properties can be searched using JQL, if the extractions (see [Issue Field Option Property Index](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field-option-property-index/)) are defined in the descriptor for the issue field module. |  [optional]
**config** | [**IssueFieldOptionConfiguration**](IssueFieldOptionConfiguration.md) |  |  [optional]



