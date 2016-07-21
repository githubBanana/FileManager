package com.xs.filemanager.mvp.presenter;

import android.support.v7.app.AppCompatDelegate;

import com.xs.filemanager.mvp.presenter.base.BasePresenter;
import com.xs.filemanager.mvp.uicallback.MainCallback;
import com.xs.filemanager.utils.Constant;
import com.xs.filemanager.utils.SharePreferUtil;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 12:00
 * @email Xs.lin@foxmail.com
 */
public class MainPresenter extends BasePresenter<MainCallback> {

    private static final String TAG = "MainPresenter";

    public MainPresenter(MainCallback mainCallback) {
        attachView(mainCallback);
    }

    public void onClickNightMode() {
        mvpView.showToast("toast");
        SharePreferUtil.putBoolean(mContext, Constant.ISNAGHT,true);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        mvpView.recreate();
    }




}
