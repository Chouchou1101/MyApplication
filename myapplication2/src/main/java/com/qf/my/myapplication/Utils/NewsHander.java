package com.qf.my.myapplication.Utils;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.qf.my.myapplication.com.qf.dao.News;

/**
 * Created by my on 2016/6/24.
 */
public class NewsHander {
        NewsOpenHelper helper;
        private Context context;

    public NewsHander(Context context) {
        this.context = context;

    helper = new NewsOpenHelper(context);
    }
    //"create table if not exists news (id varchar(20),typeid varchar(20),typeid2 varchar(20)," +
    //"sortrank varchar(20),flag varchar(20),ismake varchar(20)," +
    //        "channel varchar(20),arcrank varchar(20),click varchar(20)," +
     //       "money varchar(20),title varchar(50),shorttitle varchar(50),color varchar(20)," +
    //        "writer varchar(20),source varchar(20), litpic source varchar(50)
    public void insert(News news) {
       // helper = new NewsOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
       // Log.i("12345",db.hashCode()+"");
       // Log.i("12345", news.getId() + "," + news.getTypeid() + "," + news.getTypeid2() + "," + news.getSortrank() + "," + news.getFlag() + "," + news.getIsmake() + "," + news.getChannel() + "," + news.getArcrank()+ "," + news.getClick() + "," + news.getMoney() + "," + news.getTitle() + "," + news.getShorttitle() + "," + news.getColor() + "," + news.getWriter()+ "," + news.getSource() + "," + news.getLitpic().trim()  );
       Cursor cursor = getdata();
        while(cursor.moveToNext()){
            String title = cursor.getString(cursor.getColumnIndex("title")).trim();
                if(title.equals(news.getTitle().trim())){
                    return;
            }

        }
        db.execSQL("insert into news (typeid,typeid2,sortrank,flag,ismake,channel" +
                ",arcrank,click,money,title,shorttitle,color,writer,source,litpic) " +
                "values ('"+ news.getTypeid().trim() + "','" + news.getTypeid2().trim() + "','" + news.getSortrank().trim() + "','" + news.getFlag().trim() + "','" + news.getIsmake().trim() + "','" + news.getChannel().trim() + "','" + news.getArcrank().trim() + "','" + news.getClick().trim() + "','" + news.getMoney().trim() + "','" + news.getTitle().trim() + "','" + news.getShorttitle().trim() + "','" + news.getColor().trim() + "','" + news.getWriter().trim() + "','" + news.getSource().trim() + "','" + news.getLitpic().trim() + "')");
        if (db != null) {
            db.close();
        }
    }
    public  void updata(String pic,String path){
       // helper = new NewsOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        db.execSQL("update news set litpic='"+path+" 'where litpic='"+pic+"'");
        db.close();
    }
    public Cursor getdata(){
       // helper = new NewsOpenHelper(context);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor= db.query("news",new String[]{"title","litpic"},null,null,null,null,null);
        return cursor;
    }
}