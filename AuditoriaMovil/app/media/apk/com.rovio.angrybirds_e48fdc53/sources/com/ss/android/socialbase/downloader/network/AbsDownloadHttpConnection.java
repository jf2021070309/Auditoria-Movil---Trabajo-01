package com.ss.android.socialbase.downloader.network;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class AbsDownloadHttpConnection implements IDownloadHttpConnection {
    public void setThrottleNetSpeedWhenRunning(long j) {
    }

    public void onThrowable(Throwable th) {
    }

    public String getHostIp() {
        return "";
    }

    public void monitorNetworkInfo(JSONObject jSONObject, boolean z) {
    }

    public String getRequestLog() {
        return "";
    }
}
