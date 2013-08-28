package com.github.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface DateCheckerServiceAsync {
    void checkDate(String date, AsyncCallback<String> async);
}
