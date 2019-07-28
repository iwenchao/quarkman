package cn.iwenchaos.quarkman.base.delegate;

import android.os.Bundle;

import androidx.annotation.LayoutRes;

/**
 * Created by chaos
 * on 2019/7/28. 10:30
 * 文件描述：
 */
public interface IActivity {


    /**
     * 是否使用event bus
     *
     * @return 默认值
     */
    boolean useEventBus();


    /**
     * 设置布局
     *
     * @param savedInstanceState
     * @return 支持返回int类型，否则会抛异常
     */
    @LayoutRes
    int setLayoutRes(Bundle savedInstanceState);


    /**
     * 初始化控件
     *
     * @param savedInstanceState 缓存临时数据
     */
    void initView(Bundle savedInstanceState);


    /**
     * 初始化数据
     *
     * @param savedInstanceState 已缓存临时数据
     */
    void initData(Bundle savedInstanceState);
}
