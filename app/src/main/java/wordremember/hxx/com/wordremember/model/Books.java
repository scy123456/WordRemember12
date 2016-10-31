package wordremember.hxx.com.wordremember.model;

/**
 * Created by Songcongying on 2016/10/27.
 * 书的添加时间，单词总数，是否读过，读了多少
 */

public class Books {

    /** 表名 */
    public static final String TABLE_NAME = "books_table";
    /** 英文单词名称 */
    public static final String BOOKNAME = "bookname";
    public static final String ADDTIME = "addtime";
    public static final String TOTALCOUNT = "totalcount";
    public static final String ISREAD = "isread";
    public static final String HAVAREADCOUNT = "havareadcount";

    private String bookName;
    //书本的添加时间
    private String addName;
    private int totalCount;
    private boolean isRead;
    private int haveReadCount;

    public Books(String bookName, String addName, int totalCount, boolean isRead, int haveReadCount) {
        this.bookName = bookName;
        this.addName = addName;
        this.totalCount = totalCount;
        this.isRead = isRead;
        this.haveReadCount = haveReadCount;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getHaveReadCount() {
        return haveReadCount;
    }

    public void setHaveReadCount(int haveReadCount) {
        this.haveReadCount = haveReadCount;
    }
}
