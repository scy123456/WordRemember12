package wordremember.hxx.com.wordremember.model;

/**
 * Created by Songcongying on 2016/10/27.
 * user的计划信息，每天看多少单词，正在看哪本，多少词
 *
 */

public class Plan {

    /** 表名 */
    public static final String TABLE_NAME = "plan_table";
    /** 英文单词名称 */
    public static final String PLANDAY = "planday";
    public static final String PLANWORDCOUNT = "planwordcount";
    public static final String BOOKNAME = "bookname";
    public static final String READCOUNT = "readcount";
    public static final String TOTALCOUNT = "totalcount";

    private int planDay;
    //计划每天看多少单词
    private int planWordcount;
    //正在看的书名
    private String bookName;
    //已经看了多少单词
    private int readCount;
    //一共多少字
    private int totalCount;

    public Plan(int planDay, int planWordcount, String bookName, int readCount, int totalCount) {
        this.planDay = planDay;
        this.planWordcount = planWordcount;
        this.bookName = bookName;
        this.readCount = readCount;
        this.totalCount = totalCount;
    }

    public int getPlanDay() {
        return planDay;
    }

    public void setPlanDay(int planDay) {
        this.planDay = planDay;
    }

    public int getPlanWordcount() {
        return planWordcount;
    }

    public void setPlanWordcount(int planWordcount) {
        this.planWordcount = planWordcount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
