package com.qf.my.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * Created by my on 2016/6/24.
 */
public class MyAdapter extends BaseAdapter{
    private List<HashMap<String,String>> data;
    private Context context;
    private boolean isfinshed = true;
    public MyAdapter(List<HashMap<String, String>> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView==null){
            holder = new ViewHolder();
            convertView = View.inflate(context,R.layout.list_item,null);
            holder.iv = (ImageView) convertView.findViewById(R.id.lv_iv);
            holder.tv = (TextView) convertView.findViewById(R.id.lv_tv);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        HashMap<String,String > map = data.get(position);
        String url = map.get("url").trim();
        String title = map.get("title");
        holder.tv.setText(title);


        Log.i("6789",url);
        byte[] bs = new byte[1024*4];
                    int len = -1;
                   FileInputStream fi = null;
//
                        try {
                           // Log.i("6789",Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())+"");

                          File root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

                          //  File file = new File(root,url);
                           fi = new FileInputStream(new File(root,url));

//                           while((len=fi.read(bs))!=-1){
                                Bitmap bitmap = BitmapFactory.decodeStream(fi);
                               holder.iv.setImageBitmap(bitmap);
//                           }
                           fi.close();
                       } catch (Exception e) {
                           e.printStackTrace();
                        }
        return convertView;
    }
    class ViewHolder{
        ImageView iv;
        TextView tv;
    }
}
