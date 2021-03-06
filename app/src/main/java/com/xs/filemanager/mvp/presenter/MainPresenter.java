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

    public void changeThemeMode(boolean isNight) {
        mvpView.showToast("toast");
        boolean _night = isNight;
        int _mode = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
        if (_night)
            _mode = AppCompatDelegate.MODE_NIGHT_YES;
        else
            _mode = AppCompatDelegate.MODE_NIGHT_NO;
        SharePreferUtil.putBoolean(mContext, Constant.ISNAGHT,_night);
        AppCompatDelegate.setDefaultNightMode(_mode);
        mvpView.recreateView();
    }




}
