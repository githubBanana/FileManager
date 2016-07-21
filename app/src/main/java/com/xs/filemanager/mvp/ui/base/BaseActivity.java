package com.xs.filemanager.mvp.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:36
 * @email Xs.lin@foxmail.com
 */
public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    public Activity mAct;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAct = this;
    }


    public void showToast(String toast) {
        Toast.makeText(mAct,toast,Toast.LENGTH_SHORT).show();
    }
}
