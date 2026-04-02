package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzfsx extends TimeoutException {
    public /* synthetic */ zzfsx(String str, zzfsw zzfswVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
