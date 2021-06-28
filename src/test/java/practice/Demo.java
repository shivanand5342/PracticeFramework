package practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger log=LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {
		log.debug("This is debug");
		log.info("This is info");
		log.error("This is error");
		log.fatal("This is fatal");
	
	}
}
