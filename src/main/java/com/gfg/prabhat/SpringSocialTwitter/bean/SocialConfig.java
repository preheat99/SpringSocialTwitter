package com.gfg.prabhat.SpringSocialTwitter.bean;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Configuration
public class SocialConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("0KGkY5nWe6KqJ3dINHGPLPMCj")
                .setOAuthConsumerSecret("OawAh4cBEZ1KpyeMbhRw9i2uaNiIktHXuxwqbZ3tarzt9HCQ1R")
                .setOAuthAccessToken("2731420428-66H07JXWjY15Ta3i23q4xQLXRb0IgWG5NQDhnxj")
                .setOAuthAccessTokenSecret("Sa12ZnYHTPoZFl0N2fi6VZfKLoTRMoEPu5UpFvYXtqWzL");
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }
}
