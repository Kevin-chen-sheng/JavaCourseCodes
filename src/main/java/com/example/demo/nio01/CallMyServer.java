package com.example.demo.nio01;

import com.example.demo.nio01.utils.OkHttpUtil;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年01月10日 17:26
 */
public class CallMyServer {
    public static void main(String[] args) {

        // 请求地址
        String url = "http://localhost:8801/";

        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS) // 设置超时时间
                .readTimeout(10, TimeUnit.SECONDS) // 设置读取超时时间
                .writeTimeout(10, TimeUnit.SECONDS) // 设置写入超时时间
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println("/okhttp3/get 返回结果: " + response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }


//        String s = OkHttpUtil.get("http://localhost:8801/", null);
//        System.out.println(s);
    }

}
