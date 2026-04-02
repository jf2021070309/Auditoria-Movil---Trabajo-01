package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;
@Alpha
/* loaded from: classes4.dex */
public interface MonitoringClient {

    /* loaded from: classes4.dex */
    public interface Logger {
        void log(int i, long j);

        void logFailure();
    }

    Logger createLogger(MonitoringKeysetInfo monitoringKeysetInfo, String str, String str2);
}
