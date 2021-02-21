package com.example.pawsagram;

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
                .applicationId("NZh08Le0gjP69bhhpKDA3LESxmVeVLA61SH7ixHA")
                .clientKey("GuZgwZJU0rgAFW7zgu6LSAtk47tKew5T5kW4rP10")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
