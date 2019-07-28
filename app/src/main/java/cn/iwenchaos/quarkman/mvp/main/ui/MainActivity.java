package cn.iwenchaos.quarkman.mvp.main.ui;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.iwenchaos.quarkman.R;
import cn.iwenchaos.quarkman.base.BaseActivity;
import cn.iwenchaos.quarkman.mvp.main.contract.MainContract;
import cn.iwenchaos.quarkman.mvp.main.presenter.MainPresenter;

/**
 * Created by chaos
 * on 2019/7/26. 08:10
 * 文件描述：首页
 * 提供内容：
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @BindView(R.id.contentRecycler)
    RecyclerView mContentRecycler;
    @BindView(R.id.mainNav)
    NavigationView mMainNav;
    @BindView(R.id.mainDrawerLayout)
    DrawerLayout mMainDrawerLayout;

    @Override
    public int setLayoutRes(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {

    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }


    private void setupDrawer(){

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
}
