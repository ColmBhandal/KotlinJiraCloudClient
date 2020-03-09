
# VersionIssueCounts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL of these count details. |  [optional] [readonly]
**issuesFixedCount** | **kotlin.Long** | Count of issues where the &#x60;fixVersion&#x60; is set to the version. |  [optional] [readonly]
**issuesAffectedCount** | **kotlin.Long** | Count of issues where the &#x60;affectedVersion&#x60; is set to the version. |  [optional] [readonly]
**issueCountWithCustomFieldsShowingVersion** | **kotlin.Long** | Count of issues where a version custom field is set to the version. |  [optional] [readonly]
**customFieldUsage** | [**kotlin.Array&lt;VersionUsageInCustomField&gt;**](VersionUsageInCustomField.md) | List of custom fields using the version. |  [optional] [readonly]



