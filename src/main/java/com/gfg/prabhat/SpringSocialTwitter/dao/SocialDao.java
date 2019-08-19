package com.gfg.prabhat.SpringSocialTwitter.dao;

import com.gfg.prabhat.SpringSocialTwitter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.api.UsersResources;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SocialDao {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    Twitter getTwitterInstance;

    public User getUserInfo(String handle){
        // RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("http://codeforces.com/api/user.info?handles="+handle, User.class);
        // userRepo.save(user);
        return user;
    }

    public List<String> getTimeLine() throws TwitterException {
        Twitter twitter = getTwitterInstance;
        return twitter.getHomeTimeline().stream().map(item -> item.getText()).collect(Collectors.toList());
    }

    public UsersResources getUser() throws TwitterException{
        Twitter twitter = getTwitterInstance;
        return twitter.users();
    }


}
