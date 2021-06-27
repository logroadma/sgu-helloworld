package com.mtk.boot.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.web.AjaxServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Component
@EnableJms
@Configuration
public class GoldPriceConfigBean {


    @Value("${myTopic}")
    String myTopic;


    @Bean
    public Topic topic(){
        return new ActiveMQTopic(myTopic);
    }

    @Bean
    public ServletRegistrationBean ajaxServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new AjaxServlet());
        registration.setEnabled(true);
        registration.addUrlMappings("/amq/*");
        return registration;
    }

    @Bean
    public ServletContextInitializer initializer() {
        return new ServletContextInitializer() {

            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                servletContext.setInitParameter("org.apache.activemq.brokerURL",    "tcp://localhost:61616");
            }
        };
    }
}
