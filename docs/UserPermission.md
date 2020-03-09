
# UserPermission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the permission. Either &#x60;id&#x60; or &#x60;key&#x60; must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions. |  [optional]
**key** | **kotlin.String** | The key of the permission. Either &#x60;id&#x60; or &#x60;key&#x60; must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions. |  [optional]
**name** | **kotlin.String** | The name of the permission. |  [optional]
**type** | [**inline**](#TypeEnum) | The type of the permission. |  [optional]
**description** | **kotlin.String** | The description of the permission. |  [optional]
**havePermission** | **kotlin.Boolean** | Whether the permission is available to the user in the queried context. |  [optional]
**deprecatedKey** | **kotlin.Boolean** | Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the &#x60;permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.&#x60; |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | GLOBAL, PROJECT



