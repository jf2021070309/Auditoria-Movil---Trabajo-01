package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.model.DownloadTask;
/* loaded from: classes3.dex */
public interface IDownloadTaskExecuteListener {
    void onFinish(DownloadTask downloadTask, int i);

    void onStart(DownloadTask downloadTask, int i);
}
