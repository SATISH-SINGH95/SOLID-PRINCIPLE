package com.solidPrinciple.liskovSubstitutionPrinciple;

import com.solidPrinciple.liskovSubstitutionPrinciple.Features.GroupVideoCalls;
import com.solidPrinciple.liskovSubstitutionPrinciple.Features.PublicPhotosService;
import com.solidPrinciple.liskovSubstitutionPrinciple.Features.SocialMediaService;

public class FacebookService implements SocialMediaService, GroupVideoCalls, PublicPhotosService {
    @Override
    public void groupVideoCall(String... users) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void publishPosts() {

    }

    @Override
    public void chatWithFriends() {

    }
}
