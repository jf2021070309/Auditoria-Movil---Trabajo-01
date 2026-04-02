package com.vungle.warren.downloader;

import java.util.List;
/* loaded from: classes2.dex */
public interface Downloader {

    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 3;
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;
    }

    void cancel(DownloadRequest downloadRequest);

    void cancelAll();

    boolean cancelAndAwait(DownloadRequest downloadRequest, long j);

    void clearCache();

    void download(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener);

    boolean dropCache(String str);

    List<DownloadRequest> getAllRequests();

    void init();

    boolean isCacheEnabled();

    void setCacheEnabled(boolean z);

    void setProgressStep(int i);

    void updatePriority(DownloadRequest downloadRequest);

    /* loaded from: classes2.dex */
    public static class RequestException extends Exception {
        /* JADX INFO: Access modifiers changed from: package-private */
        public RequestException(String str) {
            super(str);
        }
    }
}
