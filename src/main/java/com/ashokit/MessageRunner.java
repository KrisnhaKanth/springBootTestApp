package com.ashokit;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {
	 private static Logger log = LoggerFactory.getLogger(MessageRunner.class);

	@Override
	public void run(String... args) throws Exception {
		int a =10;
		log.info("started");
		
		System.out.println("WLCOME TO SPRING BOOTAPP");
		System.out.println("hello git");
		log.info("end");

		// TODO Auto-generated method stub

	}

}
