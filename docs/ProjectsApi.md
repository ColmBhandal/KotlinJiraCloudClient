# ProjectsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost) | **POST** /rest/api/3/project | Create project
[**comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete) | **DELETE** /rest/api/3/project/{projectIdOrKey} | Delete project
[**comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet) | **GET** /rest/api/3/project | Get all projects
[**comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet) | **GET** /rest/api/3/project/{projectIdOrKey}/statuses | Get all statuses for project
[**comAtlassianJiraRestV2IssueProjectResourceGetProjectGet**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetProjectGet) | **GET** /rest/api/3/project/{projectIdOrKey} | Get project
[**comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet) | **GET** /rest/api/3/project/search | Get projects paginated
[**comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut) | **PUT** /rest/api/3/project/{projectIdOrKey} | Update project
[**comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut**](ProjectsApi.md#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut) | **PUT** /rest/api/3/project/{projectIdOrKey}/type/{newProjectTypeKey} | Update project type
[**comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet**](ProjectsApi.md#comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet) | **GET** /rest/api/3/project/{projectId}/hierarchy | Get project issue type hierarchy
[**comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet**](ProjectsApi.md#comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet) | **GET** /rest/api/3/project/{projectKeyOrId}/notificationscheme | Get project notification scheme


<a name="comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost"></a>
# **comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost**
> ProjectIdentifiers comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost(projectInputBean)

Create project

Creates a project based on a project type template, as shown in the following table:  | Project Type Key | Project Template Key |   |--|--|   | &#x60;business&#x60; | &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-content-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-process-control&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-procurement&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-project-management&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment&#x60;, &#x60;com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking&#x60; |   | &#x60;service_desk&#x60; | &#x60;com.atlassian.servicedesk:simplified-it-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-internal-service-desk&#x60;, &#x60;com.atlassian.servicedesk:simplified-external-service-desk&#x60; |   | &#x60;software&#x60; | &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-kanban&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-agility-scrum&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-basic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-kanban-classic&#x60;, &#x60;com.pyxis.greenhopper.jira:gh-simplified-scrum-classic&#x60; |   The project types are available according to the installed Jira features as follows:   *  Jira Core, the default, enables &#x60;business&#x60; projects.  *  Jira Service Desk enables &#x60;service_desk&#x60; projects.  *  Jira Software enables &#x60;software&#x60; projects.  To determine which features are installed, go to **Jira settings** &gt; **Apps** &gt; **Manage apps** and review the System Apps list. To add JIRA Software or JIRA Service Desk into a JIRA instance, use **Jira settings** &gt; **Apps** &gt; **Finding new apps**. For more information, see [ Managing add-ons](https://confluence.atlassian.com/x/S31NLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectInputBean : ProjectInputBean = {"notificationScheme":10021,"description":"Example Project description","lead":"Charlie","url":"http://atlassian.com","projectTemplateKey":"com.atlassian.jira-core-project-templates:jira-core-simplified-process-control","avatarId":10200,"issueSecurityScheme":10001,"name":"Example","permissionScheme":10011,"assigneeType":"PROJECT_LEAD","projectTypeKey":"business","key":"EX","categoryId":10120} // ProjectInputBean | The JSON representation of the project being created.
try {
    val result : ProjectIdentifiers = apiInstance.comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost(projectInputBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceCreateProjectPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectInputBean** | [**ProjectInputBean**](ProjectInputBean.md)| The JSON representation of the project being created. |

### Return type

[**ProjectIdentifiers**](ProjectIdentifiers.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete"></a>
# **comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete**
> comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete(projectIdOrKey, enableUndo)

Delete project

Deletes a project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val enableUndo : kotlin.Boolean = true // kotlin.Boolean | EXPERIMENTAL. Whether this project is placed in the Jira recycle bin where it will be available for restoration.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete(projectIdOrKey, enableUndo)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **enableUndo** | **kotlin.Boolean**| EXPERIMENTAL. Whether this project is placed in the Jira recycle bin where it will be available for restoration. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet**
> kotlin.Array&lt;Project&gt; comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet(expand, recent, properties)

Get all projects

Returns all projects visible to the user. Deprecated, use [ Get projects paginated](#api-rest-api-3-project-search-get) that supports search and pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `issueTypes` Returns all issue types associated with the project.  *  `lead` Returns information about the the project lead.  *  `projectKeys` Returns all project keys associated with the project.
val recent : kotlin.Int = 56 // kotlin.Int | Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
val properties : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of project properties to return for the project. This parameter accepts a comma-separated list.
try {
    val result : kotlin.Array<Project> = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet(expand, recent, properties)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  &#x60;description&#x60; Returns the project description.  *  &#x60;issueTypes&#x60; Returns all issue types associated with the project.  *  &#x60;lead&#x60; Returns information about the the project lead.  *  &#x60;projectKeys&#x60; Returns all project keys associated with the project. | [optional]
 **recent** | **kotlin.Int**| Returns the user&#39;s most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session. | [optional]
 **properties** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of project properties to return for the project. This parameter accepts a comma-separated list. | [optional]

### Return type

[**kotlin.Array&lt;Project&gt;**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet**
> kotlin.Array&lt;IssueTypeWithStatus&gt; comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet(projectIdOrKey)

Get all statuses for project

Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : kotlin.Array<IssueTypeWithStatus> = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet(projectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllStatusesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |

### Return type

[**kotlin.Array&lt;IssueTypeWithStatus&gt;**](IssueTypeWithStatus.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceGetProjectGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetProjectGet**
> Project comAtlassianJiraRestV2IssueProjectResourceGetProjectGet(projectIdOrKey, expand, properties)

Get project

Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  `description` The project description.  *  `issueTypes` The issue types associated with the project.  *  `lead` The project lead.  *  `projectKeys` All project keys associated with the project.  *  `issueTypeHierarchy` The project issue type hierarchy.
val properties : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of project properties to return for the project. This parameter accepts a comma-separated list.
try {
    val result : Project = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetProjectGet(projectIdOrKey, expand, properties)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceGetProjectGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  &#x60;description&#x60; The project description.  *  &#x60;issueTypes&#x60; The issue types associated with the project.  *  &#x60;lead&#x60; The project lead.  *  &#x60;projectKeys&#x60; All project keys associated with the project.  *  &#x60;issueTypeHierarchy&#x60; The project issue type hierarchy. | [optional]
 **properties** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of project properties to return for the project. This parameter accepts a comma-separated list. | [optional]

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet**
> PageBeanProject comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet(startAt, maxResults, orderBy, query, typeKey, categoryId, searchBy, action, expand, status)

Get projects paginated

Returns projects visible to the user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Projects are returned only where the user has one of:   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val orderBy : kotlin.String = orderBy_example // kotlin.String | [Order](#ordering) the results by a field.   *  `category` Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-3-projectCategory-get).  *  `issueCount` Sorts by the total number of issues in each project.  *  `key` Sorts by project key.  *  `lastIssueUpdatedTime` Sorts by the last issue update time.  *  `name` Sorts by project name.  *  `owner` Sorts by project lead.  *  `archivedDate` EXPERIMENTAL. Sorts by project archived date.  *  `deletedDate` EXPERIMENTAL. Sorts by project deleted date.
val query : kotlin.String = query_example // kotlin.String | Filter the results using a literal string. Projects with a matching `key` or `name` are returned (case insensitive).
val typeKey : kotlin.String = typeKey_example // kotlin.String | Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are `business`, `service_desk`, and `software`.
val categoryId : kotlin.Long = 789 // kotlin.Long | The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.
val searchBy : kotlin.String = searchBy_example // kotlin.String | 
val action : kotlin.String = action_example // kotlin.String | Filter results by projects for which the user can:   *  `view` the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  `browse` the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  `edit` the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  `description` Returns the project description.  *  `projectKeys` Returns all project keys associated with a project.  *  `lead` Returns information about the the project lead.  *  `issueTypes` Returns all issue types associated with the project.  *  `url` Returns the URL associated with the project.  *  `insight` EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
val status : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | EXPERIMENTAL. Filter results by project status:   *  `live` Search live projects.  *  `archived` Search archived projects.  *  `deleted` Search deleted projects, those in the recycle bin.
try {
    val result : PageBeanProject = apiInstance.comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet(startAt, maxResults, orderBy, query, typeKey, categoryId, searchBy, action, expand, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceSearchProjectsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **orderBy** | **kotlin.String**| [Order](#ordering) the results by a field.   *  &#x60;category&#x60; Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-3-projectCategory-get).  *  &#x60;issueCount&#x60; Sorts by the total number of issues in each project.  *  &#x60;key&#x60; Sorts by project key.  *  &#x60;lastIssueUpdatedTime&#x60; Sorts by the last issue update time.  *  &#x60;name&#x60; Sorts by project name.  *  &#x60;owner&#x60; Sorts by project lead.  *  &#x60;archivedDate&#x60; EXPERIMENTAL. Sorts by project archived date.  *  &#x60;deletedDate&#x60; EXPERIMENTAL. Sorts by project deleted date. | [optional] [default to &#39;key&#39;] [enum: category, -category, +category, key, -key, +key, name, -name, +name, owner, -owner, +owner, issueCount, -issueCount, +issueCount, lastIssueUpdatedDate, -lastIssueUpdatedDate, +lastIssueUpdatedDate, archivedDate, +archivedDate, -archivedDate, deletedDate, +deletedDate, -deletedDate]
 **query** | **kotlin.String**| Filter the results using a literal string. Projects with a matching &#x60;key&#x60; or &#x60;name&#x60; are returned (case insensitive). | [optional]
 **typeKey** | **kotlin.String**| Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are &#x60;business&#x60;, &#x60;service_desk&#x60;, and &#x60;software&#x60;. | [optional]
 **categoryId** | **kotlin.Long**| The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. | [optional]
 **searchBy** | **kotlin.String**|  | [optional] [default to &#39;key, name&#39;]
 **action** | **kotlin.String**| Filter results by projects for which the user can:   *  &#x60;view&#x60; the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  &#x60;browse&#x60; the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  &#x60;edit&#x60; the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). | [optional] [default to &#39;view&#39;] [enum: view, browse, edit]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  &#x60;description&#x60; Returns the project description.  *  &#x60;projectKeys&#x60; Returns all project keys associated with a project.  *  &#x60;lead&#x60; Returns information about the the project lead.  *  &#x60;issueTypes&#x60; Returns all issue types associated with the project.  *  &#x60;url&#x60; Returns the URL associated with the project.  *  &#x60;insight&#x60; EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project. | [optional]
 **status** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| EXPERIMENTAL. Filter results by project status:   *  &#x60;live&#x60; Search live projects.  *  &#x60;archived&#x60; Search archived projects.  *  &#x60;deleted&#x60; Search deleted projects, those in the recycle bin. | [optional]

### Return type

[**PageBeanProject**](PageBeanProject.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut"></a>
# **comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut**
> Project comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut(projectIdOrKey, projectInputBean, expand)

Update project

Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.  All parameters are optional in the body of the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val projectInputBean : ProjectInputBean = {"notificationScheme":10021,"description":"Example Project description","lead":"Charlie","url":"http://atlassian.com","projectTemplateKey":"com.atlassian.jira-core-project-templates:jira-core-simplified-process-control","avatarId":10200,"issueSecurityScheme":10001,"name":"Example","permissionScheme":10011,"assigneeType":"PROJECT_LEAD","projectTypeKey":"business","key":"EX","categoryId":10120} // ProjectInputBean | The project details to be updated.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  `description` The project description.  *  `issueTypes` The issue types associated with the project.  *  `lead` The project lead.  *  `projectKeys` All project keys associated with the project.
try {
    val result : Project = apiInstance.comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut(projectIdOrKey, projectInputBean, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **projectInputBean** | [**ProjectInputBean**](ProjectInputBean.md)| The project details to be updated. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  &#x60;description&#x60; The project description.  *  &#x60;issueTypes&#x60; The issue types associated with the project.  *  &#x60;lead&#x60; The project lead.  *  &#x60;projectKeys&#x60; All project keys associated with the project. | [optional]

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut"></a>
# **comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut**
> Project comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut(projectIdOrKey, newProjectTypeKey)

Update project type

Deprecated, this feature is no longer supported and no alternatives are available, see [Convert project to a different template or type](https://confluence.atlassian.com/x/yEKeOQ). Updates a [project type](https://confluence.atlassian.com/x/GwiiLQ). The project type can be updated for classic projects only, project type cannot be updated for next-gen projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val newProjectTypeKey : kotlin.String = newProjectTypeKey_example // kotlin.String | The key of the new project type.
try {
    val result : Project = apiInstance.comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut(projectIdOrKey, newProjectTypeKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectTypePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **newProjectTypeKey** | **kotlin.String**| The key of the new project type. | [enum: software, service_desk, business]

### Return type

[**Project**](Project.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet"></a>
# **comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet**
> ProjectIssueTypeHierarchy comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet(projectId)

Get project issue type hierarchy

Get the issue type hierarchy for a next-gen project.  The issue type hierarchy for a project consists of:   *  *Epic* at level 1 (optional).  *  One or more issue types at level 0 such as *Story*, *Task*, or *Bug*. Where the issue type *Epic* is defined, these issue types are used to break down the content of an epic.  *  *Subtask* at level -1 (optional). This issue type enables level 0 issue types to be broken down into components. Issues based on a level -1 issue type must have a parent issue.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Long = 789 // kotlin.Long | The ID of the project.
try {
    val result : ProjectIssueTypeHierarchy = apiInstance.comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2NextgenHierarchyResourceGetHierarchyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Long**| The ID of the project. |

### Return type

[**ProjectIssueTypeHierarchy**](ProjectIssueTypeHierarchy.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet"></a>
# **comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet**
> NotificationScheme comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet(projectKeyOrId, expand)

Get project notification scheme

Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project. See the [Get notification scheme](#api-rest-api-3-notificationscheme-id-get) resource for more information about notification schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectKeyOrId : kotlin.String = projectKeyOrId_example // kotlin.String | The project ID or project key (case sensitive).
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about any custom fields assigned to receive an event.  *  `group` Returns information about any groups assigned to receive an event.  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information.  *  `projectRole` Returns information about any project roles assigned to receive an event.  *  `user` Returns information about any users assigned to receive an event.
try {
    val result : NotificationScheme = apiInstance.comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet(projectKeyOrId, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#comAtlassianJiraRestV2NotificationProjectNotificationSchemeResourceGetNotificationSchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeyOrId** | **kotlin.String**| The project ID or project key (case sensitive). |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. | [optional]

### Return type

[**NotificationScheme**](NotificationScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

