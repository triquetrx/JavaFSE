package com.controller;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class InternationalizationConfig extends WebMvcConfigurerAdapter {

//Create a SessionLocaleResolver object and set the default locale to English  return the SessionLocaleResolver object  
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		return slr;
	}

	// Create LocaleChangeInterceptor object and set the parameter name as language
	// and return the localeChangeInterceptor
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lc = new LocaleChangeInterceptor();
		lc.setParamName("language");
		return lc;

	}

	// register the LocaleChangeInterceptor
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());

	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		// TODO Auto-generated method stub
		ResourceBundleMessageSource rms = new ResourceBundleMessageSource();
		rms.setBasenames("messages", "messages_fr", "messages_de");
		return rms;
	}

	@Bean
	public LocalValidatorFactoryBean getValidation() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}

}