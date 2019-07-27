package cn.iwenchaos.quarkman.base.mvp;

import android.app.Activity;

/**
 * Created by chaos
 * on 2019/7/27. 09:08
 * 文件描述：
 */
public interface IPresenter {
    /**
     * 做一些初始化操作
     */
    void onStart();
    /**
     * 在框架中 {@link Activity#onDestroy()} 会默认调用{@link IPresenter#onDestroy()}
     */
    void onDestroy();

}
