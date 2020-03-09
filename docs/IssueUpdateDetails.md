
# IssueUpdateDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transition** | [**IssueTransition**](IssueTransition.md) | Details of a transition. Required when performing a transition, optional when creating or editing an issue. |  [optional]
**fields** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;. |  [optional]
**update** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;FieldUpdateOperation&gt;&gt;** | List of operations to perform on issue screen fields. Note that fields included in here cannot be included in &#x60;fields&#x60;. |  [optional]
**historyMetadata** | [**HistoryMetadata**](HistoryMetadata.md) | Additional issue history details. |  [optional]
**properties** | [**kotlin.Array&lt;EntityProperty&gt;**](EntityProperty.md) | Details of issue properties to be add or update. |  [optional]



