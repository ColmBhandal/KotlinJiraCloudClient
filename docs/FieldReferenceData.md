
# FieldReferenceData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **kotlin.String** | The field identifier. |  [optional]
**displayName** | **kotlin.String** | The display name of the field. |  [optional]
**orderable** | [**inline**](#OrderableEnum) | Whether the field can be used in a query&#39;s &#x60;ORDER BY&#x60; clause. |  [optional]
**searchable** | [**inline**](#SearchableEnum) | Whether the content of this field can be searched. |  [optional]
**auto** | [**inline**](#AutoEnum) | Whether the field provide auto-complete suggestions. |  [optional]
**cfid** | **kotlin.String** | If the item is a custom field, the ID of the custom field. |  [optional]
**operators** | **kotlin.Array&lt;kotlin.String&gt;** | The valid search operators for the field. |  [optional]
**types** | **kotlin.Array&lt;kotlin.String&gt;** | The data types of items in the field. |  [optional]


<a name="OrderableEnum"></a>
## Enum: orderable
Name | Value
---- | -----
orderable | true, false


<a name="SearchableEnum"></a>
## Enum: searchable
Name | Value
---- | -----
searchable | true, false


<a name="AutoEnum"></a>
## Enum: auto
Name | Value
---- | -----
auto | true, false



