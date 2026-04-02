package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
/* renamed from: com.ironsource.mediationsdk.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0132z {
    private static final C0132z b = new C0132z();
    ISDemandOnlyInterstitialListener a = null;

    private C0132z() {
    }

    public static C0132z a() {
        return b;
    }

    static /* synthetic */ void a(C0132z c0132z, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.2
                @Override // java.lang.Runnable
                public final void run() {
                    C0132z.this.a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C0132z c0132z = C0132z.this;
                    C0132z.a(c0132z, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.z.5
                @Override // java.lang.Runnable
                public final void run() {
                    C0132z.this.a.onInterstitialAdShowFailed(str, ironSourceError);
                    C0132z c0132z = C0132z.this;
                    C0132z.a(c0132z, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
