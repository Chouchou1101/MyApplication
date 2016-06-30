package com.qf.my.myapplication.Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by my on 2016/6/24.
 */
public class NewsOpenHelper extends SQLiteOpenHelper{
    public NewsOpenHelper(Context context) {
        super(context, "news.db", null, 1);
    }
   // varchar(20)
    //":{"id":"3572625","typeid":"2","typeid2":"0","sortrank":"1466752086","flag":"",
   // "ismake":"1","channel":"1","arcrank":"0","click":"55","money":"0",
   // "title":"\u300a\u771f\u4e09\u56fd\u65e0\u53cc:\u82f1\u6770\u4f20\u300b\u60c5\u62a5 \u953b\u9020\u7cfb\u7edf\u6253\u9020\u6700\u5f3a\u5175\u5668",
   // "shorttitle":"\u771f\u4e09\u56fd\u82f1\u6770\u4f20\u60c5\u62a5",
   // "color":"","writer":"liyunfei","source":"3DM","litpic":"\/uploads\/allimg\/160624\/153_160624151023_1_lit-lp.jpg",
   // "pubdate":"1466752086","senddate":"1466752266","mid":"153",
   // "keywords":"\u771f\u4e09\u56fd\u65e0\u53cc,\u82f1\u6770\u4f20\u60c5\u62a5,\u953b\u9020\u7cfb\u7edf",
   // "lastpost":"0","scores":"0","goodpost":"0","badpost":"0","voteid":"0","notpost":"0","description":"\u6700\u65b0\u4e00\u671f\u7684Fami\u901a\u6742\u5fd7\u516c\u5e03\u4e86SRPG\u65b0\u4f5c\u300a\u771f\u4e09\u56fd\u65e0\u53cc\uff1a\u82f1\u6770\u4f20\u300b\u7684\u6700\u65b0\u60c5\u62a5\uff0c\u8fd9\u6b21\u5b98\u65b9\u4e3a\u6211\u4eec\u5c55\u793a\u4e86\u6b66\u5668\u5347\u7ea7\u7cfb\u7edf\u4ee5\u53ca\u5373\u5c06\u914d\u4fe1\u7684\u8bd5\u73a9\u7248\u5185\u5bb9\uff0c\u4e00\u8d77\u6765\u4e86\u89e3\u4e0b\u5427","filename":"","dutyadmin":"153","tackid":"0","mtype":"0","weight":"262594","fby_id":"0","game_id":"0","feedback":"0","typedir":"{cmspath}\/a\/news","typename":"\u6e38\u620f\u65b0\u95fb","corank":"0","isdefault":"-1","defaultname":"index.html","namerule":"{typedir}\/{Y}{M}\/{aid}.html","namerule2":"{typedir}\/list_{tid}_{page}.html","ispart":"0","moresite":"0","siteurl":"","sitepath":"{cmspath}\/a\/info","arcurl":"http:\/\/www.3dmgame.com\/news\/201606\/3572625.html","typeurl":"http:\/\/www.3dmgame.com\/news\/","videolist":{"0":{"body":null}}},"1":{"


    //insert into news (_id,typeid,typeid2,sortrank,flag,ismake,channel" +
   // ",arcrank,click,money,title,shorttitle,color,writer,source,litpic

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists news (_id integer primary key,typeid varchar(20),typeid2 varchar(20)," +
                "sortrank varchar(20),flag varchar(20),ismake varchar(20)," +
                "channel varchar(20),arcrank varchar(20),click varchar(20)," +
                "money varchar(20),title varchar(50),shorttitle varchar(50),color varchar(20)," +
                "writer varchar(20),source varchar(20), litpic varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
