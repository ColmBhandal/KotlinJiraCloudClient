
# ProjectForScope

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **kotlin.String** | The URL of the project details. |  [optional] [readonly]
**id** | **kotlin.String** | The ID of the project. |  [optional]
**key** | **kotlin.String** | The key of the project. |  [optional] [readonly]
**name** | **kotlin.String** | The name of the project. |  [optional] [readonly]
**projectTypeKey** | [**inline**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional] [readonly]
**simplified** | **kotlin.Boolean** | Whether or not the project is simplified. |  [optional] [readonly]
**avatarUrls** | [**AvatarUrlsBean**](AvatarUrlsBean.md) | The URLs of the project&#39;s avatars. |  [optional] [readonly]
**projectCategory** | [**UpdatedProjectCategory**](UpdatedProjectCategory.md) | The category the project belongs to. |  [optional] [readonly]


<a name="ProjectTypeKeyEnum"></a>
## Enum: projectTypeKey
Name | Value
---- | -----
projectTypeKey | software, service_desk, business



