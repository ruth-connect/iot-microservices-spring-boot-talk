package com.connect_group.iot_microservices_spring_boot_talk.thymeleaf;

import org.thymeleaf.dialect.AbstractDialect;

public class IotMicroservicesSpringBootTalkDialect extends AbstractDialect {

	@Override
	public String getPrefix() {
		return "demo";
	}
	
	@Override
	public boolean isLenient() {
		return false;
	}
}
