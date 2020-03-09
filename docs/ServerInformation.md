
# ServerInformation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseUrl** | **kotlin.String** | The base URL of the Jira instance. |  [optional]
**version** | **kotlin.String** | The version of Jira. |  [optional]
**versionNumbers** | **kotlin.Array&lt;kotlin.Int&gt;** | The major, minor, and revision version numbers of the Jira version. |  [optional]
**deploymentType** | **kotlin.String** | The type of server deployment. This is always returned as *Cloud*. |  [optional]
**buildNumber** | **kotlin.Int** | The build number of the Jira version. |  [optional]
**buildDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp when the Jira version was built. |  [optional]
**serverTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time in Jira when this request was responded to. |  [optional]
**scmInfo** | **kotlin.String** | The unique identifier of the Jira version. |  [optional]
**serverTitle** | **kotlin.String** | The name of the Jira instance. |  [optional]
**healthChecks** | [**kotlin.Array&lt;HealthCheckResult&gt;**](HealthCheckResult.md) | Jira instance health check results. Deprecated and no longer returned. |  [optional]



