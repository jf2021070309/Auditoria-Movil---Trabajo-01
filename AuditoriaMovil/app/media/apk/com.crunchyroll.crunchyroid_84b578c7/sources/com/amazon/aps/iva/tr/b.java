package com.amazon.aps.iva.tr;

import java.util.concurrent.ThreadFactory;
/* compiled from: DaemonThreadFactory.java */
/* loaded from: classes2.dex */
public final class b implements ThreadFactory {
    public static final b a = new b();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "dd-task-scheduler");
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
