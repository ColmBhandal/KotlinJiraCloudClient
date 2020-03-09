
# ProjectRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL the project role details. |  [optional] [readonly]
**name** | **kotlin.String** | The name of the project role. |  [optional]
**id** | **kotlin.Long** | The ID of the project role. |  [optional] [readonly]
**description** | **kotlin.String** | The description of the project role. |  [optional] [readonly]
**actors** | [**kotlin.Array&lt;RoleActor&gt;**](RoleActor.md) | The list of users who act in this role. |  [optional] [readonly]
**scope** | [**Scope**](Scope.md) | The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO). |  [optional] [readonly]
**admin** | **kotlin.Boolean** | Whether this role is the admin role for the project. |  [optional] [readonly]
**default** | **kotlin.Boolean** | Whether this role is the default role for the project |  [optional] [readonly]



