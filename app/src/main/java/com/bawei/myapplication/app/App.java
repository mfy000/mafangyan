package com.bawei.myapplication.app;

import android.app.Application;
import android.content.Context;

/**
 * description:
 * author: 马方岩
 * date: 2019/12/05 20:46:55
 * update: app$
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
