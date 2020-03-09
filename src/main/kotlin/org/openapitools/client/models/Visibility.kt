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
 * The group or role to which this item is visible.
 * @param type Whether visibility of this item is restricted to a group or role.
 * @param value The name of the group or role to which visibility of this item is restricted.
 */

data class Visibility (
    /* Whether visibility of this item is restricted to a group or role. */
    @Json(name = "type")
    val type: Visibility.Type? = null,
    /* The name of the group or role to which visibility of this item is restricted. */
    @Json(name = "value")
    val value: kotlin.String? = null
) 


{
    /**
    * Whether visibility of this item is restricted to a group or role.
    * Values: group,role
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "group") group("group"),
        @Json(name = "role") role("role");
    }
}

