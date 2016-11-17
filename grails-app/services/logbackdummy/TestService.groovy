package logbackdummy

import grails.transaction.Transactional

@Transactional
class TestService {


    void yakap(){
        log.error("FROM SERVICE")
    }


}
