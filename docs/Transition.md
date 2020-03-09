
# Transition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the transition. | 
**name** | **kotlin.String** | The name of the transition. | 
**description** | **kotlin.String** | The description of the transition. | 
**from** | **kotlin.Array&lt;kotlin.String&gt;** | The statuses the transition can start from. | 
**to** | **kotlin.String** | The status the transition goes to. | 
**type** | [**inline**](#TypeEnum) | The type of the transition. | 
**screen** | [**ScreenID**](ScreenID.md) |  |  [optional]
**rules** | [**WorkflowRules**](WorkflowRules.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | global, initial, directed



