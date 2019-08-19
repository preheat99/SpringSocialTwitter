package com.gfg.prabhat.SpringSocialTwitter.controller;

import com.gfg.prabhat.SpringSocialTwitter.model.User;
import com.gfg.prabhat.SpringSocialTwitter.service.SocialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import twitter4j.TwitterException;
import twitter4j.api.UsersResources;

import java.util.List;

@RestController  @Api(value = "Consume API",description = "Operations to Consume from Twitter and Codeforces")
public class SocialController {
    @Autowired
    SocialService socialService;

    @ApiOperation(value = "View codeforces handle info")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200,message = "Successful!!!"),
                    @ApiResponse(code = 404,message = "Unfound!!!")
            }
    )
    @GetMapping("/codeforces/{handle}")
    public User getUserInfo(@PathVariable String handle){
        User user=socialService.getUserInfo(handle);
        return user;
    }

    @ApiOperation(value = "View twitter timeline")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 401,message = "Not Authorized!!!")
            }
    )
    @GetMapping("/twitterTimeline")
    public List<String> getUserTimeline() throws TwitterException
    {
        return socialService.showTimeline();
    }

    @ApiOperation(value = "View twitter user info")
    @ApiResponses(
            value = @ApiResponse(code = 403,message = "Not Allowed!!!")
    )
    @GetMapping("/twitterUser")
    public UsersResources getTwitterUserInfo() throws TwitterException
    {
        return socialService.showUser();
    }
}
