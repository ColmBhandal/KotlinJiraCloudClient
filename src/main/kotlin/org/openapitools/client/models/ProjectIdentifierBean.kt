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
 * The identifiers for a project.
 * @param id The ID of the project.
 * @param key The key of the project.
 */

data class ProjectIdentifierBean (
    /* The ID of the project. */
    @Json(name = "id")
    val id: kotlin.Long? = null,
    /* The key of the project. */
    @Json(name = "key")
    val key: kotlin.String? = null
) 



