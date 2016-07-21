package com.xs.filemanager.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xs.filemanager.R;
import com.xs.filemanager.mvp.ui.base.ToolbarActivity;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 15:08
 * @email Xs.lin@foxmail.com
 */
public class TestActivity extends ToolbarActivity {
    private static final String TAG = "TestActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setDisplayHomeAsUpEnabled(true);
    }
}
