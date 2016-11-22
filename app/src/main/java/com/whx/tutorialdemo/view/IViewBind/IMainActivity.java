package com.whx.tutorialdemo.view.IViewBind;

import com.whx.tutorialdemo.model.Lessons;

import java.util.ArrayList;

/**
 * Created by oleky on 2016/11/22.
 */

public interface IMainActivity {
    //显示进度条
    void showProgressBar();

    //隐藏进度条
    void hideProgressBar();

    //加载数据
    void loadData();

    //加载数据返回
    void loadDataSuccess(ArrayList<Lessons>lList);

    //加载数据失败返回
    void loadDataFail(String errCode, String errMsg);
}
