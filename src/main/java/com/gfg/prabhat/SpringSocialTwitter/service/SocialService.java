package com.gfg.prabhat.SpringSocialTwitter.service;

import com.gfg.prabhat.SpringSocialTwitter.dao.SocialDao;
import com.gfg.prabhat.SpringSocialTwitter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.TwitterException;
import twitter4j.api.UsersResources;

import java.util.List;

@Service
public class SocialService {
    @Autowired
    SocialDao socialDao;

    public User getUserInfo(String handle){
        return socialDao.getUserInfo(handle);
    }

    public List<String> showTimeline() throws TwitterException
    {
        return socialDao.getTimeLine();
    }

    public UsersResources showUser() throws TwitterException
    {
        return socialDao.getUser();
    }
}
