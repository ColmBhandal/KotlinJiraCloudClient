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
 * Details about a project type.
 * @param key The key of the project type.
 * @param formattedKey The formatted key of the project type.
 * @param descriptionI18nKey The key of the project type's description.
 * @param icon The icon of the project type.
 * @param color The color of the project type.
 */

data class ProjectType (
    /* The key of the project type. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* The formatted key of the project type. */
    @Json(name = "formattedKey")
    val formattedKey: kotlin.String? = null,
    /* The key of the project type's description. */
    @Json(name = "descriptionI18nKey")
    val descriptionI18nKey: kotlin.String? = null,
    /* The icon of the project type. */
    @Json(name = "icon")
    val icon: kotlin.String? = null,
    /* The color of the project type. */
    @Json(name = "color")
    val color: kotlin.String? = null
) 


