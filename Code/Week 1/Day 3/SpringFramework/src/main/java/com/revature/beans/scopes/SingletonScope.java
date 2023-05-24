package com.revature.beans.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
/*
When this bean is requested from the Spring container, if it has not been created, a new one will be made, otherwise the same instance is reused
 */
public class SingletonScope {
}
