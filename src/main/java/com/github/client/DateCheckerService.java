package com.github.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface DateCheckerService extends RemoteService {

    String checkDate(String date);
}
