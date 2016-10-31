package wordremember.hxx.com.wordremember.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;

public class CommonUtils {
	
	public static final String ALLOWED_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()";
	
	public static final int WIFI_STATE = 1;
    public static final int MONET_STATE = 2;
    public static final int NO_NET_STATE = -1;
    
    /**
     * 获取application中指定的meta-data
     *
     * @return 如果没有获取成功(没有对应值，或者异常)，则返回值为空
     */
    public static String getAppMetaData(Context ctx, String key) {
        if (ctx == null || TextUtils.isEmpty(key)) {
            return null;
        }
        String resultData = null;
        try {
            PackageManager packageManager = ctx.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(ctx.getPackageName(), PackageManager.GET_META_DATA);
                if (applicationInfo != null) {
                    if (applicationInfo.metaData != null) {
                        resultData = applicationInfo.metaData.getString(key);
                    }
                }

            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return resultData;
    }
    
    /**
     * 转码（两次）
     *
     * @param input
     * @return
     */
    public static String encodeURIComponent(String input) {
        if (input == null || "".equals(input))
            return input;
        int l = input.length();
        StringBuilder o = new StringBuilder(l * 3);
        try {
            for (int i = 0; i < l; i++) {
                String e = input.substring(i, i + 1);
                if (ALLOWED_CHARS.indexOf(e) == -1) {
                    byte[] b = e.getBytes("utf-8");
                    o.append(getHex(b));
                    continue;
                }
                o.append(e);
            }
            return o.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return input;
    }
    
    private static String getHex(byte buf[]) {
        StringBuilder o = new StringBuilder(buf.length * 3);
        for (byte element : buf) {
            int n = element & 0xff;
            o.append("%");
            if (n < 0x10)
                o.append("0");
            o.append(Long.toString(n, 16).toUpperCase());
        }
        return o.toString();
    }
    
    /**
     * 加密字符串
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String encrypt(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return byte2hex(md5.digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String byte2hex(byte b[]) {
        String hs = "";
        String stmp;
        for (int n = 0; n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0xff);
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
            if (n < b.length - 1)
                hs = (new StringBuffer(String.valueOf(hs))).toString();
        }

        return hs.toUpperCase();
    }
    
	/**
     * 获取网络状态
     * 
     * @param context
     * @return -1网络不可用 1为WiFi连接 2为移动网络连接
     */
    public static int getNetwrokFlg(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager != null) {
            NetworkInfo info = manager.getActiveNetworkInfo();
            if (info != null) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return WIFI_STATE;
                } else {
                    return MONET_STATE;
                }
            }
        }
        return NO_NET_STATE;
    }
    
    /**
     * 获取pad的mac地址
     * 
     * @param context
     * @return
     */
    public static String getPadMac(Context context) {
//        String s;
//        WifiManager wm = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
//        WifiInfo info = wm.getConnectionInfo();
//        s = info.getMacAddress();
//        if (TextUtils.isEmpty(s)) {
//            return s;
//        }
//        return s.replace(":", "");
        return "";
    }
    
    /**获取手机型号和版本号
     * @return
     */
    public static String getPhoneType(){
    	return Build.MODEL+Build.VERSION.RELEASE;
    }
    
    /**
     * 获取当前版本号
     *
     * @param context
     * @return
     */
    public static String getVersion(Context context) {
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(),
                    0);
            return info.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
