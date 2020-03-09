
# UserDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **kotlin.String** | The URL of the user. |  [optional] [readonly]
**name** | **kotlin.String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly]
**key** | **kotlin.String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] [readonly]
**accountId** | **kotlin.String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |  [optional]
**emailAddress** | **kotlin.String** | The email address of the user. Depending on the user’s privacy settings, this may be returned as null. |  [optional] [readonly]
**avatarUrls** | [**AvatarUrlsBean**](AvatarUrlsBean.md) | The avatars of the user. |  [optional] [readonly]
**displayName** | **kotlin.String** | The display name of the user. Depending on the user’s privacy settings, this may return an alternative value. |  [optional] [readonly]
**active** | **kotlin.Boolean** | Whether the user is active. |  [optional] [readonly]
**timeZone** | **kotlin.String** | The time zone specified in the user&#39;s profile. Depending on the user’s privacy settings, this may be returned as null. |  [optional] [readonly]
**accountType** | **kotlin.String** | The type of account represented by this user. This will be one of &#39;atlassian&#39; (normal users), &#39;app&#39; (application user) or &#39;customer&#39; (Jira Service Desk customer user) |  [optional] [readonly]



