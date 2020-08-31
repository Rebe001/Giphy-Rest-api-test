package com.example.testingweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DestructiveTest extends CommonMethod{

    Logger logger = LogManager.getLogger(this.getClass());
    ResponseEntity<String> response;
    UriComponentsBuilder builder = getUriComponentBuilder();

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void UnsupportedPOSTForEndpointShouldFail() {
        logger.info("unsupported POST for endpoint should fail");
        response = this.restTemplate.postForEntity(builder.toUriString(),"",
                String.class);
        assertResponseIsFail(response, HttpStatus.FORBIDDEN);
        assertThat(response.getBody()).contains("You cannot consume this service");
    }

    @Test
    public void UnsupportedPUTForEndpointShouldFail() {
        logger.info("unsupported PUT for endpoint should fail");
        response = this.restTemplate.exchange(builder.toUriString(), HttpMethod.PUT, new HttpEntity<>(""), String.class);
        assertResponseIsFail(response, HttpStatus.FORBIDDEN);
        assertThat(response.getBody()).contains("You cannot consume this service");
    }

    @Test
    public void UnsupportedDeleteForEndpointShouldFail() {
        logger.info("unsupported Delete for endpoint should fail");
        ResponseEntity<String> response = this.restTemplate.exchange(builder.toUriString(), HttpMethod.DELETE, new HttpEntity<>(""), String.class);
        assertResponseIsFail(response, HttpStatus.FORBIDDEN);
        assertThat(response.getBody()).contains("You cannot consume this service");
    }

}
