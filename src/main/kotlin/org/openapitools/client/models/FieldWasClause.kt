/**
* The Jira Cloud platform REST API
* Jira Cloud platform REST API documentation
*
* The version of the OpenAPI document: 1001.0.0-SNAPSHOT
* Contact: ecosystem@atlassian.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.JqlQueryClauseOperand
import org.openapitools.client.models.JqlQueryClauseTimePredicate
import org.openapitools.client.models.JqlQueryField

import com.squareup.moshi.Json
/**
 * A clause that asserts a previous value of a field. For example, `status WAS \"Resolved\" BY currentUser() BEFORE \"2019/02/02\"`. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.
 * @param field 
 * @param operator The operator between the field and operand.
 * @param operand 
 * @param predicates The list of time predicates.
 */

data class FieldWasClause (
    @Json(name = "field")
    val field: JqlQueryField,
    /* The operator between the field and operand. */
    @Json(name = "operator")
    val operator: FieldWasClause.Operator,
    @Json(name = "operand")
    val operand: JqlQueryClauseOperand,
    /* The list of time predicates. */
    @Json(name = "predicates")
    val predicates: kotlin.Array<JqlQueryClauseTimePredicate>
) 


{
    /**
    * The operator between the field and operand.
    * Values: was,wasIn,wasNotIn,wasNot
    */
    
    enum class Operator(val value: kotlin.String){
        @Json(name = "was") was("was"),
        @Json(name = "was in") wasIn("was in"),
        @Json(name = "was not in") wasNotIn("was not in"),
        @Json(name = "was not") wasNot("was not");
    }
}

