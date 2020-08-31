package com.example.testingweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SmokeTest extends CommonMethod{

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private TestRestTemplate restTemplate;

    UriComponentsBuilder builder = getUriComponentBuilder();

    @Test
    public void validApiKeyQueryParameterShouldPass(){
        logger.info("assert valid api key and valid query parameter should pass");
        assertResponseIsCorrect(this.restTemplate.getForEntity(builder.toUriString(),
                String.class));
    }
}
