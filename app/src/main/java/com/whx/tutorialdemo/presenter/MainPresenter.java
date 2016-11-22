package com.whx.tutorialdemo.presenter;

import android.content.Context;

import com.whx.tutorialdemo.listener.OnEventCallback;
import com.whx.tutorialdemo.model.Lessons;
import com.whx.tutorialdemo.module.AsyGetLesson;
import com.whx.tutorialdemo.view.IViewBind.IMainActivity;

import java.util.ArrayList;

import rx.Subscription;

/**
 * Created by oleky on 2016/11/22.
 */

public class MainPresenter {
    private IMainActivity mIMainActivity;
    private AsyGetLesson asy;
    public MainPresenter(IMainActivity iMainActivity) {
        //绑定获得view对象
        mIMainActivity = iMainActivity;
        asy = new AsyGetLesson();
    }

    //对view提供的调用方法
    public void loadData() {
        mIMainActivity.showProgressBar();
        asy.getLesList("1002", new OnEventCallback<ArrayList<Lessons>>() {
            @Override
            public void onSuccess(ArrayList<Lessons> response) {
                mIMainActivity.hideProgressBar();
                mIMainActivity.loadDataSuccess(response);
            }

            @Override
            public void onFail(String errCode, String errMsg) {
                mIMainActivity.hideProgressBar();
                mIMainActivity.loadDataFail(errCode, errMsg);
            }
        });
    }
}
