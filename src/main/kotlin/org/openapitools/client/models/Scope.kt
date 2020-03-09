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

import org.openapitools.client.models.ProjectForScope

import com.squareup.moshi.Json
/**
 * The projects the item is associated with. Indicated for items associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
 * @param type The type of scope.
 * @param project The project the item has scope in.
 */

data class Scope (
    /* The type of scope. */
    @Json(name = "type")
    val type: Scope.Type? = null,
    /* The project the item has scope in. */
    @Json(name = "project")
    val project: ProjectForScope? = null
) 


{
    /**
    * The type of scope.
    * Values: pROJECT,tEMPLATE
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "PROJECT") pROJECT("PROJECT"),
        @Json(name = "TEMPLATE") tEMPLATE("TEMPLATE");
    }
}
