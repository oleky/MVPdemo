package com.whx.tutorialdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.whx.tutorialdemo.model.Lessons;
import com.whx.tutorialdemo.presenter.MainPresenter;
import com.whx.tutorialdemo.view.IViewBind.IMainActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    private ProgressBar progressBar;
    private MainPresenter mainPresenter = new MainPresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void loadData() {
        mainPresenter.loadData();
    }

    @Override
    public void loadDataSuccess(ArrayList<Lessons> lList) {
        //不管数据怎么改，页面view只管接收到的lList，进行解析使用

    }

    @Override
    public void loadDataFail(String errCode, String errMsg) {

    }
}
