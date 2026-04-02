package com.amazon.aps.iva.j9;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: WebViewProviderFactory.java */
/* loaded from: classes.dex */
public interface h0 {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    String[] d();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
