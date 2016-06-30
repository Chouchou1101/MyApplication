package com.qf.my.myapplication;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.qf.my.myapplication.Utils.HttpUtiles;
import com.qf.my.myapplication.Utils.Savetofile;

/**
 * Created by my on 2016/6/24.
 */
public class Asyncloadimg extends AsyncTask<String,Void,byte[]> {
    private String  url ;
    private String filename;
    private Context context;
    public Asyncloadimg(String url, String filename, Context context) {
        this.url = url;
        this.filename = filename;
        this.context = context;
    }

    @Override
    protected byte[] doInBackground(String... params) {
        return HttpUtiles.getByte(params[0]);
    }


    @Override
    protected void onPostExecute(byte[] bs) {
        super.onPostExecute(bs);
        if(bs!=null){
            try {

                Savetofile.savetofile(bs,"a"+filename+".jpg",url,context);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            Toast.makeText(context,"下载图片有问题",Toast.LENGTH_LONG).show();
        }
    }
}
