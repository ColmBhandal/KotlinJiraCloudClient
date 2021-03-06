
# Version

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **kotlin.String** | Use [expand](em&gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;operations&#x60; Returns the list of operations available for this version.  *  &#x60;issuesstatus&#x60; Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update. |  [optional]
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the version. |  [optional] [readonly]
**id** | **kotlin.String** | The ID of the version. |  [optional] [readonly]
**description** | **kotlin.String** | The description of the version. Optional when creating or updating a version. |  [optional]
**name** | **kotlin.String** | The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters. |  [optional]
**archived** | **kotlin.Boolean** | Indicates that the version is archived. Optional when creating or updating a version. |  [optional]
**released** | **kotlin.Boolean** | Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version. |  [optional]
**startDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version. |  [optional]
**releaseDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version. |  [optional]
**overdue** | **kotlin.Boolean** | Indicates that the version is overdue. |  [optional] [readonly]
**userStartDate** | **kotlin.String** | The date on which work on this version is expected to start, expressed in the instance&#39;s *Day/Month/Year Format* date format. |  [optional] [readonly]
**userReleaseDate** | **kotlin.String** | The date on which work on this version is expected to finish, expressed in the instance&#39;s *Day/Month/Year Format* date format. |  [optional] [readonly]
**project** | **kotlin.String** | Deprecated. Use &#x60;projectId&#x60;. |  [optional]
**projectId** | **kotlin.Long** | The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version. |  [optional]
**moveUnfixedIssuesTo** | [**java.net.URI**](java.net.URI.md) | The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version. |  [optional]
**operations** | [**kotlin.Array&lt;SimpleLink&gt;**](SimpleLink.md) | If the expand option &#x60;operations&#x60; is used, returns the list of operations available for this version. |  [optional] [readonly]
**issuesStatusForFixVersion** | [**VersionIssuesStatus**](VersionIssuesStatus.md) | If the expand option &#x60;issuesstatus&#x60; is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*. |  [optional] [readonly]



