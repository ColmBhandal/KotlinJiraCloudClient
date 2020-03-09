
# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **kotlin.String** | Expand options that include additional project details in the response. |  [optional] [readonly]
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the project details. |  [optional] [readonly]
**id** | **kotlin.String** | The ID of the project. |  [optional]
**key** | **kotlin.String** | The key of the project. |  [optional] [readonly]
**description** | **kotlin.String** | A brief description of the project. |  [optional] [readonly]
**lead** | [**User**](User.md) | The username of the project lead. |  [optional] [readonly]
**components** | [**kotlin.Array&lt;Component&gt;**](Component.md) | List of the components contained in the project. |  [optional] [readonly]
**issueTypes** | [**kotlin.Array&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md) | List of the issue types available in the project. |  [optional] [readonly]
**url** | **kotlin.String** | A link to information about this project, such as project documentation. |  [optional] [readonly]
**email** | **kotlin.String** | An email address associated with the project. |  [optional]
**assigneeType** | [**inline**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional] [readonly]
**versions** | [**kotlin.Array&lt;Version&gt;**](Version.md) | The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post). |  [optional] [readonly]
**name** | **kotlin.String** | The name of the project. |  [optional] [readonly]
**roles** | [**kotlin.collections.Map&lt;kotlin.String, java.net.URI&gt;**](java.net.URI.md) | The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post). |  [optional] [readonly]
**avatarUrls** | [**AvatarUrlsBean**](AvatarUrlsBean.md) | The URLs of the project&#39;s avatars. |  [optional] [readonly]
**projectCategory** | [**ProjectCategory**](ProjectCategory.md) | The category the project belongs to. |  [optional] [readonly]
**projectTypeKey** | [**inline**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional] [readonly]
**simplified** | **kotlin.Boolean** | Whether the project is simplified. |  [optional] [readonly]
**style** | [**inline**](#StyleEnum) | The type of the project. |  [optional] [readonly]
**favourite** | **kotlin.Boolean** | Whether the project is selected as a favorite. |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether the project is private. |  [optional] [readonly]
**issueTypeHierarchy** | [**Hierarchy**](Hierarchy.md) | The issue type hierarchy for the project |  [optional] [readonly]
**permissions** | [**ProjectPermissions**](ProjectPermissions.md) | User permissions on the project |  [optional] [readonly]
**properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Map of project properties |  [optional] [readonly]
**uuid** | [**java.util.UUID**](java.util.UUID.md) | Unique ID for next-gen projects. |  [optional] [readonly]
**insight** | [**ProjectInsight**](ProjectInsight.md) | Insights about the project. |  [optional] [readonly]
**deleted** | **kotlin.Boolean** | Whether the project is marked as deleted. |  [optional] [readonly]
**retentionTillDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the project is deleted permanently. |  [optional] [readonly]
**deletedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the project was marked as deleted. |  [optional] [readonly]
**deletedBy** | [**User**](User.md) | The user who marked the project as deleted. |  [optional] [readonly]
**archived** | **kotlin.Boolean** | Whether the project is archived. |  [optional] [readonly]
**archivedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date when the project was archived. |  [optional] [readonly]
**archivedBy** | [**User**](User.md) | The user who archived the project. |  [optional] [readonly]


<a name="AssigneeTypeEnum"></a>
## Enum: assigneeType
Name | Value
---- | -----
assigneeType | PROJECT_LEAD, UNASSIGNED


<a name="ProjectTypeKeyEnum"></a>
## Enum: projectTypeKey
Name | Value
---- | -----
projectTypeKey | software, service_desk, business


<a name="StyleEnum"></a>
## Enum: style
Name | Value
---- | -----
style | CLASSIC, NEXTGEN, classic, next-gen



