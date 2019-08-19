package com.gfg.prabhat.SpringSocialTwitter.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contribution",
        "lastOnlineTimeSeconds",
        "friendOfCount",
        "titlePhoto",
        "handle",
        "avatar",
        "registrationTimeSeconds"
})
//@RedisHash("Result")
public class Result {

    @JsonProperty("contribution")
    private Integer contribution;
    @JsonProperty("lastOnlineTimeSeconds")
    private Integer lastOnlineTimeSeconds;
    @JsonProperty("friendOfCount")
    private Integer friendOfCount;
    @JsonProperty("titlePhoto")
    private String titlePhoto;
    @JsonProperty("handle")
    // @Id
    private String handle;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("registrationTimeSeconds")
    private Integer registrationTimeSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contribution")
    public Integer getContribution() {
        return contribution;
    }

    @JsonProperty("contribution")
    public void setContribution(Integer contribution) {
        this.contribution = contribution;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public Integer getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public void setLastOnlineTimeSeconds(Integer lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    @JsonProperty("friendOfCount")
    public Integer getFriendOfCount() {
        return friendOfCount;
    }

    @JsonProperty("friendOfCount")
    public void setFriendOfCount(Integer friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    @JsonProperty("titlePhoto")
    public String getTitlePhoto() {
        return titlePhoto;
    }

    @JsonProperty("titlePhoto")
    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("registrationTimeSeconds")
    public Integer getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    @JsonProperty("registrationTimeSeconds")
    public void setRegistrationTimeSeconds(Integer registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
