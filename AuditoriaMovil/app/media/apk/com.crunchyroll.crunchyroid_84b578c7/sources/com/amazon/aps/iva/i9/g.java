package com.amazon.aps.iva.i9;

import android.net.Uri;
import android.webkit.WebView;
/* compiled from: WebViewCompat.java */
/* loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ int a = 0;

    /* compiled from: WebViewCompat.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: WebViewCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void onPostMessage(WebView webView, d dVar, Uri uri, boolean z, com.amazon.aps.iva.i9.a aVar);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }
}
