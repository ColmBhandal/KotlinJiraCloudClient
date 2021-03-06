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
 * Details of the scope of the default sharing for new filters and dashboards.
 * @param scope The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.
 */

data class DefaultShareScope (
    /* The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users. */
    @Json(name = "scope")
    val scope: DefaultShareScope.Scope
) 


{
    /**
    * The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.
    * Values: gLOBAL,aUTHENTICATED,pRIVATE
    */
    
    enum class Scope(val value: kotlin.String){
        @Json(name = "GLOBAL") gLOBAL("GLOBAL"),
        @Json(name = "AUTHENTICATED") aUTHENTICATED("AUTHENTICATED"),
        @Json(name = "PRIVATE") pRIVATE("PRIVATE");
    }
}

