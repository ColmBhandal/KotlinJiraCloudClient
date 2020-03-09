
# FieldLastUsed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) | Last used value type:   *  *TRACKED*: field is tracked and a last used date is available.  *  *NOT\\_TRACKED*: field is not tracked, last used date is not available.  *  *NO\\_INFORMATION*: field is tracked, but no last used date is available. |  [optional]
**value** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the value of the field last changed. |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | TRACKED, NOT_TRACKED, NO_INFORMATION



