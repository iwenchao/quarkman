package cn.iwenchaos.quarkman.base.mvp;

/**
 * Created by chaos
 * on 2019/7/27. 08:54
 * 文件描述：每个使用MVP架构的都需要实现该接口，以满足规范
 */
public interface IModel {


    /**
     * 在{@link BasePresenter#onDestroy()}会默认调用{@link IModel#onDestroy()}
     */
    void onDestroy();

}
