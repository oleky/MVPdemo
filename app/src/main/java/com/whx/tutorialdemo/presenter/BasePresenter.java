package com.whx.tutorialdemo.presenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by oleky on 2016/11/22.
 */

public class BasePresenter {
    //将所有正在处理的Subscribetion都添加在一起，退出统一注销
    private CompositeSubscription compositeSubscription;
    public void addSubscription(Subscription subscription) {
        if (compositeSubscription == null) {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(subscription);

    }

    //界面退出等位置需要解绑观察者的位置，防止Rx内存溢出
    public void unSubscription() {
        if (compositeSubscription != null) {
            compositeSubscription.unsubscribe();
        }
    }
}
