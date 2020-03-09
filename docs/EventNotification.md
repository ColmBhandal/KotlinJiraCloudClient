
# EventNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expand** | **kotlin.String** | Expand options that include additional event notification details in the response. |  [optional]
**id** | **kotlin.Long** | The ID of the notification. |  [optional]
**notificationType** | [**inline**](#NotificationTypeEnum) | Identifies the recipients of the notification. |  [optional]
**parameter** | **kotlin.String** | The value of the &#x60;notificationType&#x60;:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user account ID.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field. |  [optional]
**group** | [**GroupName**](GroupName.md) | The specified group. |  [optional]
**field** | [**FieldDetails**](FieldDetails.md) | The custom user or group field. |  [optional]
**emailAddress** | **kotlin.String** | The email address. |  [optional]
**projectRole** | [**ProjectRole**](ProjectRole.md) | The specified project role. |  [optional]
**user** | [**UserDetails**](UserDetails.md) | The specified user. |  [optional]


<a name="NotificationTypeEnum"></a>
## Enum: notificationType
Name | Value
---- | -----
notificationType | CurrentAssignee, Reporter, CurrentUser, ProjectLead, ComponentLead, User, Group, ProjectRole, EmailAddress, AllWatchers, UserCustomField, GroupCustomField



