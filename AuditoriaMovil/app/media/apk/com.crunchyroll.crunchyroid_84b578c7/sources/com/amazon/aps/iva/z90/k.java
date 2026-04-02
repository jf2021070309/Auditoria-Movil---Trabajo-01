package com.amazon.aps.iva.z90;

import java.util.concurrent.ThreadFactory;
/* compiled from: SntpService.kt */
/* loaded from: classes4.dex */
public final class k implements ThreadFactory {
    public static final k a = new k();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "kronos-android");
    }
}
