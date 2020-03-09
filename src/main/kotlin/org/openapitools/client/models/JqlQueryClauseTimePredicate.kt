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

import com.squareup.moshi.Json
/**
 * A time predicate for a temporal JQL clause.
 * @param operator The operator between the field and the operand.
 * @param operand 
 */

data class JqlQueryClauseTimePredicate (
    /* The operator between the field and the operand. */
    @Json(name = "operator")
    val operator: JqlQueryClauseTimePredicate.Operator,
    @Json(name = "operand")
    val operand: JqlQueryClauseOperand
) 


{
    /**
    * The operator between the field and the operand.
    * Values: before,after,from,to,on,during,by
    */
    
    enum class Operator(val value: kotlin.String){
        @Json(name = "before") before("before"),
        @Json(name = "after") after("after"),
        @Json(name = "from") from("from"),
        @Json(name = "to") to("to"),
        @Json(name = "on") on("on"),
        @Json(name = "during") during("during"),
        @Json(name = "by") by("by");
    }
}

