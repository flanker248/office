import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;



class AnotherFilter  extends Filter<ILoggingEvent>{

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (event.getMessage().contains("something serious")) {
            println "********** SCRAMBLE SCRAMBLE SCRAMBLE********** "
            println "********** SCRAMBLE SCRAMBLE SCRAMBLE********** "
            return FilterReply.ACCEPT;
        } else {
            println "**********  ANOTHER ONE GOING FINE********** "
            println "**********  ANOTHER ONE GOING FINE********** "
            return FilterReply.NEUTRAL;
        }
    }

}
