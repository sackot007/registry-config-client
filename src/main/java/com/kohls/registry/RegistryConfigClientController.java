package com.kohls.registry;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class RegistryConfigClientController {

	private static final String template = "Hello, %s!";

	@Value("${local.slaveindex.dir:url123}")
	private String name;

	@RequestMapping("/")
	public String home() {
		return String.format(template, name);
	}

}