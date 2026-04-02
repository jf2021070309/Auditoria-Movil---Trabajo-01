package com.amazon.aps.iva.wa;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazon.aiondec.api.model.DeviceCapabilityResponseMessage;
import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.DeviceCapabilityResponsePayload;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
/* compiled from: ApsIAdsWebviewManager.java */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.za.b {
    public final Gson g;
    public final s h;

    public d(Context context, WebView webView, s sVar) {
        super(context, webView);
        this.h = sVar;
        ((b) sVar).a.addJavascriptInterface(this, "__IAdsManager");
        this.g = w.c().b();
    }

    @Override // com.amazon.aps.iva.za.b
    public final void b() {
        LogUtils.i("ApsIAdsWebviewManager", this.g.toJson(new DeviceCapabilityResponseMessage(new DeviceCapabilityResponsePayload(new c()))));
    }

    @Override // com.amazon.aps.iva.za.b
    @JavascriptInterface
    public void send(String str) {
        Gson gson = this.g;
        try {
            LogUtils.d("ApsIAdsWebviewManager", "Received message from webview: %s", str);
            if (str.contains(Message.MessageType.RETRIEVE_DEVICE_CAPABILITIES.name())) {
                ((b) this.h).a(String.format("javascript:window.%s(%s);", "__dispatchAdsMessage", gson.toJson(gson.toJson(new DeviceCapabilityResponseMessage(new DeviceCapabilityResponsePayload(new c()))))), null);
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    @Override // com.amazon.aps.iva.za.b
    public final void c() {
    }
}
