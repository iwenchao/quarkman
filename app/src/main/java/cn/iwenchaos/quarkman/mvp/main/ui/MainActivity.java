package cn.iwenchaos.quarkman.mvp.main.ui;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import cn.iwenchaos.quarkman.R;
import cn.iwenchaos.quarkman.base.BaseActivity;
import cn.iwenchaos.quarkman.mvp.main.contract.MainContract;
import cn.iwenchaos.quarkman.mvp.main.model.MainModel;
import cn.iwenchaos.quarkman.mvp.main.presenter.MainPresenter;

/**
 * Created by chaos
 * on 2019/7/26. 08:10
 * 文件描述：首页
 * 提供内容：
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View, NavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.appbarLayout)
    AppBarLayout mAppbarLayout;
    @BindView(R.id.contentRecycler)
    RecyclerView mContentRecycler;
    @BindView(R.id.mainNav)
    NavigationView mMainNav;
    @BindView(R.id.mainDrawerLayout)
    DrawerLayout mMainDrawerLayout;
    @BindView(R.id.toolBar)
    Toolbar mToolBar;

    MainModel mMainModel;

    @Override
    public int setLayoutRes(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        setupDrawerAndToolbar();

    }

    @Override
    public void initData(Bundle savedInstanceState) {
        mMainModel = new MainModel();
        mPresenter = new MainPresenter(mMainModel, this);
        mPresenter.onStart();
    }


    private void setupDrawerAndToolbar() {
        setSupportActionBar(mToolBar);
        mToolBar.setTitle(getString(R.string.main));
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mMainDrawerLayout, mToolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mMainDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        mMainNav.setNavigationItemSelectedListener(this);
        mMainNav.setCheckedItem(R.id.navMain);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
