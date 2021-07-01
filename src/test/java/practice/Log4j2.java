package practice;

import org.apache.logging.log4j.*;



/**
When to use log4j methods based on given scenarios
*******When to Use log. Error, debug and info methods in Selenium test cases*****************************

Use log. Error() to log when elements are not displayed in the page or if any validations fail

Use Log. Debug() >> When each Selenium action is performed like click, SendKeys, getText()

Use log.info() >> When operation is successfully completed ex: After loading page, or after any successful validations

It’s just counterpart to log. Error()

*****************sample Testcase is found at the end of this section***********************************
 *
 *Configuring the Log4j2.xml to project
 *1. Create a folder at project level Like Log4j2(we can give any name)
 *2. Create a xml file inside it(like Log4j2.xml file)
 *3. Right click on the project > Build Path > Configure Build Path > Source > Add Folder > select above created folder(Log4j2) then add. 
 *
 *In the xml if we set Root level as "error" only logs will display ex log.error(),log.fatal() >> <Root level="error">
 *In the xml if we set Root level as "trace" then all the logs will display ex log.info(), log.debug(),log.error(),log.fatal() >> <Root level="trace">
 *
 *this info inside the xml file will tells to display only error logs for the class "Demo" which is inside the "practice" package
 *additivity="false" tells to not to repeat the logs 
 *additivity="true" tells to repeat the logs 
 *
 *<Logger name="practice.Demo" level="error" additivity="false">
      <AppenderRef ref="Console"/>
    </Logger>
 *
 *
 *for maven we have to tell where is log4j xml located
 *<resource>
        <directory>src/main/resources</directory>
        <filtering>true</filtering>
      </resource>
 */


public class Log4j2 {
	private static Logger log=LogManager.getLogger(Log4j2.class.getName());

	public static void main(String[] args) {
		log.debug("This is debug");
		log.info("This is info");
		log.error("This is error");
		log.fatal("This is fatal");
		log.info("This is info1");

	}

}
