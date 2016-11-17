package logbackdummy

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory
import org.slf4j.MDC;
class PublicController {

    def testService

//    private static final Logger LOGGER  = LoggerFactory.getLogger( "com.app.logbackdummy" );
    def index() {


        MDC.put("username","nt")
//        log.info("*************************************** INFO *************************************** INFO ")
//        log.error("ERROR IS WORKING")
        log.error("ERROR IS WORKING")
        log.info("sample")

//        log.info("ONLY INFO IS WORKING")
//        log.info("INFO")
//        LOGGER.info("AFAF")

//        testService.yakap()

        render "<h1>HELLO</h1>"
    }
}
