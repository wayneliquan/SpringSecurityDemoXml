package com.wayne.security;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by zhanliquan on 17-8-6.
 * Description: 系统初始化的类(不用在web.xml中配置DispatcherServlet)
 */
public class WebAppInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        System.out.println("-------------wayne");
        System.out.println(WebAppInitializer.class.getClassLoader().getResource("applicationContext.xml").getFile());
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("classpath:applicationContext.xml"); //配置spring的配置文件路径, 在resource下(WEB-INF下也可以)
        return context;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}
