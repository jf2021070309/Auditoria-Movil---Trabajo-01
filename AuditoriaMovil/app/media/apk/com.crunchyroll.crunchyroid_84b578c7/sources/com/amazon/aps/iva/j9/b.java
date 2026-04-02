package com.amazon.aps.iva.j9;

import android.net.Uri;
import android.webkit.WebResourceRequest;
/* compiled from: ApiHelperForLollipop.java */
/* loaded from: classes.dex */
public final class b {
    public static Uri a(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
