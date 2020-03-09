
# FieldMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**required** | **kotlin.Boolean** | Whether the field is required. |  [readonly]
**name** | **kotlin.String** | The name of the field. |  [readonly]
**key** | **kotlin.String** | The key of the field. |  [readonly]
**operations** | **kotlin.Array&lt;kotlin.String&gt;** | The list of operations that can be performed on the field. |  [readonly]
**schema** | [**JsonTypeBean**](JsonTypeBean.md) | The data type of the field. |  [optional] [readonly]
**autoCompleteUrl** | **kotlin.String** | The URL that can be used to automatically complete the field. |  [optional] [readonly]
**hasDefaultValue** | **kotlin.Boolean** | Whether the field has a default value. |  [optional] [readonly]
**allowedValues** | [**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md) | The list of values allowed in the field. |  [optional] [readonly]
**defaultValue** | [**kotlin.Any**](kotlin.Any.md) | The default value of the field. |  [optional] [readonly]



