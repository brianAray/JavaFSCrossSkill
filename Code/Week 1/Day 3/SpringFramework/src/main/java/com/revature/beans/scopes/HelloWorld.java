package com.revature.beans.scopes;


// Annotations
// @PostConstruct
// @PreDestroy

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Interfaces of InitializingBean and DisposableBean
public class HelloWorld implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean HelloWorld has been instantiated and this is the init() method being called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean HelloWorld has been destroyed and this is the destroy() method being called");
    }
}
