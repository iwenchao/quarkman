package cn.iwenchaos.quarkman.base.mvp;

import android.app.Activity;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by chaos
 * on 2019/7/27. 09:09
 * 文件描述：
 */
public abstract class BasePresenter<M extends  IModel,V extends IView> implements IPresenter {
    private static final String TAG = BasePresenter.class.getSimpleName();
    private CompositeDisposable mCompositeDisposable;


    protected M mModel;
    protected V mView;


    public BasePresenter(M model, V view) {
        mModel = model;
        mView = view;
        onStart();
    }



    @Override
    public void onStart() {

    }

    @Override
    public void onDestroy() {

    }

    /**
     * 是否使用{@link org.simple.eventbus.EventBus }
     * @return 默认不使用bus
     */
    public boolean useEventBus(){
        return false;
    }


    /**
     * 将 disposable 添加到 {@link CompositeDisposable}中统一管理
     * 可以在{@link Activity#onDestroy()}中使用{@link #unDispose()} 停止正在执行的Rxjava任务，避免内存泄漏
     * 后续改进使用{@link RxLifecycle} 避免内存泄漏
     * @param disposable
     */
    public void addDispose(Disposable disposable){
        if (mCompositeDisposable == null){
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }


    /**
     * 停止集合中正在执行的 RxJava 任务
     */
    public void unDispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();//保证 Activity 结束时取消所有正在执行的订阅
        }
    }
}
