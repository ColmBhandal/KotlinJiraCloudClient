
# VersionMoveBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | [**java.net.URI**](java.net.URI.md) | The URL (self link) of the version after which to place the moved version. Cannot be used with &#x60;position&#x60;. |  [optional]
**position** | [**inline**](#PositionEnum) | An absolute position in which to place the moved version. Cannot be used with &#x60;after&#x60;. |  [optional]


<a name="PositionEnum"></a>
## Enum: position
Name | Value
---- | -----
position | Earlier, Later, First, Last



