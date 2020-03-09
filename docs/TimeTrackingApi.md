# TimeTrackingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet**](TimeTrackingApi.md#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet) | **GET** /rest/api/3/configuration/timetracking/list | Get all time tracking providers
[**comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet**](TimeTrackingApi.md#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet) | **GET** /rest/api/3/configuration/timetracking | Get selected time tracking provider
[**comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet**](TimeTrackingApi.md#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet) | **GET** /rest/api/3/configuration/timetracking/options | Get time tracking settings
[**comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut**](TimeTrackingApi.md#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut) | **PUT** /rest/api/3/configuration/timetracking | Select time tracking provider
[**comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut**](TimeTrackingApi.md#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut) | **PUT** /rest/api/3/configuration/timetracking/options | Set time tracking settings


<a name="comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet"></a>
# **comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet**
> kotlin.Array&lt;TimeTrackingProvider&gt; comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet()

Get all time tracking providers

Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeTrackingApi()
try {
    val result : kotlin.Array<TimeTrackingProvider> = apiInstance.comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetAvailableTimeTrackingImplementationsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;TimeTrackingProvider&gt;**](TimeTrackingProvider.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet"></a>
# **comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet**
> TimeTrackingProvider comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet()

Get selected time tracking provider

Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeTrackingApi()
try {
    val result : TimeTrackingProvider = apiInstance.comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSelectedTimeTrackingImplementationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimeTrackingProvider**](TimeTrackingProvider.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet"></a>
# **comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet**
> TimeTrackingConfiguration comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet()

Get time tracking settings

Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeTrackingApi()
try {
    val result : TimeTrackingConfiguration = apiInstance.comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceGetSharedTimeTrackingConfigurationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimeTrackingConfiguration**](TimeTrackingConfiguration.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut"></a>
# **comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut**
> kotlin.Any comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut(timeTrackingProvider)

Select time tracking provider

Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeTrackingApi()
val timeTrackingProvider : TimeTrackingProvider = {"key":"Jira"} // TimeTrackingProvider | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut(timeTrackingProvider)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSelectTimeTrackingImplementationPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeTrackingProvider** | [**TimeTrackingProvider**](TimeTrackingProvider.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut"></a>
# **comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut**
> TimeTrackingConfiguration comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut(timeTrackingConfiguration)

Set time tracking settings

Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeTrackingApi()
val timeTrackingConfiguration : TimeTrackingConfiguration = {"defaultUnit":"hour","workingHoursPerDay":7.6,"workingDaysPerWeek":5.5,"timeFormat":"pretty"} // TimeTrackingConfiguration | 
try {
    val result : TimeTrackingConfiguration = apiInstance.comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut(timeTrackingConfiguration)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeTrackingApi#comAtlassianJiraRestV2AdminTimetrackingTimeTrackingResourceSetSharedTimeTrackingConfigurationPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeTrackingConfiguration** | [**TimeTrackingConfiguration**](TimeTrackingConfiguration.md)|  |

### Return type

[**TimeTrackingConfiguration**](TimeTrackingConfiguration.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

