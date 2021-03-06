package com.wetrack.config;

import com.wetrack.service.*;
import com.wetrack.service.authen.UserLoginService;
import com.wetrack.service.authen.UserLogoutService;
import com.wetrack.service.authen.UserTokenVerificationService;
import com.wetrack.service.user.*;
import com.wetrack.util.GsonJerseyProvider;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class WeTrackApplication extends ResourceConfig {

    public WeTrackApplication() {
        register(UserLoginService.class);
        register(UserLogoutService.class);
        register(UserTokenVerificationService.class);
        register(UserCreateService.class);
        register(UserGetService.class);
        register(UserPasswordUpdateService.class);
        register(UserUpdateService.class);
        register(LocationService.class);
        register(FriendService.class);
        register(ChatService.class);
        register(UserChatService.class);
        register(ChatMessageService.class);
        register(UserPortraitService.class);
        register(MultiPartFeature.class);
        register(GsonJerseyProvider.class);
    }

}
