package com.faas.core.utils.service.email;

import com.faas.core.utils.config.AppUtils;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmailManagerService {

    private final OkHttpClient client = new OkHttpClient();

    @Autowired
    AppUtils appUtils;


    public void sendSmsMessageService() {


    }


}
