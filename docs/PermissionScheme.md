
# PermissionScheme

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the permission scheme. Must be unique. | 
**expand** | **kotlin.String** | The expand options available for the permission scheme. |  [optional] [readonly]
**id** | **kotlin.Long** | The ID of the permission scheme. |  [optional] [readonly]
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the permission scheme. |  [optional] [readonly]
**description** | **kotlin.String** | A description for the permission scheme. |  [optional]
**scope** | [**Scope**](Scope.md) | The scope of the permission scheme. |  [optional]
**permissions** | [**kotlin.Array&lt;PermissionGrant&gt;**](PermissionGrant.md) | The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information. |  [optional]



