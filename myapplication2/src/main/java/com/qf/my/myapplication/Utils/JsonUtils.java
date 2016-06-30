package com.qf.my.myapplication.Utils;

import android.text.TextUtils;
import android.util.Log;

import com.qf.my.myapplication.com.qf.dao.News;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by my on 2016/6/24.
 */
public class JsonUtils {
    public static List<News> toList(String json){
        //id ,typeid,typeid2,,sortrank,flag，ismake，channel" +
       // ",arcrank,click,money,title,shorttitle,color,writer,source,litpic) " +
        //
        try {
            JSONObject jo1 = new JSONObject(json);
           // JSONArray ja = jo1.getJSONArray("data");

            JSONObject jo3 = jo1.getJSONObject("data");
           // JSONArray ja = jo3.getJSONArray("");

            List<News> list = new ArrayList<News>();

            for(int i = 0;i<10;i++){
                JSONObject jo2 = jo3.getJSONObject(i+"");
                String id = jo2.getString("id");
               // Log.i("12345","-------------------------------------id"+id);
                if (TextUtils.isEmpty(id.trim())){
                    id ="空";
                }
                String typeid = jo2.getString("typeid");
                if (TextUtils.isEmpty(typeid.trim())){
                    typeid ="空";
                }
                String typeid2 = jo2.getString("typeid2");
                if (TextUtils.isEmpty(typeid2.trim())){
                    typeid2 ="空";
                }
                String sortrank = jo2.getString("sortrank");
                if (TextUtils.isEmpty(sortrank.trim())){
                    sortrank ="空";
                }
                String flag = jo2.getString("flag");
                if (TextUtils.isEmpty(flag.trim())){
                    flag ="空";
                }
                String ismake = jo2.getString("ismake");
                if (TextUtils.isEmpty(ismake.trim())){
                    ismake ="空";
                }
                String channel = jo2.getString("channel");
                if (TextUtils.isEmpty(channel.trim())){
                    channel ="空";
                }
                String arcrank = jo2.getString("arcrank");
                if (TextUtils.isEmpty(arcrank.trim())){
                    arcrank ="空";
                }
                String click = jo2.getString("click");
                if (TextUtils.isEmpty(click.trim())){
                    click ="空";
                }
                String money = jo2.getString("money");
                if (TextUtils.isEmpty(money.trim())){
                    money ="空";
                }
                String title = jo2.getString("title");
                if (TextUtils.isEmpty(title.trim())){
                    title ="空";
                }
                String shorttitle = jo2.getString("shorttitle");
                if (TextUtils.isEmpty(shorttitle.trim())){
                    shorttitle ="空";
                }
                String color = jo2.getString("color");
                if (TextUtils.isEmpty(color.trim())){
                    color ="空";
                }
                String writer = jo2.getString("writer");
                if (TextUtils.isEmpty(writer.trim())){
                    writer ="空";
                }
                String source = jo2.getString("source");
                if (TextUtils.isEmpty(source.trim())){
                    source ="空";
                }
                String litpic = "http://www.3dmgame.com/"+jo2.getString("litpic");
                News news = new News(id ,typeid,typeid2,sortrank,flag,ismake,channel,arcrank,click,money,title,shorttitle,color,writer,source,litpic);
                //Log.i("12345",news.toString());
                list.add(news);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return  null;
    }
}
