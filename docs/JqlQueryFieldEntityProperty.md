
# JqlQueryFieldEntityProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | **kotlin.String** | The object on which the property is set. | 
**key** | **kotlin.String** | The key of the property. | 
**path** | **kotlin.String** | The path in the property value to query. | 
**type** | [**inline**](#TypeEnum) | The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | number, string, text, date, user



