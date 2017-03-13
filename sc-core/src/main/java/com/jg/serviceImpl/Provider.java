package com.jg.serviceImpl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Provider {
	private final static Logger log = LoggerFactory.getLogger(Provider.class);

	public static void main(String[] args) throws IOException {
		System.setProperty("spring.profiles.active", "production");
		    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
					"appcontext_service_aliyun.xml");

		if (context != null) {

			context.start();
			log.info("服务启动");
			showELEE();
			// System.in.read();
			boolean flag = true;
			while (flag) {
				log.debug("main thread sleep 10000");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			context.close();
			log.info("服务停止");
		} else {
			log.warn("配置出错");
		}
	}

	public static void showELEE() {
		StringBuffer buf = new StringBuffer();
		buf.append("\r\n EEEEEEEEE EEE       EEEEEEEEE EEEEEEEEE\r\n")
				.append(" EEEEEEEEE EEE       EEEEEEEEE EEEEEEEEE\r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEEEEEEE  EEE       EEEEEEEEE EEEEEEEEE \r\n")
				.append(" EEEEEEEE  EEE       EEEEEEEEE EEEEEEEEE \r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEE       EEE       EEE       EEE       \r\n")
				.append(" EEEEEEEEE EEEEEEEEE EEEEEEEEE EEEEEEEEEE\r\n")
				.append(" EEEEEEEEE EEEEEEEEE EEEEEEEEE EEEEEEEEEE\r\n\r\n");
		System.out.print(buf.toString());
	}


}
