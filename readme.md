# HTTP 7XX Status ENUM for Jersey.

Add fun to your REST API !

Implementation of the StatusType with all HTTP 7xx codes as defined in https://github.com/joho/7XX-rfc

## Use

You can find it in Maven Central
```
<dependency>
  <groupId>be.redlab.jersey</groupId>
  <artifactId>http-7xx</artifactId>
  <version>1.0</version>
</dependency>
```
Or get a snapshot from sonatypes snapshot repos.

[![Build Status](https://redlab.ci.cloudbees.com/job/http-7xx-jersey/badge/icon)](https://redlab.ci.cloudbees.com/job/http-7xx-jersey/)

## Custom statusses and tomcat

By default tomcat does not allow to set custom messages for statusses. To get tomcat to send the custom message you have to add a parameter at startup set -Dorg.apache.coyote.USE_CUSTOM_STATUS_MSG_IN_HEADER=true

## Changelog

* 1.1-SNAPSHOT 
	Implement issue 1 https://github.com/redlab/http-7xx-jersey/issues/1
* 1.0
	Initial version
