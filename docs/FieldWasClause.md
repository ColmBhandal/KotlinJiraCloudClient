
# FieldWasClause

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**JqlQueryField**](JqlQueryField.md) |  | 
**operator** | [**inline**](#OperatorEnum) | The operator between the field and operand. | 
**operand** | [**JqlQueryClauseOperand**](JqlQueryClauseOperand.md) |  | 
**predicates** | [**kotlin.Array&lt;JqlQueryClauseTimePredicate&gt;**](JqlQueryClauseTimePredicate.md) | The list of time predicates. | 


<a name="OperatorEnum"></a>
## Enum: operator
Name | Value
---- | -----
operator | was, was in, was not in, was not



