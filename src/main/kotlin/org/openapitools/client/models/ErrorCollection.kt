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


import com.squareup.moshi.Json
/**
 * Error messages from an operation.
 * @param errorMessages The list of error messages produced by this operation. For example, \"input parameter 'key' must be provided\"
 * @param errors The list of errors by parameter returned by the operation. For example,\"projectKey\": \"Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\"
 * @param status 
 */

data class ErrorCollection (
    /* The list of error messages produced by this operation. For example, \"input parameter 'key' must be provided\" */
    @Json(name = "errorMessages")
    val errorMessages: kotlin.Array<kotlin.String>? = null,
    /* The list of errors by parameter returned by the operation. For example,\"projectKey\": \"Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\" */
    @Json(name = "errors")
    val errors: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    @Json(name = "status")
    val status: kotlin.Int? = null
) 



