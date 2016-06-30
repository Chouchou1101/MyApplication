package com.qf.my.myapplication;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.qf.my.myapplication.Utils.NewsHander;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ListViewActivity extends AppCompatActivity {
    private ListView lv;
    //private SimpleCursorAdapter adapter;
    //private SimpleAdapter adapter;
    private NewsHander hander;
    private Cursor cursor;
    private List<HashMap<String,String>> data;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv = (ListView) findViewById(R.id.lv);
        hander = new NewsHander(this);
        cursor = hander.getdata();
        data = new ArrayList<>();
        while(cursor.moveToNext()){
            HashMap<String,String> map = new HashMap<>();
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String url = cursor.getString(cursor.getColumnIndex("litpic"));
            map.put("title",title);
            map.put("url",url);
            data.add(map);
        }
        adapter = new MyAdapter(data,this);
        lv.setAdapter(adapter);






//        adapter = new SimpleCursorAdapter
//                (this,R.layout.list_item,cursor,new String[]{"_id","title"}
//                        ,new int[]{R.id.id,R.id.lv_tv}){
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                View view =  super.getView(position, convertView, parent);
//                ImageView iv = (ImageView) view.findViewById(R.id.lv_iv);
//                TextView tv = (TextView) view.findViewById(R.id.lv_tv);
//                String tv_text = tv.getText().toString();
//                while(cursor.moveToNext()){
//                    String text = cursor.getString(cursor.getColumnIndex("title"));
//                    String url = cursor.getString(cursor.getColumnIndex("litpic"));
//                    byte[] bs = new byte[1024*4];
//                    int len = -1;
//                    FileInputStream fi = null;
//                    if(text.equals(url)){
//                        try {
//
//                            fi = new FileInputStream(url);
//                            while((len=fi.read(bs))!=-1){
//                                Bitmap bitmap = BitmapFactory.decodeByteArray(bs,0,len);
//                                iv.setImageBitmap(bitmap);
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }finally {
//                            try {
//                                fi.close();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//
//                }
//
//                return  view;
//            }
//        };

      //  lv.setAdapter(adapter);

    }
}
