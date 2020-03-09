
# Avatar

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the avatar. | 
**owner** | **kotlin.String** | The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user. |  [optional] [readonly]
**isSystemAvatar** | **kotlin.Boolean** | Whether the avatar is a system avatar. |  [optional] [readonly]
**isSelected** | **kotlin.Boolean** | Whether the avatar is used in Jira. For example, shown as a project&#39;s avatar. |  [optional] [readonly]
**isDeletable** | **kotlin.Boolean** | Whether the avatar can be deleted. |  [optional] [readonly]
**fileName** | **kotlin.String** | The file name of the avatar icon. Returned for system avatars. |  [optional] [readonly]
**urls** | [**kotlin.collections.Map&lt;kotlin.String, java.net.URI&gt;**](java.net.URI.md) | The list of avatar icon URLs. |  [optional] [readonly]



