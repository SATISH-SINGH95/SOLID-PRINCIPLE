package com.solidPrinciple.liskovSubstitutionPrinciple;

import com.solidPrinciple.liskovSubstitutionPrinciple.Features.PublicPhotosService;
import com.solidPrinciple.liskovSubstitutionPrinciple.Features.SocialMediaService;

public class InstagramService implements SocialMediaService, PublicPhotosService {
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
