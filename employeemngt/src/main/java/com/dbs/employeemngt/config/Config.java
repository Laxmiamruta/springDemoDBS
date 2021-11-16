package com.dbs.employeemngt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring application related all objects that are commonly required 
//will be declared here.
//we will provide the base package name & it will help spring to
//create other objects for service, repository etc.
@Configuration
@ComponentScan(basePackages = "com.dbs.employeemngt")
public class Config {

}
