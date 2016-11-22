package com.whx.tutorialdemo.listener;

/**
 * Created by oleky on 2016/11/22.
 */

public interface OnEventCallback<T> {
    void onSuccess(T response);

    void onFail(String errCode, String errMsg);
}
