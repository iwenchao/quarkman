package cn.iwenchaos.quarkman.mvp.main.presenter;

import cn.iwenchaos.quarkman.base.mvp.BasePresenter;
import cn.iwenchaos.quarkman.base.mvp.IPresenter;
import cn.iwenchaos.quarkman.mvp.main.contract.MainContract;

/**
 * Created by chaos
 * on 2019/7/28. 10:56
 * 文件描述：
 */
public class MainPresenter extends BasePresenter<MainContract.Model, MainContract.View> implements IPresenter {



    public MainPresenter(MainContract.Model model, MainContract.View view) {
        super(model, view);
    }
}
