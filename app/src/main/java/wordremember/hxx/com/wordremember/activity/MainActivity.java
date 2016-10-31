package wordremember.hxx.com.wordremember.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;

import wordremember.hxx.com.wordremember.R;
import wordremember.hxx.com.wordremember.db.WordContentProvider;
import wordremember.hxx.com.wordremember.model.Process;
import wordremember.hxx.com.wordremember.utils.ToastUtil;


public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    private Process mProcess;
//    private ContentResolver resolver;
    private WordContentProvider provider;
    private ContentValues values;
    private Uri uri;
    private RequestQueue mQuene;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext() ;
        mQuene = Volley.newRequestQueue(mContext);
        mProcess = new Process(1111,true,true) ;
        JsonObjectRequest request = new JsonObjectRequest("http://m.weather.com.cn/data/101010100.html",null,new Response.Listener<JSONObject>(){
            @Override
            public void onResponse(JSONObject jsonObject) {
                Log.v(TAG,"aaa");
                ToastUtil.showToast(mContext ,"aaa");
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                ToastUtil.showToast(mContext ,"bbb");
            }
        });
        mQuene.add(request);


//        mQuene = new RequestQueue(mContext) ;

//        uri = Uri.parse(DBHelper.WORD_DB_URL + WordContentProvider.PROCESS_CODE) ;
////        provider =
////        values.put(Process.DATA ,mProcess.getData());
////        values.put(Process.ISCOMPLETE  ,true);
////        values.put(Process.ISSTUDY ,true);
//        getContentResolver().insert(uri,values) ;



//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(intent) ;
//            }
//        });
    }
}
