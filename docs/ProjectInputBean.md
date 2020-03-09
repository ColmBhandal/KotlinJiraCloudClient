
# ProjectInputBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters. Required when creating a project. Optional when updating a project. |  [optional]
**name** | **kotlin.String** | The name of the project. Required when creating a project. Optional when updating a project. |  [optional]
**projectTypeKey** | [**inline**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which dictates the application-specific feature set. Required when creating a project. Not applicable for the Update project resource. |  [optional]
**projectTemplateKey** | [**inline**](#ProjectTemplateKeyEnum) | A prebuilt configuration for a project. The type of the &#x60;projectTemplateKey&#x60; must match with the type of the &#x60;projectTypeKey&#x60;. Required when creating a project. Not applicable for the Update project resource. |  [optional]
**description** | **kotlin.String** | A brief description of the project. |  [optional]
**lead** | **kotlin.String** | This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;leadAccountId&#x60;. |  [optional]
**leadAccountId** | **kotlin.String** | The account ID of the project lead. Either &#x60;lead&#x60; or &#x60;leadAccountId&#x60; must be set when creating a project. Optional when updating a project. Cannot be provided with &#x60;lead&#x60;. |  [optional]
**url** | **kotlin.String** | A link to information about this project, such as project documentation |  [optional]
**assigneeType** | [**inline**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional]
**avatarId** | **kotlin.Long** | An integer value for the project&#39;s avatar. |  [optional]
**issueSecurityScheme** | **kotlin.Long** | The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs. |  [optional]
**permissionScheme** | **kotlin.Long** | The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs. |  [optional]
**notificationScheme** | **kotlin.Long** | The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs. |  [optional]
**categoryId** | **kotlin.Long** | The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. |  [optional]


<a name="ProjectTypeKeyEnum"></a>
## Enum: projectTypeKey
Name | Value
---- | -----
projectTypeKey | software, service_desk, business


<a name="ProjectTemplateKeyEnum"></a>
## Enum: projectTemplateKey
Name | Value
---- | -----
projectTemplateKey | com.pyxis.greenhopper.jira:gh-simplified-agility-kanban, com.pyxis.greenhopper.jira:gh-simplified-agility-scrum, com.pyxis.greenhopper.jira:gh-simplified-basic, com.pyxis.greenhopper.jira:gh-simplified-kanban-classic, com.pyxis.greenhopper.jira:gh-simplified-scrum-classic, com.atlassian.servicedesk:simplified-it-service-desk, com.atlassian.servicedesk:simplified-internal-service-desk, com.atlassian.servicedesk:simplified-external-service-desk, com.atlassian.servicedesk:simplified-hr-service-desk, com.atlassian.servicedesk:simplified-facilities-service-desk, com.atlassian.jira-core-project-templates:jira-core-simplified-content-management, com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval, com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking, com.atlassian.jira-core-project-templates:jira-core-simplified-process-control, com.atlassian.jira-core-project-templates:jira-core-simplified-procurement, com.atlassian.jira-core-project-templates:jira-core-simplified-project-management, com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment, com.atlassian.jira-core-project-templates:jira-core-simplified-task-, com.atlassian.jira.jira-incident-management-plugin:im-incident-management


<a name="AssigneeTypeEnum"></a>
## Enum: assigneeType
Name | Value
---- | -----
assigneeType | PROJECT_LEAD, UNASSIGNED



