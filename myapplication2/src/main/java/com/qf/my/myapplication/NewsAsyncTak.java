package com.qf.my.myapplication;

import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.qf.my.myapplication.Utils.HttpUtiles;
import com.qf.my.myapplication.Utils.JsonUtils;
import com.qf.my.myapplication.Utils.NewsHander;
import com.qf.my.myapplication.com.qf.dao.News;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by my on 2016/6/24.
 */
public class NewsAsyncTak extends AsyncTask<String,Void,List<News>>{

    Context context;
    NewsHander hander;
    NotificationManager manager;
    NotificationCompat.Builder builder;

    public NewsAsyncTak(Context context, NotificationManager manager, NotificationCompat.Builder builder) {
        this.context = context;
        this.manager = manager;
        this.builder = builder;
    }

    public NewsAsyncTak(Context context) {
        this.context = context;
    }

    protected void onPreExecute() {
        super.onPreExecute();
        hander = new NewsHander(context);
    }

    @Override
    protected List<News> doInBackground(String... params) {
        byte[] bs = HttpUtiles.getByte(params[0]);
        if(bs!=null){
            try {
                String json = new String(bs,"utf-8");
                return JsonUtils.toList(json);

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<News> newses) {
       // Log.i("12345",newses.hashCode()+"");
                if(newses!=null){
                    for (News news:newses){
                      Log.i("12345",news.toString());
                        hander.insert(news);
                        String url = news.getLitpic();
                        String shorttitle = news.getShorttitle().trim();
                        Asyncloadimg asyncloadimg = new Asyncloadimg(url,shorttitle,context);
                        asyncloadimg.execute(url);
                        manager.notify(100,builder.build());
            }
        }else
        {
            Toast.makeText(context,"解析出现错误",Toast.LENGTH_LONG).show();
        }

    }
}
