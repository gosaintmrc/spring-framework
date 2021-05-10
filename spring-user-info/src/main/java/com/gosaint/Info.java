package com.gosaint;

import com.gosaint.service.InstanceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Info {

	@Autowired

	public static void main(String[] args) {
		ApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(InstanceA.class));
	}
}
