package com.solidPrinciple.liskovSubstitutionPrinciple;

import com.solidPrinciple.liskovSubstitutionPrinciple.Features.GroupVideoCalls;
import com.solidPrinciple.liskovSubstitutionPrinciple.Features.SocialMediaService;

public class WhatsappService implements SocialMediaService, GroupVideoCalls {
    @Override
    public void groupVideoCall(String... users) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void chatWithFriends() {

    }
}
