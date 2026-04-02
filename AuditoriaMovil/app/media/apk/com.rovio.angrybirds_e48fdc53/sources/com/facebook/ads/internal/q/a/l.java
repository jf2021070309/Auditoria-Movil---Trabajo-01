package com.facebook.ads.internal.q.a;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public class l implements ThreadFactory {
    protected final AtomicLong a = new AtomicLong();
    private int b = Thread.currentThread().getPriority();

    protected String a() {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", Long.valueOf(this.a.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, a(), 0L);
        thread.setPriority(this.b);
        return thread;
    }
}
