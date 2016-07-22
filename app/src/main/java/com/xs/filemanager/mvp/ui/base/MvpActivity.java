package com.xs.filemanager.mvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xs.filemanager.mvp.presenter.base.BasePresenter;

/**
 * @version V1.0 <MvpActivity>
 * @author: Xs
 * @date: 2016-07-21 11:35
 * @email Xs.lin@foxmail.com
 */
public abstract class MvpActivity<P extends BasePresenter> extends ToolbarActivity {

     protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = createPresenter();
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
