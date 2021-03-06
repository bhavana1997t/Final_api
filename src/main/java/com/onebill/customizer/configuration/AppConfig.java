package com.onebill.customizer.configuration;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = "com.onebill.customizer")
@EnableWebMvc
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public LocalEntityManagerFactoryBean getEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
		factory.setPersistenceUnitName("CRM");
		return factory;
	}

	@Bean
	public JpaTransactionManager getTransactionManagerBean() {
		JpaTransactionManager trans = new JpaTransactionManager();
		trans.setEntityManagerFactory(getEntityManagerFactoryBean().getObject());
		return trans;
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}


	
}