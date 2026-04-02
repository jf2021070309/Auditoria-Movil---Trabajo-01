package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ironsource.mediationsdk.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0121o {
    private static final C0121o b = new C0121o();
    private int e;
    private int g;
    InterstitialListener a = null;
    private RewardedVideoManualListener f = null;
    private Map<String, Long> c = new HashMap();
    private Map<String, Boolean> d = new HashMap();

    private C0121o() {
    }

    public static synchronized C0121o a() {
        C0121o c0121o;
        synchronized (C0121o.class) {
            c0121o = b;
        }
        return c0121o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.c.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("adUnit = " + ad_unit + " - error = " + ironSourceError.toString());
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            InterstitialListener interstitialListener = this.a;
            if (interstitialListener != null) {
                interstitialListener.onInterstitialAdLoadFailed(ironSourceError);
            } else {
                IronLog.INTERNAL.error("mInterstitialListener is null");
            }
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.INTERNAL.warning("mRewardedVideoListener is null");
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.e = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.g = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (a(ad_unit)) {
            return;
        }
        final String ad_unit2 = ad_unit.toString();
        if (!this.c.containsKey(ad_unit2)) {
            b(ad_unit, ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            i = this.e;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            i = this.g;
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
            i = 0;
        }
        long j = i * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.c.get(ad_unit2).longValue();
        if (currentTimeMillis > j) {
            b(ad_unit, ironSourceError);
            return;
        }
        this.d.put(ad_unit2, Boolean.TRUE);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ironsource.mediationsdk.o.1
            @Override // java.lang.Runnable
            public final void run() {
                C0121o.this.b(ad_unit, ironSourceError);
                C0121o.this.d.put(ad_unit2, Boolean.FALSE);
            }
        }, j - currentTimeMillis);
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (this.d.containsKey(ad_unit.toString())) {
            return this.d.get(ad_unit.toString()).booleanValue();
        }
        return false;
    }
}
