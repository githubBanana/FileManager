package com.xs.filemanager.utils;

import android.app.Activity;
import android.content.Intent;

import com.xs.filemanager.mvp.ui.activity.TestActivity;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-22 14:08
 * @email Xs.lin@foxmail.com
 */
public class ActivityUtil {

    public static void startTestActivity(Activity activity) {
        Intent intent = new Intent(activity, TestActivity.class);
        activity.startActivity(intent);
    }
}
