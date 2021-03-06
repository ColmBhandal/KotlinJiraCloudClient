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
 * A workflow transition.
 * @param id The transition ID.
 * @param name The transition name.
 */

data class WorkflowTransition (
    /* The transition ID. */
    @Json(name = "id")
    val id: kotlin.Int,
    /* The transition name. */
    @Json(name = "name")
    val name: kotlin.String
) 



