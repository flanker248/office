
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;


class SampleFilter extends Filter<ILoggingEvent>{

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (event.getMessage().contains("sample")) {
            println "********** MAYDAY , I AM HIT ********** "
            println "********** MAYDAY , I AM HIT ********** "
            return FilterReply.ACCEPT;
        } else {
            println "**********  NEUTRAL ********** "
            println "**********  NEUTRAL ********** "
            return FilterReply.NEUTRAL;
//            return FilterReply.DENY;
        }
    }


}
