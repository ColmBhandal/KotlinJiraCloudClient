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
 * @param name The name of the custom field, which is displayed in Jira. This is not the unique identifier.
 * @param type The type of the custom field. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppicker*.   *  `cascadingselect`: Allows multiple values to be selected using two select lists  *  `datepicker`: Stores a date using a picker control  *  `datetime`: Stores a date with a time component  *  `float`: Stores and validates a numeric (floating point) input  *  `grouppicker`: Stores a user group using a picker control  *  `importid`: A read-only field that stores the previous ID of the issue from the system that it was imported from  *  `labels`: Stores labels  *  `multicheckboxes`: Stores multiple values using checkboxes  *  `multigrouppicker`: Stores multiple user groups using a picker control  *  `multiselect`: Stores multiple values using a select list  *  `multiuserpicker`: Stores multiple users using a picker control  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control  *  `project`: Stores a project from a list of projects that the user is permitted to view  *  `radiobuttons`: Stores a value using radio buttons  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API  *  `select`: Stores a value from a configurable list of options  *  `textarea`: Stores a long text string using a multiline text area  *  `textfield`: Stores a text string using a single-line text box  *  `url`: Stores a URL  *  `userpicker`: Stores a user using a picker control  *  `version`: Stores a version using a picker control
 * @param searcherKey The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`
 * @param description The description of the custom field, which is displayed in Jira.
 */

data class CustomFieldDefinitionJsonBean (
    /* The name of the custom field, which is displayed in Jira. This is not the unique identifier. */
    @Json(name = "name")
    val name: kotlin.String,
    /* The type of the custom field. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppicker*.   *  `cascadingselect`: Allows multiple values to be selected using two select lists  *  `datepicker`: Stores a date using a picker control  *  `datetime`: Stores a date with a time component  *  `float`: Stores and validates a numeric (floating point) input  *  `grouppicker`: Stores a user group using a picker control  *  `importid`: A read-only field that stores the previous ID of the issue from the system that it was imported from  *  `labels`: Stores labels  *  `multicheckboxes`: Stores multiple values using checkboxes  *  `multigrouppicker`: Stores multiple user groups using a picker control  *  `multiselect`: Stores multiple values using a select list  *  `multiuserpicker`: Stores multiple users using a picker control  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control  *  `project`: Stores a project from a list of projects that the user is permitted to view  *  `radiobuttons`: Stores a value using radio buttons  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API  *  `select`: Stores a value from a configurable list of options  *  `textarea`: Stores a long text string using a multiline text area  *  `textfield`: Stores a text string using a single-line text box  *  `url`: Stores a URL  *  `userpicker`: Stores a user using a picker control  *  `version`: Stores a version using a picker control */
    @Json(name = "type")
    val type: CustomFieldDefinitionJsonBean.Type,
    /* The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher` */
    @Json(name = "searcherKey")
    val searcherKey: CustomFieldDefinitionJsonBean.SearcherKey,
    /* The description of the custom field, which is displayed in Jira. */
    @Json(name = "description")
    val description: kotlin.String? = null
) 


{
    /**
    * The type of the custom field. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppicker*.   *  `cascadingselect`: Allows multiple values to be selected using two select lists  *  `datepicker`: Stores a date using a picker control  *  `datetime`: Stores a date with a time component  *  `float`: Stores and validates a numeric (floating point) input  *  `grouppicker`: Stores a user group using a picker control  *  `importid`: A read-only field that stores the previous ID of the issue from the system that it was imported from  *  `labels`: Stores labels  *  `multicheckboxes`: Stores multiple values using checkboxes  *  `multigrouppicker`: Stores multiple user groups using a picker control  *  `multiselect`: Stores multiple values using a select list  *  `multiuserpicker`: Stores multiple users using a picker control  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control  *  `project`: Stores a project from a list of projects that the user is permitted to view  *  `radiobuttons`: Stores a value using radio buttons  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API  *  `select`: Stores a value from a configurable list of options  *  `textarea`: Stores a long text string using a multiline text area  *  `textfield`: Stores a text string using a single-line text box  *  `url`: Stores a URL  *  `userpicker`: Stores a user using a picker control  *  `version`: Stores a version using a picker control
    * Values: cascadingselect,datepicker,datetime,float,grouppicker,importid,labels,multicheckboxes,multigrouppicker,multiselect,multiuserpicker,multiversion,project,radiobuttons,readonlyfield,select,textarea,textfield,url,userpicker,version
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect") cascadingselect("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:datepicker") datepicker("com.atlassian.jira.plugin.system.customfieldtypes:datepicker"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:datetime") datetime("com.atlassian.jira.plugin.system.customfieldtypes:datetime"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:float") float("com.atlassian.jira.plugin.system.customfieldtypes:float"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:grouppicker") grouppicker("com.atlassian.jira.plugin.system.customfieldtypes:grouppicker"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:importid") importid("com.atlassian.jira.plugin.system.customfieldtypes:importid"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:labels") labels("com.atlassian.jira.plugin.system.customfieldtypes:labels"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes") multicheckboxes("com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker") multigrouppicker("com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multiselect") multiselect("com.atlassian.jira.plugin.system.customfieldtypes:multiselect"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multiuserpicker") multiuserpicker("com.atlassian.jira.plugin.system.customfieldtypes:multiuserpicker"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multiversion") multiversion("com.atlassian.jira.plugin.system.customfieldtypes:multiversion"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:project") project("com.atlassian.jira.plugin.system.customfieldtypes:project"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons") radiobuttons("com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield") readonlyfield("com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:select") select("com.atlassian.jira.plugin.system.customfieldtypes:select"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:textarea") textarea("com.atlassian.jira.plugin.system.customfieldtypes:textarea"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:textfield") textfield("com.atlassian.jira.plugin.system.customfieldtypes:textfield"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:url") url("com.atlassian.jira.plugin.system.customfieldtypes:url"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:userpicker") userpicker("com.atlassian.jira.plugin.system.customfieldtypes:userpicker"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:version") version("com.atlassian.jira.plugin.system.customfieldtypes:version");
    }
    /**
    * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`
    * Values: cascadingselectsearcher,daterange,datetimerange,exactnumber,exacttextsearcher,grouppickersearcher,labelsearcher,multiselectsearcher,numberrange,projectsearcher,textsearcher,userpickergroupsearcher,versionsearcher
    */
    
    enum class SearcherKey(val value: kotlin.String){
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher") cascadingselectsearcher("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:daterange") daterange("com.atlassian.jira.plugin.system.customfieldtypes:daterange"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:datetimerange") datetimerange("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:exactnumber") exactnumber("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher") exacttextsearcher("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher") grouppickersearcher("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher") labelsearcher("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher") multiselectsearcher("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:numberrange") numberrange("com.atlassian.jira.plugin.system.customfieldtypes:numberrange"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher") projectsearcher("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:textsearcher") textsearcher("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher") userpickergroupsearcher("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher"),
        @Json(name = "com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher") versionsearcher("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher");
    }
}

