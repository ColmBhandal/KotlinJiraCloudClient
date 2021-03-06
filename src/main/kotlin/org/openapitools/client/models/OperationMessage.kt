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
 * 
 * @param message The human-readable message that describes the result.
 * @param statusCode The status code of the response.
 */

data class OperationMessage (
    /* The human-readable message that describes the result. */
    @Json(name = "message")
    val message: kotlin.String,
    /* The status code of the response. */
    @Json(name = "statusCode")
    val statusCode: kotlin.Int
) 



