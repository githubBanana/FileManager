package com.xs.filemanager.mvp.uicallback;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-07-21 12:05
 * @email Xs.lin@foxmail.com
 */
public interface MainCallback {


    void showToast(String toast);

    void showProgress();

    void showProgress(String message);

    void dismissProgress();

    void recreateView();


}
