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
 * Details about the operations available in this version.
 * @param id 
 * @param styleClass 
 * @param iconClass 
 * @param label 
 * @param title 
 * @param href 
 * @param weight 
 */

data class SimpleLink (
    @Json(name = "id")
    val id: kotlin.String? = null,
    @Json(name = "styleClass")
    val styleClass: kotlin.String? = null,
    @Json(name = "iconClass")
    val iconClass: kotlin.String? = null,
    @Json(name = "label")
    val label: kotlin.String? = null,
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "href")
    val href: kotlin.String? = null,
    @Json(name = "weight")
    val weight: kotlin.Int? = null
) 



