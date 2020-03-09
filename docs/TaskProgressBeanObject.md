
# TaskProgressBeanObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | [**java.net.URI**](java.net.URI.md) | The URL of the task. | 
**id** | **kotlin.String** | The ID of the task. | 
**status** | [**inline**](#StatusEnum) | The status of the task. | 
**submittedBy** | **kotlin.Long** | The ID of the user who submitted the task. | 
**progress** | **kotlin.Long** | The progress of the task, as a percentage complete. | 
**elapsedRuntime** | **kotlin.Long** | The execution time of the task, in milliseconds. | 
**submitted** | **kotlin.Long** | A timestamp recording when the task was submitted. | 
**lastUpdate** | **kotlin.Long** | A timestamp recording when the task progress was last updated. | 
**description** | **kotlin.String** | The description of the task. |  [optional]
**message** | **kotlin.String** | Information about the progress of the task. |  [optional]
**result** | [**kotlin.Any**](kotlin.Any.md) | The result of the task execution. |  [optional]
**started** | **kotlin.Long** | A timestamp recording when the task was started. |  [optional]
**finished** | **kotlin.Long** | A timestamp recording when the task was finished. |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | ENQUEUED, RUNNING, COMPLETE, FAILED, CANCEL_REQUESTED, CANCELLED, DEAD



