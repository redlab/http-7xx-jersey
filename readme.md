# HTTP 7XX Status ENUM for Jersey.

Add fun to your REST API !

Implementation of the StatusType with all HTTP 7xx codes as defined in https://github.com/joho/7XX-rfc

Use:



## Custom statusses and tomcat

By default tomcat does not allow to set custom messages for statusses. To get tomcat to send the custom message you have to add a parameter at startup set -Dorg.apache.coyote.USE_CUSTOM_STATUS_MSG_IN_HEADER=true
