
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the user. |  [optional] [readonly]
**key** | **kotlin.String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**accountId** | **kotlin.String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests. |  [optional]
**accountType** | [**inline**](#AccountTypeEnum) | The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk |  [optional] [readonly]
**name** | **kotlin.String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**emailAddress** | **kotlin.String** | The email address of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly]
**avatarUrls** | [**AvatarUrlsBean**](AvatarUrlsBean.md) | The avatars of the user. |  [optional] [readonly]
**displayName** | **kotlin.String** | The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. |  [optional] [readonly]
**active** | **kotlin.Boolean** | Whether the user is active. |  [optional] [readonly]
**timeZone** | **kotlin.String** | The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly]
**locale** | **kotlin.String** | The locale of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly]
**groups** | [**SimpleListWrapperGroupName**](SimpleListWrapperGroupName.md) | The groups that the user belongs to. |  [optional] [readonly]
**applicationRoles** | [**SimpleListWrapperApplicationRole**](SimpleListWrapperApplicationRole.md) | The application roles the user is assigned to. |  [optional] [readonly]
**expand** | **kotlin.String** | Expand options that include additional user details in the response. |  [optional] [readonly]


<a name="AccountTypeEnum"></a>
## Enum: accountType
Name | Value
---- | -----
accountType | atlassian, app, customer, unknown



