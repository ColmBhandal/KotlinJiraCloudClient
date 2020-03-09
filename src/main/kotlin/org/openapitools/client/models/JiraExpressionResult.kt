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

import org.openapitools.client.models.JiraExpressionEvaluationMetaDataBean

import com.squareup.moshi.Json
/**
 * The result of evaluating a Jira expression.
 * @param value The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)
 * @param meta Contains various characteristics of the performed expression evaluation.
 */

data class JiraExpressionResult (
    /* The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.) */
    @Json(name = "value")
    val value: kotlin.Any,
    /* Contains various characteristics of the performed expression evaluation. */
    @Json(name = "meta")
    val meta: JiraExpressionEvaluationMetaDataBean? = null
) 



