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

import org.openapitools.client.models.ErrorCollection

import com.squareup.moshi.Json
/**
 * 
 * @param status 
 * @param elementErrors 
 * @param failedElementNumber 
 */

data class BulkOperationErrorResult (
    @Json(name = "status")
    val status: kotlin.Int? = null,
    @Json(name = "elementErrors")
    val elementErrors: ErrorCollection? = null,
    @Json(name = "failedElementNumber")
    val failedElementNumber: kotlin.Int? = null
) 



