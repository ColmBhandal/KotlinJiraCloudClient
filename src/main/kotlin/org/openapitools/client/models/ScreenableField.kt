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
 * A screen tab field.
 * @param id The ID of the screen tab field.
 * @param name The name of the screen tab field. Required on create and update. The maximum length is 255 characters.
 */

data class ScreenableField (
    /* The ID of the screen tab field. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* The name of the screen tab field. Required on create and update. The maximum length is 255 characters. */
    @Json(name = "name")
    val name: kotlin.String? = null
) 



