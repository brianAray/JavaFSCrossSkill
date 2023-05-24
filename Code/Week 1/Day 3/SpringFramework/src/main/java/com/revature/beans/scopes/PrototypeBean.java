package com.revature.beans.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
/*
Whenever this bean is requested from the Spring container, a new instance will be created
 */
public class PrototypeBean {

}
