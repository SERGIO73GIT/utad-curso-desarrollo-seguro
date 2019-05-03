package com.utad.curso.desarrollo.seguro.config.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@Configuration
@EnableOAuth2Client
public class GoogleOpenIdConnectConfig {

    @Value("385744396772-18ntcsgs74g55h0a9p54un1s7crhrjlu.apps.googleusercontent.com")
    private String clientId;

    @Value("1r_WqxqvfbQA1ZPfS7D7pkym")
    private String clientSecret;

    @Value("https://accounts.google.com/o/oauth2/auth")
    private String userAuthorizationUri;

    @Value("https://www.googleapis.com/oauth2/v3/token")
    private String accessTokenUri;

    @Value("https://curso-desarrollo-seguro.com/oauth2-callback")
    private String redirectUri;

    @Bean
    public OAuth2ProtectedResourceDetails googleOpenId() {
        final AuthorizationCodeResourceDetails details = new AuthorizationCodeResourceDetails();
        details.setClientId(clientId);
        details.setClientSecret(clientSecret);
        details.setUserAuthorizationUri(userAuthorizationUri);
        details.setAccessTokenUri(accessTokenUri);
        details.setScope(Arrays.asList("openid", "email"));
        details.setPreEstablishedRedirectUri(redirectUri);
        details.setUseCurrentUri(false);
        return details;
    }

    @Bean
    public OAuth2RestTemplate googleOpenIdTemplate(
            OAuth2ClientContext clientContext) {
        return new OAuth2RestTemplate(googleOpenId(), clientContext);
    }

}
