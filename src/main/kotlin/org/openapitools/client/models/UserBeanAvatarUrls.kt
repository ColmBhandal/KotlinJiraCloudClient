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
 * 
 * @param `16x16` The URL of the user's 16x16 pixel avatar.
 * @param `24x24` The URL of the user's 24x24 pixel avatar.
 * @param `32x32` The URL of the user's 32x32 pixel avatar.
 * @param `48x48` The URL of the user's 48x48 pixel avatar.
 */

data class UserBeanAvatarUrls (
    /* The URL of the user's 16x16 pixel avatar. */
    @Json(name = "16x16")
    val `16x16`: java.net.URI? = null,
    /* The URL of the user's 24x24 pixel avatar. */
    @Json(name = "24x24")
    val `24x24`: java.net.URI? = null,
    /* The URL of the user's 32x32 pixel avatar. */
    @Json(name = "32x32")
    val `32x32`: java.net.URI? = null,
    /* The URL of the user's 48x48 pixel avatar. */
    @Json(name = "48x48")
    val `48x48`: java.net.URI? = null
) 



