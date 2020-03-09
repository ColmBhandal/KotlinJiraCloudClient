# IssueNotificationSchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet**](IssueNotificationSchemesApi.md#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet) | **GET** /rest/api/3/notificationscheme/{id} | Get notification scheme
[**comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet**](IssueNotificationSchemesApi.md#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet) | **GET** /rest/api/3/notificationscheme | Get notification schemes paginated


<a name="comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet"></a>
# **comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet**
> NotificationScheme comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet(id, expand)

Get notification scheme

Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueNotificationSchemesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about any custom fields assigned to receive an event.  *  `group` Returns information about any groups assigned to receive an event.  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information.  *  `projectRole` Returns information about any project roles assigned to receive an event.  *  `user` Returns information about any users assigned to receive an event.
try {
    val result : NotificationScheme = apiInstance.comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet(id, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueNotificationSchemesApi#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueNotificationSchemesApi#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs. |
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

<a name="comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet"></a>
# **comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet**
> PageBeanNotificationScheme comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet(startAt, maxResults, expand)

Get notification schemes paginated

Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  ### About notification schemes ###  A notification scheme is a list of events and recipients who will receive notifications for those events. The list is contained within the &#x60;notificationSchemeEvents&#x60; object and contains pairs of &#x60;events&#x60; and &#x60;notifications&#x60;:   *  &#x60;event&#x60; Identifies the type of event. The events can be [Jira system events](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or [custom events](https://confluence.atlassian.com/x/AIlKLg).  *  &#x60;notifications&#x60; Identifies the [recipients](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-recipientsRecipients) of notifications for each event. Recipients can be any of the following types:           *  &#x60;CurrentAssignee&#x60;      *  &#x60;Reporter&#x60;      *  &#x60;CurrentUser&#x60;      *  &#x60;ProjectLead&#x60;      *  &#x60;ComponentLead&#x60;      *  &#x60;User&#x60; (the &#x60;parameter&#x60; is the user key)      *  &#x60;Group&#x60; (the &#x60;parameter&#x60; is the group name)      *  &#x60;ProjectRole&#x60; (the &#x60;parameter&#x60; is the project role ID)      *  &#x60;EmailAddress&#x60;      *  &#x60;AllWatchers&#x60;      *  &#x60;UserCustomField&#x60; (the &#x60;parameter&#x60; is the ID of the custom field)      *  &#x60;GroupCustomField&#x60;(the &#x60;parameter&#x60; is the ID of the custom field)  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueNotificationSchemesApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about any custom fields assigned to receive an event.  *  `group` Returns information about any groups assigned to receive an event.  *  `notificationSchemeEvents` Returns a list of event associations. This list is returned for all expandable information.  *  `projectRole` Returns information about any project roles assigned to receive an event.  *  `user` Returns information about any users assigned to receive an event.
try {
    val result : PageBeanNotificationScheme = apiInstance.comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet(startAt, maxResults, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueNotificationSchemesApi#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueNotificationSchemesApi#comAtlassianJiraRestV2NotificationNotificationSchemeResourceGetNotificationSchemesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. | [optional]

### Return type

[**PageBeanNotificationScheme**](PageBeanNotificationScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

