# JiraSettingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet**](JiraSettingsApi.md#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet) | **GET** /rest/api/3/application-properties/advanced-settings | Get advanced settings
[**comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet**](JiraSettingsApi.md#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet) | **GET** /rest/api/3/application-properties | Get application property
[**comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut**](JiraSettingsApi.md#comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut) | **PUT** /rest/api/3/application-properties/{id} | Set application property
[**comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet**](JiraSettingsApi.md#comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet) | **GET** /rest/api/3/configuration | Get global settings


<a name="comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet"></a>
# **comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet**
> kotlin.Array&lt;ApplicationProperty&gt; comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet()

Get advanced settings

Returns the application properties that are accessible on the *Advanced Settings* page. To navigate to the *Advanced Settings* page in Jira, choose the Jira icon &gt; **Jira settings** &gt; **System**, **General Configuration** and then click **Advanced Settings** (in the upper right).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JiraSettingsApi()
try {
    val result : kotlin.Array<ApplicationProperty> = apiInstance.comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetAdvancedSettingsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ApplicationProperty&gt;**](ApplicationProperty.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet"></a>
# **comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet**
> kotlin.Array&lt;ApplicationProperty&gt; comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet(key, permissionLevel, keyFilter)

Get application property

Returns all application properties or an application property.  If you specify a value for the &#x60;key&#x60; parameter, then an application property is returned as an object (not in an array). Otherwise, an array of all editable application properties is returned. See [Set application property](#api-rest-api-3-application-properties-id-put) for descriptions of editable properties.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JiraSettingsApi()
val key : kotlin.String = key_example // kotlin.String | The key of the application property.
val permissionLevel : kotlin.String = permissionLevel_example // kotlin.String | The permission level of all items being returned in the list.
val keyFilter : kotlin.String = keyFilter_example // kotlin.String | When a `key` isn't provided, this filters the list of results by the application property `key` using a regular expression. For example, using `jira.lf.*` will return all application properties with keys that start with *jira.lf.*.
try {
    val result : kotlin.Array<ApplicationProperty> = apiInstance.comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet(key, permissionLevel, keyFilter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceGetApplicationPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The key of the application property. | [optional]
 **permissionLevel** | **kotlin.String**| The permission level of all items being returned in the list. | [optional]
 **keyFilter** | **kotlin.String**| When a &#x60;key&#x60; isn&#39;t provided, this filters the list of results by the application property &#x60;key&#x60; using a regular expression. For example, using &#x60;jira.lf.*&#x60; will return all application properties with keys that start with *jira.lf.*. | [optional]

### Return type

[**kotlin.Array&lt;ApplicationProperty&gt;**](ApplicationProperty.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut"></a>
# **comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut**
> ApplicationProperty comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut(id, simpleApplicationPropertyBean)

Set application property

Changes the value of an application property. For example, you can change the value of the &#x60;jira.clone.prefix&#x60; from its default value of *CLONE -* to *Clone -* if you prefer sentence case capitalization. Editable properties are described below along with their default values.  #### Advanced settings ####  The advanced settings below are also accessible in [Jira](https://confluence.atlassian.com/x/vYXKM).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.clone.prefix&#x60; | The string of text prefixed to the title of a cloned issue. | &#x60;CLONE -&#x60; |   | &#x60;jira.date.picker.java.format&#x60; | The date format for the Java (server-side) generated dates. This must be the same as the &#x60;jira.date.picker.javascript.format&#x60; format setting. | &#x60;d/MMM/yy&#x60; |   | &#x60;jira.date.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated dates. This must be the same as the &#x60;jira.date.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y&#x60; |   | &#x60;jira.date.time.picker.java.format&#x60; | The date format for the Java (server-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.javascript.format&#x60; format setting. | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.date.time.picker.javascript.format&#x60; | The date format for the JavaScript (client-side) generated date times. This must be the same as the &#x60;jira.date.time.picker.java.format&#x60; format setting. | &#x60;%e/%b/%y %I:%M %p&#x60; |   | &#x60;jira.issue.actions.order&#x60; | The default order of actions (such as *Comments* or *Change history*) displayed on the issue view. | &#x60;asc&#x60; |   | &#x60;jira.table.cols.subtasks&#x60; | The columns to show while viewing subtask issues in a table. For example, a list of subtasks on an issue. | &#x60;issuetype, status, assignee, progress&#x60; |   | &#x60;jira.view.issue.links.sort.order&#x60; | The sort order of the list of issue links on the issue view. | &#x60;type, status, priority&#x60; |   | &#x60;jira.comment.collapsing.minimum.hidden&#x60; | The minimum number of comments required for comment collapsing to occur. A value of &#x60;0&#x60; disables comment collapsing. | &#x60;4&#x60; |   | &#x60;jira.newsletter.tip.delay.days&#x60; | The number of days before a prompt to sign up to the Jira Insiders newsletter is shown. A value of &#x60;-1&#x60; disables this feature. | &#x60;7&#x60; |     #### Look and feel ####  The settings listed below adjust the [look and feel](https://confluence.atlassian.com/x/VwCLLg).  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.lf.date.time&#x60; | The [ time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;h:mm a&#x60; |   | &#x60;jira.lf.date.day&#x60; | The [ day format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;EEEE h:mm a&#x60; |   | &#x60;jira.lf.date.complete&#x60; | The [ date and time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy h:mm a&#x60; |   | &#x60;jira.lf.date.dmy&#x60; | The [ date format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | &#x60;dd/MMM/yy&#x60; |   | &#x60;jira.date.time.picker.use.iso8061&#x60; | When enabled, sets Monday as the first day of the week in the date picker, as specified by the ISO8601 standard. | &#x60;false&#x60; |   | &#x60;jira.lf.logo.url&#x60; | The URL of the logo image file. | &#x60;/images/icon-jira-logo.png&#x60; |   | &#x60;jira.lf.logo.show.application.title&#x60; | Controls the visibility of the application title on the sidebar. | &#x60;false&#x60; |   | &#x60;jira.lf.favicon.url&#x60; | The URL of the favicon. | &#x60;/favicon.ico&#x60; |   | &#x60;jira.lf.favicon.hires.url&#x60; | The URL of the high-resolution favicon. | &#x60;/images/64jira.png&#x60; |   | &#x60;jira.lf.top.adg3.bgcolour&#x60; | The background color of the sidebar. | &#x60;#0747A6&#x60; |   | &#x60;jira.lf.top.adg3.textcolour&#x60; | The color of the text and logo of the sidebar. | &#x60;#DEEBFF&#x60; |   | &#x60;jira.lf.hero.button.base.bg.colour&#x60; | The background color of the hero button. | &#x60;#3b7fc4&#x60; |   | &#x60;jira.title&#x60; | The text for the application title. The application title can also be set in *General settings*. | &#x60;Jira&#x60; |   | &#x60;jira.option.globalsharing&#x60; | Whether filters and dashboards can be shared with anyone signed into Jira. | &#x60;true&#x60; |   | &#x60;xflow.product.suggestions.enabled&#x60; | Whether to expose product suggestions for other Atlassian products within Jira. | &#x60;true&#x60; |     #### Other settings ####  | Key | Description | Default value |   | -- | -- | -- |   | &#x60;jira.issuenav.criteria.autoupdate&#x60; | Whether instant updates to search criteria is active. | &#x60;true&#x60; |     *Note: Be careful when changing [application properties and advanced settings](https://confluence.atlassian.com/x/vYXKM).*  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JiraSettingsApi()
val id : kotlin.String = id_example // kotlin.String | The key of the application property to update.
val simpleApplicationPropertyBean : SimpleApplicationPropertyBean = {"id":"jira.home","value":"/var/jira/jira-home"} // SimpleApplicationPropertyBean | 
try {
    val result : ApplicationProperty = apiInstance.comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut(id, simpleApplicationPropertyBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminApplicationPropertiesResourceSetApplicationPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The key of the application property to update. |
 **simpleApplicationPropertyBean** | [**SimpleApplicationPropertyBean**](SimpleApplicationPropertyBean.md)|  |

### Return type

[**ApplicationProperty**](ApplicationProperty.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet"></a>
# **comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet**
> Configuration comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet()

Get global settings

Returns the [global settings](https://confluence.atlassian.com/x/qYXKM) in Jira. These settings determine whether optional features (for example, subtasks, time tracking, and others) are enabled. If time tracking is enabled, this operation also returns the time tracking configuration.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JiraSettingsApi()
try {
    val result : Configuration = apiInstance.comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JiraSettingsApi#comAtlassianJiraRestV2AdminConfigurationResourceGetConfigurationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Configuration**](Configuration.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
