package wordremember.hxx.com.wordremember.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import wordremember.hxx.com.wordremember.R;

/**
 * Created by Administrator on 2016/10/24.
 */
public class DataAdapter extends BaseAdapter  {

    private Context mContext;
    private List<String> list = null;
    public DataAdapter(List<String> list, Context context) {
        super();
        this.mContext = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
//            convertView = LayoutInflater.from(mContext).inflate(R.layout.data_item) ;
//            viewHolder.textView = convertView.findViewById(R.id.textView4);
//            convertView.setTag(viewHolder ) ;
        } else {
            viewHolder = (ViewHolder)convertView.getTag() ;
        }
//        viewHolder.textView.setText(list.get(position ) ) ;
//        viewHolder.textView.setBackgroundColor(Color.GRAY);
        return null;
    }

    class ViewHolder{
        private TextView textView;
    }
}
