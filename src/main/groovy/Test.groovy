import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;


class Test extends Filter<ILoggingEvent>{
        @Override
        public FilterReply decide(ILoggingEvent event) {
            if (event.getMessage().contains("sample")) {
                return FilterReply.ACCEPT;
            } else {
                return FilterReply.NEUTRAL;
            }
        }
}