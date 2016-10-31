package wordremember.hxx.com.wordremember.model;

/**
 * Created by Songcongying on 2016/10/27.
 * 平板的设置，重复发音次数，时间间隔，提醒时间，发音选项
 */

public class Setting {

    /** 表名 */
    public static final String TABLE_NAME = "setting_table";
    public static final String REPEATETIME = "repeatetime";
    public static final String DELAYTIME = "delaytime";
    public static final String REMINDTIME = "remindtime";
    public static final String ACCENT = "accent";

    private int repeateTime;
    //时间间隔
    private int delayTime;
    private Long remindTime;
    //发音选项，英式发音0，美式发音1
    private int accent;

    public Setting(int repeateTime, int delayTime, Long remindTime, int accent) {
        this.repeateTime = repeateTime;
        this.delayTime = delayTime;
        this.remindTime = remindTime;
        this.accent = accent;
    }

    public int getRepeateTime() {
        return repeateTime;
    }

    public void setRepeateTime(int repeateTime) {
        this.repeateTime = repeateTime;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public Long getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(Long remindTime) {
        this.remindTime = remindTime;
    }

    public int getAccent() {
        return accent;
    }

    public void setAccent(int accent) {
        this.accent = accent;
    }
}
