package com.social.application;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class LocalSocialApplication extends SocialApplication {

    public static void main(String[] args)
    {
        new LocalSocialApplication().configure(new SpringApplicationBuilder()).profiles("local-secret", "local-github").run(args);
    }
}
