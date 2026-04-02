package com.amazon.aps.iva.r;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.ab.a {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new a());
    public volatile Handler c;

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.a.getAndIncrement());
            return thread;
        }
    }

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler s(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
