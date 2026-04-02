package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.r;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class AppLovinInterstitialAd {
    private static q b;
    private static final Object a = new Object();
    private static WeakReference<Context> c = new WeakReference<>(null);

    private static q a(AppLovinSdk appLovinSdk, Context context) {
        synchronized (a) {
            b = new q(appLovinSdk, context);
            c = new WeakReference<>(context);
        }
        return b;
    }

    private static q b(AppLovinSdk appLovinSdk, Context context) {
        synchronized (a) {
            if (b == null || c.get() != context) {
                r.h("AppLovinInterstitialAd", "No interstitial dialog was previously created or was created with a different context. Creating new interstitial dialog");
                b = new q(appLovinSdk, context);
                c = new WeakReference<>(context);
            }
        }
        return b;
    }

    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                return a(appLovinSdk, context);
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    @Deprecated
    public static boolean isAdReadyToDisplay(Context context) {
        return AppLovinSdk.getInstance(context).getAdService().hasPreloadedAd(AppLovinAdSize.INTERSTITIAL);
    }

    @Deprecated
    public static void show(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        b(AppLovinSdk.getInstance(context), context).show();
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
