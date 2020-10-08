package com.example.closetagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aLIvF8XKPXaW4NTEEU4weLf1ybSRWT84Se594dGS")
                .clientKey("wyOyTYeJPZiMakJm0Gy3MTIsbGkgusEfVDQatk3H")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
