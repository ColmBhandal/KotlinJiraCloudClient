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
 * Identifiers for a project.
 * @param self The URL of the created project.
 * @param id The ID of the created project.
 * @param key The key of the created project.
 */

data class ProjectIdentifiers (
    /* The URL of the created project. */
    @Json(name = "self")
    val self: java.net.URI,
    /* The ID of the created project. */
    @Json(name = "id")
    val id: kotlin.Long,
    /* The key of the created project. */
    @Json(name = "key")
    val key: kotlin.String
) 


