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

import org.openapitools.client.models.JiraExpressionValidationError

import com.squareup.moshi.Json
/**
 * Details about the analysed Jira expression.
 * @param expression The analysed expression.
 * @param valid Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
 * @param errors A list of validation errors. Not included if the expression is valid.
 */

data class JiraExpressionAnalysis (
    /* The analysed expression. */
    @Json(name = "expression")
    val expression: kotlin.String,
    /* Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations). */
    @Json(name = "valid")
    val valid: kotlin.Boolean,
    /* A list of validation errors. Not included if the expression is valid. */
    @Json(name = "errors")
    val errors: kotlin.Array<JiraExpressionValidationError>? = null
) 


