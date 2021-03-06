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

import org.openapitools.client.models.SimpleLink

import com.squareup.moshi.Json
/**
 * Details a link group, which defines issue operations.
 * @param id 
 * @param styleClass 
 * @param header 
 * @param weight 
 * @param links 
 * @param groups 
 */

data class LinkGroup (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "styleClass")
    val styleClass: kotlin.String? = null,
    @Json(name = "header")
    val header: SimpleLink? = null,
    @Json(name = "weight")
    val weight: kotlin.Int? = null,
    @Json(name = "links")
    val links: kotlin.Array<SimpleLink>? = null,
    @Json(name = "groups")
    val groups: kotlin.Array<LinkGroup>? = null
) 



