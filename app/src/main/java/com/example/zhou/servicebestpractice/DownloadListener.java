package com.example.zhou.servicebestpractice;

/**
 * Created by zhou on 2017/6/25.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
