package com.vungle.warren;
/* loaded from: classes2.dex */
public class SessionData {
    private long initTime;
    private long timeout;

    public void setInitTimeStamp(long j) {
        this.initTime = j;
    }

    public long getInitTimeStamp() {
        return this.initTime;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }
}
