package com.xs.filemanager.mvp.presenter.base;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 11:40
 * @email Xs.lin@foxmail.com
 */
public interface Presenter<V> {

    void attachView(V view);
    void detachView();

}
