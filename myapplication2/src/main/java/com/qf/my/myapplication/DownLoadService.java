package com.qf.my.myapplication;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.NotificationCompat;

public class DownLoadService extends Service {
    NotificationManager nm;
    LoaderManager loaderManager;
    NotificationCompat.Builder builder;
    private String url ="http://www.3dmgame.com/sitemap/api.php?row=10&typeid=1&paging=1&page=1";
    public static boolean isfinished = false;
    @Override
    public void onCreate() {
        super.onCreate();
        nm = (NotificationManager) getApplication().getSystemService(Context.NOTIFICATION_SERVICE);
        builder = new NotificationCompat.Builder(getApplicationContext());
        builder.setTicker("下载完成了");
        builder.setSmallIcon(R.mipmap.ic_launcher);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        //开启异步任务进行加载
        NewsAsyncTak newsAsyncTak = new NewsAsyncTak(getApplicationContext(),nm,builder);
    newsAsyncTak.execute(url);

    return super.onStartCommand(intent, flags, startId);
}
}
