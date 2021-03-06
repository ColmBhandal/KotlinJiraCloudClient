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
 * Details about a notification event.
 * @param id The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
 * @param name The name of the event.
 * @param description The description of the event.
 * @param templateEvent The template of the event. Only custom events configured by Jira administrators have template.
 */

data class NotificationEvent (
    /* The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg). */
    @Json(name = "id")
    val id: kotlin.Long? = null,
    /* The name of the event. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The description of the event. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The template of the event. Only custom events configured by Jira administrators have template. */
    @Json(name = "templateEvent")
    val templateEvent: NotificationEvent? = null
) 



