package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler a = new AppLovinExceptionHandler();
    private final Set<k> b = new HashSet(2);
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    public static AppLovinExceptionHandler shared() {
        return a;
    }

    public void addSdk(k kVar) {
        this.b.add(kVar);
    }

    public void enable() {
        if (this.c.compareAndSet(false, true)) {
            this.d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        for (k kVar : this.b) {
            kVar.z().b("AppLovinExceptionHandler", "Detected unhandled exception");
            ((EventServiceImpl) kVar.u()).trackEventSynchronously("paused");
            ((EventServiceImpl) kVar.u()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
