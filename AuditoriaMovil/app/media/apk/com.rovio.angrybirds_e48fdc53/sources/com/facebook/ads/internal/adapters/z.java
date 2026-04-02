package com.facebook.ads.internal.adapters;
/* loaded from: classes2.dex */
public class z {
    private static final String[] a = {"com.flurry.android.FlurryAgent", "com.flurry.android.ads.FlurryAdErrorType", "com.flurry.android.ads.FlurryAdNative", "com.flurry.android.ads.FlurryAdNativeAsset", "com.flurry.android.ads.FlurryAdNativeListener"};
    private static final String[] b = {"com.inmobi.ads.InMobiNative", "com.inmobi.sdk.InMobiSdk"};
    private static final String[] c = {"com.google.android.gms.ads.formats.NativeAdView"};

    public static boolean a(g gVar) {
        switch (gVar) {
            case AN:
                return true;
            case YAHOO:
                return a(a);
            case INMOBI:
                return a(b);
            case ADMOB:
                return a(c);
            default:
                return false;
        }
    }

    private static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean a(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!a(str)) {
                return false;
            }
        }
        return true;
    }
}
