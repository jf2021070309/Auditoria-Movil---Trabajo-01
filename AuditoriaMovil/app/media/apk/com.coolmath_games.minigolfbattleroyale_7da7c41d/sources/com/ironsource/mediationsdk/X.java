package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
/* loaded from: classes2.dex */
public final class X {
    private static final X a = new X();
    private RewardedVideoListener b = null;

    private X() {
    }

    public static synchronized X a() {
        X x;
        synchronized (X.class) {
            x = a;
        }
        return x;
    }

    static /* synthetic */ void a(X x, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final synchronized void a(final IronSourceError ironSourceError) {
        if (this.b instanceof RewardedVideoManualListener) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        ((RewardedVideoManualListener) X.this.b).onRewardedVideoAdLoadFailed(ironSourceError);
                        X x = X.this;
                        X.a(x, "onRewardedVideoAdLoadFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void a(final Placement placement) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.9
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdRewarded(placement);
                        X x = X.this;
                        X.a(x, "onRewardedVideoAdRewarded(" + placement + ")");
                    }
                }
            });
        }
    }

    public final synchronized void a(RewardedVideoListener rewardedVideoListener) {
        this.b = rewardedVideoListener;
    }

    public final synchronized void a(final boolean z) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.6
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAvailabilityChanged(z);
                        X x = X.this;
                        X.a(x, "onRewardedVideoAvailabilityChanged() available=" + z);
                    }
                }
            });
        }
    }

    public final synchronized void b() {
        if (this.b instanceof RewardedVideoManualListener) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        ((RewardedVideoManualListener) X.this.b).onRewardedVideoAdReady();
                        X.a(X.this, "onRewardedVideoAdReady()");
                    }
                }
            });
        }
    }

    public final synchronized void b(final IronSourceError ironSourceError) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.10
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdShowFailed(ironSourceError);
                        X x = X.this;
                        X.a(x, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage());
                    }
                }
            });
        }
    }

    public final synchronized void b(final Placement placement) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdClicked(placement);
                        X x = X.this;
                        X.a(x, "onRewardedVideoAdClicked(" + placement + ")");
                    }
                }
            });
        }
    }

    public final synchronized void c() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.4
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdOpened();
                        X.a(X.this, "onRewardedVideoAdOpened()");
                    }
                }
            });
        }
    }

    public final synchronized void d() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.5
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdClosed();
                        X.a(X.this, "onRewardedVideoAdClosed()");
                    }
                }
            });
        }
    }

    public final synchronized void e() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.7
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdStarted();
                        X.a(X.this, "onRewardedVideoAdStarted()");
                    }
                }
            });
        }
    }

    public final synchronized void f() {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.X.8
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this) {
                        X.this.b.onRewardedVideoAdEnded();
                        X.a(X.this, "onRewardedVideoAdEnded()");
                    }
                }
            });
        }
    }
}
