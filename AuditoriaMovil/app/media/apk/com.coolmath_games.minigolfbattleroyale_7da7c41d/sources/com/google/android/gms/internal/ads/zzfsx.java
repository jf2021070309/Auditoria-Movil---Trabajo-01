package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfsx extends TimeoutException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfsx(String str, zzfsw zzfswVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
