package com.example


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ExampleTest extends Specification {
    
    @Autowired
    MicronautService micronautService
    
    void "context loads correctly"() {
        expect: 
        micronautService.random()
    }
    
}
