package com.vungle.warren.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.google.gson.JsonObject;
import com.vungle.warren.omsdk.WebViewObserver;
/* loaded from: classes2.dex */
public interface WebViewAPI {

    /* loaded from: classes2.dex */
    public interface MRAIDDelegate {
        boolean processCommand(String str, JsonObject jsonObject);
    }

    /* loaded from: classes2.dex */
    public interface WebClientErrorHandler {
        void onReceivedError(String str, boolean z);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView webView, boolean z);
    }

    void notifyPropertiesChange(boolean z);

    void setAdVisibility(boolean z);

    void setConsentStatus(boolean z, String str, String str2, String str3, String str4);

    void setErrorHandler(WebClientErrorHandler webClientErrorHandler);

    void setMRAIDDelegate(MRAIDDelegate mRAIDDelegate);

    void setWebViewObserver(WebViewObserver webViewObserver);
}
