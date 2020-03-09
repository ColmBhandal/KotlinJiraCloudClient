
# UserWriteBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailAddress** | **kotlin.String** | The email address for the user. | 
**displayName** | **kotlin.String** | The display name for the user. | 
**self** | **kotlin.String** | The URL of the user. |  [optional] [readonly]
**key** | **kotlin.String** | The key for the user. When provided with &#x60;name&#x60;, overrides the value in &#x60;name&#x60; to set both &#x60;name&#x60; and &#x60;key&#x60;. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**name** | **kotlin.String** | The username for the user. This property is deprecated because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**password** | **kotlin.String** | A password for the user. If a password is not set, a random password is generated. |  [optional]
**notification** | **kotlin.String** | Sends the user an email confirmation that they have been added to Jira. Default is &#x60;false&#x60;. |  [optional]
**applicationKeys** | **kotlin.Array&lt;kotlin.String&gt;** | Deprecated, do not use. |  [optional]



