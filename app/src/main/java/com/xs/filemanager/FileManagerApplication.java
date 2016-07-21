package com.xs.filemanager;

import android.app.Application;

import com.xs.filemanager.utils.InitUtil;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:15
 * @email Xs.lin@foxmail.com
 */
public class FileManagerApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();

        InitUtil.doTheme(this);
    }
}
