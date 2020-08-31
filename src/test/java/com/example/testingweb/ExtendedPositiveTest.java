package com.example.testingweb;

import com.example.testingweb.json.Datum;
import com.example.testingweb.json.JsonResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ExtendedPositiveTest extends CommonMethod {

    ObjectMapper objectMapper = new ObjectMapper();
    ResponseEntity<String> response;
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private TestRestTemplate restTemplate;

    UriComponentsBuilder builder = getUriComponentBuilder();

    @Test
    public void validLimitParamShouldPass() throws JsonProcessingException {
        logger.info("assert valid limit param should pass");
        builder.queryParam(ProjectConstants.limit, 1);
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(1);
    }

    @Test
    public void validDefaultLimitParamIsExpected() throws JsonProcessingException {
        logger.info("assert default limit param is expected");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(25);
    }

    @Test
    public void validOffsetParamShouldPass() throws Exception {
        logger.info("assert offset limit param should pass");
        builder.queryParam(ProjectConstants.offset, 1);
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getOffset()).isEqualTo(1);
    }

    @Test
    public void validDefaultOffsetParamIsExpected() throws Exception {
        logger.info("assert offset default param is expected");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getOffset()).isEqualTo(0);
    }

    @Test
    public void validRatingParamShouldPass() throws JsonProcessingException {
        logger.info("assert valid rating param should pass");
        builder.queryParam(ProjectConstants.rating, "pg");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        for (Datum datum : jsonResponse.getData())
            assertThat(datum.getRating()).isEqualTo("pg");
    }

    @Test
    public void validLangParamShouldPass() throws JsonProcessingException {
        logger.info("assert valid lang param should pass");
        builder.queryParam(ProjectConstants.lang, "es");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        JsonResponse jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        for (Datum datum : jsonResponse.getData())
            assertThat(datum.getTitle()).isEqualTo("es");
    }

    @Test
    public void validRandomIdParamShouldPass() {
        logger.info("assert valid random id param should pass");
        builder.queryParam(ProjectConstants.random_id, "1234");
        ResponseEntity<String> response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
    }
}
