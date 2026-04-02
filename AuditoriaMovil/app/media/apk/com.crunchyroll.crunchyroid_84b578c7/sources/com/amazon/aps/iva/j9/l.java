package com.amazon.aps.iva.j9;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;
/* compiled from: ApiHelperForOMR1.java */
/* loaded from: classes.dex */
public final class l {
    public static void a(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.backToSafety(z);
    }

    public static Uri b() {
        Uri safeBrowsingPrivacyPolicyUrl;
        safeBrowsingPrivacyPolicyUrl = WebView.getSafeBrowsingPrivacyPolicyUrl();
        return safeBrowsingPrivacyPolicyUrl;
    }

    public static void c(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.proceed(z);
    }

    public static void d(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(SafeBrowsingResponse safeBrowsingResponse, boolean z) {
        safeBrowsingResponse.showInterstitial(z);
    }

    public static void f(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
