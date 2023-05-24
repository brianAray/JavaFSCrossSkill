package com.revature.beans.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
/*
This indicates that the bean will be created for each HTTP request in a web application
 */
public class RequestScope {
}
