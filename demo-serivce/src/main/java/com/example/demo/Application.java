package com.example.demo;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static java.lang.System.exit;

@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootApplication
public class Application  {

	/*@Bean
	public ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector());
		return tomcat;
	}

	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setPort(8082);
		return connector;
	}
	*//**
	 * 支持https的启动方式
	 * *//*
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}*/
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
		/*new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run(args);
		synchronized (Application.class) {
			while (true) {
				try {
					Application.class.wait();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}*/
	}
}
