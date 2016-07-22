package com.xs.filemanager.mvp.ui.activity;

import com.xs.filemanager.R;
import com.xs.filemanager.mvp.ui.base.ToolbarActivity;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 15:08
 * @email Xs.lin@foxmail.com
 */
public class TestActivity extends ToolbarActivity {


    @Override
    protected int getContentViewId() {
        return R.layout.activity_test;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        setDisplayHomeAsUpEnabled(true);
        setTitle(R.string.app_name);
    }
}
