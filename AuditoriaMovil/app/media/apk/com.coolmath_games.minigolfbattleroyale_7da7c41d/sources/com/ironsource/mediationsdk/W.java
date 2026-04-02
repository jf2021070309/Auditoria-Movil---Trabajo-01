package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
/* loaded from: classes2.dex */
public final class W {
    private static final W b = new W();
    ISDemandOnlyRewardedVideoListener a = null;

    private W() {
    }

    public static W a() {
        return b;
    }

    static /* synthetic */ void a(W w, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.2
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    W w = W.this;
                    W.a(w, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.W.5
                @Override // java.lang.Runnable
                public final void run() {
                    W.this.a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    W w = W.this;
                    W.a(w, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
