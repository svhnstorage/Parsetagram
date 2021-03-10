package com.example.parsetagram;

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
                .applicationId("aDohPnxo2vIApWUEozPcj2YmzGpa5ErNrZ8Kakrx")
                .clientKey("wu6ZnDk4Dv0PSwwsjYpiSVYcfhf7jW7kIDOTA9cl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
