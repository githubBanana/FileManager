package com.xs.filemanager.utils;

import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:12
 * @email Xs.lin@foxmail.com
 */
public class InitUtil {

    public static void doTheme(Context context) {
        final boolean isNight = SharePreferUtil.getBoolean(context,Constant.ISNAGHT);
        if (isNight) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
