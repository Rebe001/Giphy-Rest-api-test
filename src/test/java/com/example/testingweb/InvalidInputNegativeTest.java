package com.example.testingweb;

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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class InvalidInputNegativeTest extends CommonMethod{

    ObjectMapper objectMapper = new ObjectMapper();
    private final Logger logger = LogManager.getLogger(this.getClass());
    ResponseEntity<String> response;
    UriComponentsBuilder builder = getUriComponentBuilder();
    JsonResponse jsonResponse;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void assertMissingApiKeyParamShouldFail(){
        logger.info("assert missing api key param should fail");
        builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl).queryParam(ProjectConstants.query, ProjectConstants.query_value);
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsFail(response, HttpStatus.UNAUTHORIZED);
        assertThat(response.getBody()).contains("No API key found in request");
    }

    @Test
    public void assertEmptyApiKeyParamShouldFail() {
        logger.info("assert empty api key param should fail");
        builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl)
                .queryParam(ProjectConstants.query, ProjectConstants.query_value)
                .queryParam(ProjectConstants.apiKey, "");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsFail(response, HttpStatus.FORBIDDEN);
        assertThat(response.getBody()).contains("Invalid authentication credentials");
    }

    @Test
    public void assertWrongApiKeyParamShouldFail() {
        logger.info("assert wrong api key param should fail");
        builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl)
                .queryParam(ProjectConstants.query, ProjectConstants.query_value)
                .queryParam(ProjectConstants.apiKey, "wrong");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsFail(response, HttpStatus.FORBIDDEN);
        assertThat(response.getBody()).contains("Invalid authentication credentials");
    }

    @Test
    public void assertMissingQueryParamShouldHaveZeroCount() throws JsonProcessingException {
        logger.info("assert missing query param should have zero count");
        builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl)
                .queryParam(ProjectConstants.apiKey, ProjectConstants.apiKey_value);
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(0);
    }

    @Test
    public void assertEmptyQueryParamShouldZeroCount() throws JsonProcessingException {
        logger.info("assert empty query param should have zero count");
        builder = UriComponentsBuilder.fromHttpUrl(ProjectConstants.baseUrl)
                .queryParam(ProjectConstants.apiKey, ProjectConstants.apiKey_value)
                .queryParam(ProjectConstants.query, "");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(0);
    }

    @Test
    public void assertNegativeLimitParamShouldHaveZeroCount() throws JsonProcessingException {
        logger.info("assert negative limit param should have zero count");
        builder = builder.queryParam(ProjectConstants.limit, -1);
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(0);
    }

    @Test
    public void negativeOffsetParamShouldHaveZeroOffset() throws JsonProcessingException {
        logger.info("assert negative offset param should have zero offset");
        builder = builder.queryParam(ProjectConstants.offset, -1);
        ResponseEntity<String> response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getOffset()).isEqualTo(0);
    }

    @Test
    public void invalidRatingParamShouldHaveZeroCount() throws JsonProcessingException {
        logger.info("assert invalid rating param should have zero count");
        builder = builder.queryParam(ProjectConstants.rating, "en");
        response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(0);
    }

    @Test
    public void invalidLangParamShouldHaveZeroCount() throws Exception {
        logger.info("assert invalid lang param should have zero count");
        builder = builder.queryParam(ProjectConstants.lang, "no");
        ResponseEntity<String> response = this.restTemplate.getForEntity(builder.toUriString(),
                String.class);
        assertResponseIsCorrect(response);
        jsonResponse = objectMapper.readValue(response.getBody(), JsonResponse.class);
        assertThat(jsonResponse.getPagination().getCount()).isEqualTo(0);
    }
}
