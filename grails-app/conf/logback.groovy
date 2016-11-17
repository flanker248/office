import ch.qos.logback.classic.boolex.JaninoEventEvaluator
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.LevelFilter
import ch.qos.logback.classic.turbo.MDCFilter
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.filter.EvaluatorFilter
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy
import ch.qos.logback.core.spi.LifeCycle
import ch.qos.logback.core.status.OnConsoleStatusListener
import grails.util.BuildSettings
import grails.util.Environment
import logbackdummy.TestService

import java.util.regex.Matcher

import static ch.qos.logback.core.spi.FilterReply.ACCEPT
import static ch.qos.logback.core.spi.FilterReply.DENY
import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.core.spi.FilterReply.NEUTRAL
import java.util.regex.Pattern;
import SampleFilter

import java.nio.charset.Charset

// See http://logback.qos.ch/manual/groovy.html for details on configuration

//turboFilter(MDCFilter) {
//    MDCKey = "username"
//    value = "chirag"
//    onMatch = ACCEPT
//}
//
//
//appender('STDOUT', ConsoleAppender) {
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %d%t [%thread] %logger - %msg%n"
//
//    }
//}
//appender('STDOUT', ConsoleAppender) {
//    filter(LevelFilter) {
//        level = INFO
//        onMatch = ACCEPT
//        onMismatch = DENY
//    }
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %d%t [%thread] %logger - %msg%n"
//
//    }
//}

//appender("STDOUT", ConsoleAppender) {
//    filter(SampleFilter)
//    filter(AnotherFilter)
//    encoder(PatternLayoutEncoder) {
//        pattern = "%-4relative [%thread] %-5level %logger - %msg%n"
//    }
//}
//appender("ROLLING", RollingFileAppender) {
//    encoder(PatternLayoutEncoder) {
//        pattern = "%d %level %thread %mdc %logger - %m%n"
//    }
//    rollingPolicy(TimeBasedRollingPolicy) {
//        FileNamePattern = "/home/yogesh/hangar/log/yakap-%d{yyyy-MM-HH-mm}.txt"
//        maxHistory = 30
//        totalSizeCap = "3GB"
//    }
//}
//turboFilter(MDCFilter) {
//    MDCKey = "username"
//    value = "chirag"
//    onMatch = ACCEPT
//}
//
//appender('STDOUT', ConsoleAppender) {
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %d%t [%thread] %logger - %msg%n"
//
//    }
//}

appender('STDOUT', ConsoleAppender) {
    withJansi = true
    encoder(PatternLayoutEncoder) {
        pattern = "%blue(%-5level) %contextName %boldRed(%logger{35}) - %msg %n"

    }
}

//appender("FILE_STACKTRACE", FileAppender) {
//    file = "/home/yogesh/hangar/yakap.log"
//    append = true
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %logger - %msg%n"
//    }
//}

//appender("STDOUT", ConsoleAppender) {
//    filter(LevelFilter) {
//        level = INFO
//        onMatch = ACCEPT
//        onMismatch = DENY
//    }
//    encoder(PatternLayoutEncoder) {
//        pattern = "%-4relative [%thread] %-5level %logger{30} - %msg%n"
//    }
//}

//appender("ROLLING", RollingFileAppender) {
//    encoder(PatternLayoutEncoder) {
//        pattern = "%d %level %thread %mdc %logger - %m%n"
//    }
//    rollingPolicy(TimeBasedRollingPolicy) {
//        FileNamePattern = "/home/yogesh/hangar/log/yakap-%d{yyyy-MM-HH-mms-s}.txt"
//        maxHistory = 3
//        totalSizeCap = "1GB"
//    }
//}

//appender('STDOUT', ConsoleAppender) {
//    filter(LevelFilter) {
//        level = INFO
//        onMatch = ACCEPT
//        onMismatch = DENY
//    }
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %d%t [%thread] %logger - %msg%n"
//
//    }
//}

//conversionRule 'clr', org.springframework.boot.logging.logback.ColorConverter
//conversionRule 'wex', org.springframework.boot.logging.logback.WhitespaceThrowableProxyConverter

//appender('STDOUT', ConsoleAppender) {
//    encoder(PatternLayoutEncoder) {
//        charset = Charset.forName('UTF-8')
//        pattern =
//                '%clr(%d{yyyy-MM-dd HH:mm:ss.SSS}){faint} ' + // Date
//                        '%clr(%5p) ' + // Log level
//                        '%clr(%property{PID}){magenta} ' + // PID
//                        '%clr(---){faint} %clr([%15.15t]){faint} ' + // Thread
//                        '%clr(%-40.40logger{39}){cyan} %clr(:){faint} ' + // Logger
//                        '%m%n%wex' // Message
//    }
//}

//appender("FILE_STACKTRACE", FileAppender) {
//    file = "/home/yogesh/hangar/stacktrace.log"
//    append = true
//    encoder(PatternLayoutEncoder) {
//        pattern = "%level %logger - %msg%n"
//    }
//}

//root(ERROR, ['STDOUT','ROLLING'])

//root(ERROR, ['STDOUT'])
root(ERROR, ['STDOUT'])
root(INFO, ['STDOUT'])
//logger('grails.app.controllers', ERROR, ['STDOUT'], true)
//logger('grails.app.controllers', INFO, ['FILE'], true)

//logger 'grails.app.controllers', INFO, ['STDOUT']
//logger 'grails.app.controllers.mrhaki.grails.SampleController', DEBUG, ['STDOUT']
logger 'grails.app.services', ERROR, ['FILE_STACKTRACE','STDOUT']
//chirag('grails.app.controllers', INFO, ['STDOUT'], true)

//def targetDir = BuildSettings.TARGET_DIR
//if (Environment.isDevelopmentMode() && targetDir) {
//    println "*************************************************** CHECKING ***************************************************"
//    appender("FULL_STACKTRACE", FileAppender) {
//        file = "/home/yogesh/hangar/stacktrace.log"
//        append = true
//        encoder(PatternLayoutEncoder) {
//            pattern = "%level %logger - %msg%n"
//        }
//    }
////    root(INFO, ['FULL_STACKTRACE'])
//    logger("StackTrace", ERROR, ['FULL_STACKTRACE'], false)
//}
