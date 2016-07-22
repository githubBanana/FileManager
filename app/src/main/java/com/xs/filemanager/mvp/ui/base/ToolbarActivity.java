package com.xs.filemanager.mvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.xs.filemanager.R;

/**
 * @version V1.0 <ToolbarActivity>
 * @author: Xs
 * @date: 2016-07-21 11:36
 * @email Xs.lin@foxmail.com
 */
public abstract class ToolbarActivity extends BaseActivity {

    protected View mContentView;
    protected Toolbar _toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContentView = getLayoutInflater().inflate(getContentViewId(),null);
        setContentView(mContentView);
        _toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(_toolbar);
        initView();
    }

    protected abstract int getContentViewId();
    protected abstract void initView();

    @Override
    public void setTitle(int titleId) {
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(titleId);
    }

    public void setDisplayHomeAsUpEnabled(boolean enabled){
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(enabled);
    }

    public void setHomeAsUpIndicator(int resId) {
        if (getSupportActionBar() != null)
            getSupportActionBar().setHomeAsUpIndicator(resId);
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

    public void showSnackBar(String toast) {
        Snackbar.make(mContentView,toast,Snackbar.LENGTH_SHORT).show();
    }
}

