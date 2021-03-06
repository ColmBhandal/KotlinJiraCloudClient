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

import org.openapitools.client.models.JiraExpressionEvalContextBean

import com.squareup.moshi.Json
/**
 * 
 * @param expression The Jira expression to evaluate.
 * @param context The context in which the Jira expression is evaluated.
 */

data class JiraExpressionEvalRequestBean (
    /* The Jira expression to evaluate. */
    @Json(name = "expression")
    val expression: kotlin.String,
    /* The context in which the Jira expression is evaluated. */
    @Json(name = "context")
    val context: JiraExpressionEvalContextBean? = null
) 



