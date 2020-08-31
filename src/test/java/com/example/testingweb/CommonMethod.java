package com.example.testingweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonMethod {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void assertResponseIsCorrect(ResponseEntity<String> response) {
        logger.info("assert response pass with http status 200");
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
    }

    public void assertResponseIsFail(ResponseEntity<String> response, HttpStatus httpStatus) {
        logger.info("assert response fails with http status {}", httpStatus);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(httpStatus);
        assertThat(response.getHeaders().getContentType().includes(MediaType.APPLICATION_JSON));
    }

    public UriComponentsBuilder getUriComponentBuilder() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl)
                .queryParam("q", ProjectConstants.query_value)
                .queryParam("api_key", ProjectConstants.apiKey_value);
        logger.info("building base url {}", builder.toUriString());
        return builder;
    }
}
