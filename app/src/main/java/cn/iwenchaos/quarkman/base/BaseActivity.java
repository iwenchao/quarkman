package cn.iwenchaos.quarkman.base;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.iwenchaos.quarkman.base.delegate.IActivity;
import cn.iwenchaos.quarkman.base.mvp.IPresenter;

/**
 * Created by chaos
 * on 2019/7/26. 08:10
 * 文件描述：基类
 * 提供内容：
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity {
    private static final String TAG = BaseActivity.class.getSimpleName();

    protected P mPresenter;
    private Unbinder mUnbinder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView(savedInstanceState);
        initView(savedInstanceState);
        initData(savedInstanceState);
    }

    private void setView(@Nullable Bundle savedInstanceState) {
        int layoutResId = setLayoutRes(savedInstanceState);
        if (layoutResId != 0) {
            setContentView(layoutResId);
            mUnbinder = ButterKnife.bind(this);
        } else {
            Log.d(TAG, "请检查是否需要设置布局");
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null && mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
            mUnbinder = null;
        }
        if (mPresenter != null) {
            mPresenter.onDestroy();
            mPresenter = null;
        }
    }

    @Override
    public boolean useEventBus() {
        return false;
    }
}
