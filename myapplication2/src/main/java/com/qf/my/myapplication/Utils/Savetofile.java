package com.qf.my.myapplication.Utils;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by my on 2016/6/24.
 */
public class Savetofile {
    public static  boolean savetofile(byte[] bs, String filename, String url, Context context)  throws Exception{
        boolean flag = false;
        NewsHander hander = new NewsHander(context);
        //Log.i("12345",Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())+"");
        if(Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
            File root =  Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
           // Log.i("12345",root.getAbsolutePath()+"----");
            File file = new File(root,filename);
            if(file.exists()){
                file.delete();
            }
          //  Log.i("12345",file.getAbsolutePath()+"******");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bs,0,bs.length);
            flag = true;
            String path = file.getAbsolutePath();
            hander.updata(url,filename);
            fileOutputStream.close();
        }
        return flag;
    }
}
