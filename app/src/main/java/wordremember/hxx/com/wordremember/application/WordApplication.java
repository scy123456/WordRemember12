package wordremember.hxx.com.wordremember.application;

import android.app.Application;
import android.content.SharedPreferences;

import wordremember.hxx.com.wordremember.utils.Config;

import static java.lang.Boolean.getBoolean;

/**
 * Created by Administrator on 2016/10/27.
 */

public class WordApplication extends Application {

    private SharedPreferences mShare = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mShare  = getSharedPreferences(Config.APP_NAME ,0) ;
    }
    public void putIsLogin(Boolean flag) {
        mShare.edit().putBoolean(Config.ISLOGIN ,flag) ;
    }

    public boolean getIsLogin() {
        return mShare.getBoolean(Config.ISLOGIN,false);
    }
}
