package wordremember.hxx.com.wordremember.model;

import static android.R.attr.data;

/**
 * Created by Songcongying on 2016/10/27.
 * 每日学习计划是否达标
 */

public class Process {

    /** 表名 */
    public static final String TABLE_NAME = "process_table";
    /**日期 */
    public static final String DATA = "data";
    public static final String ISCOMPLETE = "iscomplete";
    public static final String ISSTUDY = "isstudy";

    private int data;
    private boolean isComplete;
    private boolean isStudy;

    public Process(int data, boolean isComplete, boolean isStudy) {
        this.data = data;
        this.isComplete = isComplete;
        this.isStudy = isStudy;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
        isStudy = study;
    }
}
