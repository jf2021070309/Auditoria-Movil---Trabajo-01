package com.bytedance.msdk.api.v2.ad;
/* loaded from: classes.dex */
public interface GMAdAppDownloadListener {
    void onDownloadFailed(long j, long j2, String str, String str2);

    void onDownloadFinished(long j, String str, String str2);

    void onDownloadPaused(long j, long j2, String str, String str2);

    void onDownloadProgress(long j, long j2, int i, int i2);

    void onDownloadStarted();

    void onIdle();

    void onInstalled(String str, String str2);
}
