package com.xs.filemanager.mvp.ui.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.xs.filemanager.R;
import com.xs.filemanager.mvp.presenter.MainPresenter;
import com.xs.filemanager.mvp.ui.base.MvpActivity;
import com.xs.filemanager.mvp.uicallback.MainCallback;
import com.xs.filemanager.utils.ActivityUtil;

public class MainActivity extends MvpActivity<MainPresenter>
implements NavigationView.OnNavigationItemSelectedListener,MainCallback{

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawer,_toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final FloatingActionButton mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(this);

    }


    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_camera:

                break;
            case R.id.nav_gallery:

                break;
            case R.id.nav_slideshow:

                break;
            case R.id.nav_manage:

                break;
            case R.id.nav_share:
                mPresenter.changeThemeMode(true);
                break;
            case R.id.nav_send:
                mPresenter.changeThemeMode(false);
                break;
            default:break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void showToast(String toast) {
        showSnackBar(toast);
//        Snackbar.make(mContentView,toast,Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void showProgress(String message) {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void recreateView() {
        mAct.recreate();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab:
                ActivityUtil.startTestActivity(mAct);
                break;
        }
    }
}
