
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **kotlin.String** | The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary. |  [optional]
**textBody** | **kotlin.String** | The plain text body of the email notification for the issue. |  [optional]
**htmlBody** | **kotlin.String** | The HTML body of the email notification for the issue. |  [optional]
**to** | [**NotificationRecipients**](NotificationRecipients.md) | The recipients of the email notification for the issue. |  [optional]
**restrict** | [**NotificationRecipientsRestrictions**](NotificationRecipientsRestrictions.md) | Restricts the notifications to users with the specified permissions. |  [optional]



