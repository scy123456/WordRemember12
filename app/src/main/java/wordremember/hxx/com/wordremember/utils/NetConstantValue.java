package wordremember.hxx.com.wordremember.utils;

/**
 * Created by Songcongying on 2016/2/25
 */
public class NetConstantValue {

    /**
     * 请求KEY
     */
    public final static String REQUEST_KEY = "key=IXCfWBE5dRfyuIcFmhe2ANQ6VmoRZxRP";

    // Server
    public final static String SERVER = "http:....";


    /**
     *获取单词
     */
    public static String GETWORD= SERVER + "...";
    /**
     * 发送短信验证码
     */
    public static final String SEND_MESSAGE = SERVER + "...";

    /**
     * 检测手机号码
     */
    public static final String CHECK_PHONE_NUM = SERVER + "....";

    /**
     * 注册用户接口
     */
    public static final String REGIST_USERS = SERVER + "....";

    /**
     * 找回密码
     */
    public static final String RESET_PASSWORD = SERVER + "....";

    /**
     * 用户登录
     */
    public static final String LOGIN_USER = SERVER + "....";

    /**
     * 上传用户头像
     */
    public static final String EDIT_USERINFO_HEAD = SERVER + "...";

    /**
     * 编辑用户资料
     */
    public static final String EDIT_USERINFO = SERVER + ";;;";


    /**
     * 意见反馈
     */
    public final static String URL_USER_FEEDBACK = SERVER
            + "/userfeedback/add";

    /**
     * 查看用户资料
     */
    public final static String URL_USER_INFO = SERVER
            + "'''";


    /**
     * 检测更新
     */
    public final static String URL_UPDATE_APK = "http://call.iblooma.com:8080/blooma-phonecall/appversion/padcheck";
}
