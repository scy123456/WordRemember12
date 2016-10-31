package wordremember.hxx.com.wordremember.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.widget.Switch;
import wordremember.hxx.com.wordremember.model.Accout;
import wordremember.hxx.com.wordremember.model.Books;
import wordremember.hxx.com.wordremember.model.Plan;
import wordremember.hxx.com.wordremember.model.Process;
import wordremember.hxx.com.wordremember.model.Setting;
import wordremember.hxx.com.wordremember.model.Word;

/**
 * Created by Songcongying on 2016/10/24.
 * 建立访问数据库的contentprovider
 */
public class WordContentProvider extends ContentProvider {

    private DBHelper mDBHelper;
    private Context mContext;

    public static final int WORD_CODE = 1;
    public static final int ACCOUNT_CODE = 2;
    public static final int BOOKS_CODE = 3;
    public static final int PLAN_CODE = 4;
    public static final int PROCESS_CODE = 5;
    public static final int SETTING_CODE = 6;

    public static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Word.TABLE_NAME, WORD_CODE);
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Accout.TABLE_NAME, ACCOUNT_CODE);
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Books.TABLE_NAME, BOOKS_CODE);
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Plan.TABLE_NAME, PLAN_CODE);
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Process.TABLE_NAME, PLAN_CODE);
        matcher.addURI(DBHelper.DATA_BASE_AUTHORITY, Setting.TABLE_NAME, SETTING_CODE);
    }

    @Override
    public boolean onCreate() {
        mContext = getContext();
        mDBHelper = DBHelper.getInstance(mContext);
        SQLiteDatabase db = mDBHelper.getWritableDatabase();
        db.close();
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projections, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = mDBHelper.getReadableDatabase();
        Cursor cursor = null;
        int matcherCode = matcher.match(uri);
        try {

            switch (matcherCode) {
                case WORD_CODE:
                    cursor = db.query(Word.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
                case ACCOUNT_CODE:
                    cursor = db.query(Accout.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
                case BOOKS_CODE:
                    cursor = db.query(Books.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
                case PLAN_CODE:
                    cursor = db.query(Plan.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
                case PROCESS_CODE:
                    cursor = db.query(Process.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
                case SETTING_CODE:
                    cursor = db.query(Setting.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
                    break;
            }
            cursor = db.query(Word.TABLE_NAME, projections, selection, selectionArgs, null, null, sortOrder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cursor;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        Uri result = null;
        long rowId = 0;
        int matcherCode = matcher.match(uri);
        SQLiteDatabase db = mDBHelper.getWritableDatabase();
        try {
            switch (matcherCode) {
                case WORD_CODE:
                    rowId = db.insert(Word.TABLE_NAME, Word.ENGLISH_WORD, contentValues);
                    break;
                case ACCOUNT_CODE:
//                    rowId = db.insert(Accout.TABLE_NAME,Accout.NAME  ,contentValues ) ;
                    break;
                case PLAN_CODE:
                    rowId = db.insert(Plan.TABLE_NAME, Plan.BOOKNAME, contentValues);
                    break;
                case PROCESS_CODE:
                    rowId = db.insert(Process.TABLE_NAME, Process.DATA, contentValues);
                    break;
                case SETTING_CODE:
                    rowId = db.insert(Setting.TABLE_NAME, Setting.REPEATETIME, contentValues);
                    break;
                case BOOKS_CODE:
                    rowId = db.insert(Books.TABLE_NAME, Books.BOOKNAME, contentValues);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (rowId > 0) {
            result = Uri.parse(uri + "/" + rowId);
        }
        return result;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        SQLiteDatabase db = mDBHelper.getWritableDatabase();
        int requestCode = 0;
        int matcherCode = matcher.match(uri);
        try {
            switch (matcherCode) {
                case WORD_CODE:
                    requestCode = db.delete(Word.TABLE_NAME, selection, selectionArgs);
                    break;
                case ACCOUNT_CODE:
                    requestCode = db.delete(Accout.TABLE_NAME, selection, selectionArgs);
                    break;
                case PLAN_CODE:
                    requestCode = db.delete(Plan.TABLE_NAME, selection, selectionArgs);
                    break;
                case PROCESS_CODE:
                    requestCode = db.delete(Process.TABLE_NAME, selection, selectionArgs);
                    break;
                case SETTING_CODE:
                    requestCode = db.delete(Setting.TABLE_NAME, selection, selectionArgs);
                    break;
                case BOOKS_CODE:
                    requestCode = db.delete(Books.TABLE_NAME, selection, selectionArgs);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requestCode;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String selection, String[] selectionArgs) {
        SQLiteDatabase db = mDBHelper.getWritableDatabase();
        int uriMatcher = matcher.match(uri);
        int requestCode = 0;
        int matcherCode = matcher.match(uri);
        try {
            switch (matcherCode) {
                case WORD_CODE:
                    requestCode = db.update(Word.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;
                case ACCOUNT_CODE:
                    requestCode = db.update(Accout.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;
                case PLAN_CODE:
                    requestCode = db.update(Plan.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;
                case PROCESS_CODE:
                    requestCode = db.update(Process.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;
                case SETTING_CODE:
                    requestCode = db.update(Setting.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;
                case BOOKS_CODE:
                    requestCode = db.update(Books.TABLE_NAME, contentValues, selection, selectionArgs);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requestCode;
    }

}
