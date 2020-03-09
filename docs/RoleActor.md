
# RoleActor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** | The ID of the role actor. |  [optional] [readonly]
**displayName** | **kotlin.String** | The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name. |  [optional] [readonly]
**type** | [**inline**](#TypeEnum) | The type of role actor. |  [optional] [readonly]
**name** | **kotlin.String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly]
**avatarUrl** | [**java.net.URI**](java.net.URI.md) | The avatar of the role actor. |  [optional] [readonly]
**actorUser** | [**ProjectRoleUserBean**](ProjectRoleUserBean.md) |  |  [optional] [readonly]
**actorGroup** | [**ProjectRoleGroupBean**](ProjectRoleGroupBean.md) |  |  [optional] [readonly]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | atlassian-group-role-actor, atlassian-user-role-actor



