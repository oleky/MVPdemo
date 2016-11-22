package com.whx.tutorialdemo.module;

import com.google.gson.Gson;
import com.whx.tutorialdemo.listener.OnEventCallback;
import com.whx.tutorialdemo.model.Course;
import com.whx.tutorialdemo.model.Lessons;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import okhttp3.Call;

/**
 * Created by oleky on 2016/11/22.
 */

public class AsyGetLesson {

    public void getLesList(String user_id, final OnEventCallback<ArrayList<Lessons>>eventCallback) {
        OkHttpUtils.get()
                .addParams("user_id",user_id)
                .addParams("position",2+"")
                .url("http://www.baidu.com")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        eventCallback.onFail("-100","获取内容失败");
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Gson gson = new Gson();
                        Course course = gson.fromJson(response, Course.class);
                        ArrayList<Lessons> list = (ArrayList<Lessons>) course.getCourse();
                        eventCallback.onSuccess(list);
                    }
                });
    }
}
