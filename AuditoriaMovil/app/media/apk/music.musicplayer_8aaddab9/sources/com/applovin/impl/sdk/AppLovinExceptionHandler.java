package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler a = new AppLovinExceptionHandler();

    /* renamed from: b  reason: collision with root package name */
    private final Set<m> f3779b = new HashSet(2);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3780c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f3781d;

    public static AppLovinExceptionHandler shared() {
        return a;
    }

    public void addSdk(m mVar) {
        this.f3779b.add(mVar);
    }

    public void enable() {
        if (this.f3780c.compareAndSet(false, true)) {
            this.f3781d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        for (m mVar : this.f3779b) {
            mVar.B().b("AppLovinExceptionHandler", "Detected unhandled exception");
            ((EventServiceImpl) mVar.w()).trackEventSynchronously("paused");
            ((EventServiceImpl) mVar.w()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3781d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
