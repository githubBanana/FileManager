package com.xs.filemanager.mvp.presenter.base;

import android.content.Context;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:41
 * @email Xs.lin@foxmail.com
 */
public class BasePresenter<V> implements Presenter<V> {

    public V mvpView;
    public Context mContext;

    @Override
    public void attachView(V view) {
        this.mvpView = view;
        this.mContext = (Context) view;
    }

    @Override
    public void detachView() {
        this.mvpView = null;
    }
}
