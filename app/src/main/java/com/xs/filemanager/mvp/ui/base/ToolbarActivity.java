package com.xs.filemanager.mvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.xs.filemanager.R;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:36
 * @email Xs.lin@foxmail.com
 */
public class ToolbarActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar _toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(_toolbar);
    }


    public void setToolbarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


    public void setDisplayHomeAsUpEnabled(boolean enabled){
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(enabled);
    }

    public void setHomeAsUpIndicator(int resId) {
        this.getSupportActionBar().setHomeAsUpIndicator(resId);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

