
# ApplicationRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | The key of the application role. |  [optional]
**groups** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The groups associated with the application role. |  [optional]
**name** | **kotlin.String** | The display name of the application role. |  [optional]
**defaultGroups** | **kotlin.collections.Set&lt;kotlin.String&gt;** | The groups that are granted default access for this application role. |  [optional]
**selectedByDefault** | **kotlin.Boolean** | Determines whether this application role should be selected by default on user creation. |  [optional]
**defined** | **kotlin.Boolean** | Deprecated. |  [optional]
**numberOfSeats** | **kotlin.Int** | The maximum count of users on your license. |  [optional]
**remainingSeats** | **kotlin.Int** | The count of users remaining on your license. |  [optional]
**userCount** | **kotlin.Int** | The number of users counting against your license. |  [optional]
**userCountDescription** | **kotlin.String** | The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license. |  [optional]
**hasUnlimitedSeats** | **kotlin.Boolean** |  |  [optional]
**platform** | **kotlin.Boolean** | Indicates if the application role belongs to Jira platform (&#x60;jira-core&#x60;). |  [optional]



