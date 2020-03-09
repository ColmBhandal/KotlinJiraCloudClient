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
 * Details about the time tracking provider.
 * @param key The key for the time tracking provider. For example, *JIRA*.
 * @param name The name of the time tracking provider. For example, *JIRA provided time tracking*.
 * @param url The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app.
 */

data class TimeTrackingProvider (
    /* The key for the time tracking provider. For example, *JIRA*. */
    @Json(name = "key")
    val key: kotlin.String,
    /* The name of the time tracking provider. For example, *JIRA provided time tracking*. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app. */
    @Json(name = "url")
    val url: kotlin.String? = null
) 


