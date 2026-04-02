package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
/* loaded from: classes2.dex */
public final class A {
    private static final A a = new A();
    private InterstitialListener b = null;

    private A() {
    }

    public static synchronized A a() {
        A a2;
        synchronized (A.class) {
            a2 = a;
        }
        return a2;
    }

    static /* synthetic */ void a(A a2, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final synchronized void a(final IronSourceError ironSourceError) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdLoadFailed(ironSourceError);
                        A a2 = A.this;
                        A.a(a2, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.b = interstitialListener;
    }

    public final synchronized void b() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdReady();
                        A.a(A.this, "onInterstitialAdReady()");
                    }
                }
            });
        }
    }

    public final synchronized void b(final IronSourceError ironSourceError) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.6
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdShowFailed(ironSourceError);
                        A a2 = A.this;
                        A.a(a2, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void c() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdOpened();
                        A.a(A.this, "onInterstitialAdOpened()");
                    }
                }
            });
        }
    }

    public final synchronized void d() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdClosed();
                        A.a(A.this, "onInterstitialAdClosed()");
                    }
                }
            });
        }
    }

    public final synchronized void e() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.5
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdShowSucceeded();
                        A.a(A.this, "onInterstitialAdShowSucceeded()");
                    }
                }
            });
        }
    }

    public final synchronized void f() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.A.7
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        A.this.b.onInterstitialAdClicked();
                        A.a(A.this, "onInterstitialAdClicked()");
                    }
                }
            });
        }
    }
}
