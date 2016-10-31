package wordremember.hxx.com.wordremember.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import wordremember.hxx.com.wordremember.model.Accout;
import wordremember.hxx.com.wordremember.model.Books;
import wordremember.hxx.com.wordremember.model.Plan;
import wordremember.hxx.com.wordremember.model.Process;
import wordremember.hxx.com.wordremember.model.Setting;
import wordremember.hxx.com.wordremember.model.Word;

/**
 * Created by Administrator on 2016/10/24.
 */
public class DBHelper extends SQLiteOpenHelper {

    /**
     * 数据库名称
     */
    private static String DATABASE_NAME = "word_remember.db";
    public static final String DATA_BASE_AUTHORITY = "com.haixiaoxing.database";
    public static String WORD_DB_URL = "content://" + DATA_BASE_AUTHORITY + "/";

    /**
     * 数据库版本号
     */
    public static int VERSION_CODE = 1;
    private static DBHelper mSingleInstance;
    private Context mContext;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_CODE);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + Word.TABLE_NAME + " (_id INTEGER PRiMARY KEY AUTOINCREMENT,"
                        + " " + Word.ENGLISH_WORD + " TEXT,"
                        + " " + Word.PHONETIC + " TEXT,"
                        + " " + Word.TRANSLATION + " TEXT,"
                        + " " + Word.RADIO + " TEXT,"
                        + " " + Word.PICTURE + " TEXT,"
                        + " " + Word.SEPARATE + " TEXT,"
                        + " " + Word.IMAGE + " TEXT,"
                        + " " + Word.SHORTSENTANCE + " TEXT,"
                        + " " + Word.SENTANCE + " TEXT,"
                        + " " + Word.ISHAVEREAD + " TEXT,"
                        + " " + Word.ISTRUE + " TEXT,"
                        + " " + Word.WHICHDAY + " TEXT,"
                        + " " + Word.ISJIEDUANTEST + " TEXT,"
                        + " " + Word.ISDAYCE + " TEXT);"
        );
        db.execSQL(
                "CREATE TABLE " + Accout.TABLE_NAME + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,"

                        + " " + Accout.NAME  + " TEXT,"
                        + " " + Accout.PHOTO + " TEXT,"
                        + " " + Accout.GENDER + " INTEGER,"
                        + " " + Accout.PHONENUMBER + " INTEGER,"
                        + " " + Accout.PWD + " TEXT,"
                        + " " + Accout.LOCATION + " TEXT,"
                        + " " + Accout.SCHOOL + " TEXT,"
                        + " " + Accout.GRADE + " TEXT,"
                        + " " + Accout.CLASSNAME + " TEXT,"
                        + " " + Accout.BIRTHDAY + " TEXT);"
        );
        db.execSQL(
                "CREATE TABLE " + Books.TABLE_NAME + " (_id INTEGER PRiMARY KEY AUTOINCREMENT,"
                        + " " + Books.BOOKNAME  + " TEXT,"
                        + " " + Books.ADDTIME + " TEXT,"
                        + " " + Books.TOTALCOUNT + " INTEGER,"
                        + " " + Books.ISREAD + " BOOLEAN,"
                        + " " + Books.HAVAREADCOUNT + " INTEGER);"
        );
        db.execSQL(
                "CREATE TABLE " + Plan.TABLE_NAME + " (_id INTEGER PRiMARY KEY AUTOINCREMENT,"
                        + " " + Plan.PLANDAY + " INTEGER,"
                        + " " + Plan.PLANWORDCOUNT + " INTEGER,"
                        + " " + Plan.BOOKNAME + " TEXT,"
                        + " " + Plan.READCOUNT + " INTEGER,"
                        + " " + Plan.TOTALCOUNT + " INTEGER);"
        );
        db.execSQL(
                "CREATE TABLE " + Process.TABLE_NAME + " (_id INTEGER PRiMARY KEY AUTOINCREMENT,"
                        + " " + Process.DATA + " TEXT,"
                        + " " + Process.ISCOMPLETE + " BOOOLEAN,"
                        + " " + Process.ISSTUDY + " BOOLEAN);"
        );
        db.execSQL(
                "CREATE TABLE " + Setting.TABLE_NAME + " (_id INTEGER PRiMARY KEY AUTOINCREMENT,"
                        + " " + Setting.REPEATETIME + " INTEGER,"
                        + " " + Setting.DELAYTIME + " INTEGER,"
                        + " " + Setting.REMINDTIME + " INTEGER,"
                        + " " + Setting.ACCENT + " INTEGER);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + Word.TABLE_NAME);
        onCreate(db);
    }

    public synchronized static DBHelper getInstance(Context context) {
        if (mSingleInstance == null) {
            mSingleInstance = new DBHelper(context);
        }
        return mSingleInstance;
    }

}
