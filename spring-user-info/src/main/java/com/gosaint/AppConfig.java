package com.gosaint;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@ComponentScan("com.gosaint.service")
@Configuration
@Component   //这个注解主要是为了检测能否添加注解
public class AppConfig {

	String name="caozg";

 
}