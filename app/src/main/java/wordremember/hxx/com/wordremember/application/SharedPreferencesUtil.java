package wordremember.hxx.com.wordremember.application;

import android.content.Context;
import android.content.SharedPreferences;

import wordremember.hxx.com.wordremember.utils.Config;

public class SharedPreferencesUtil {
    private SharedPreferences sp = null;
    private int mode = 0;

    public SharedPreferencesUtil(Context context) {
        sp = context.getSharedPreferences(Config.APP_NAME,mode);
    }

    /**
     * 使用示例
     */
    public void setIsDialogRemaind(boolean flag) {
        sp.edit().putBoolean(Config.ISLOGIN , flag).commit();
    }

}
