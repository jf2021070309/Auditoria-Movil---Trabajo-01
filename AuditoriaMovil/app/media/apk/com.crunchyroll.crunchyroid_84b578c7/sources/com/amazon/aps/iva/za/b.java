package com.amazon.aps.iva.za;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazon.aiondec.api.model.DeviceCapabilityResponseMessage;
import com.amazon.aiondec.api.model.Message;
import com.amazon.aiondec.api.model.payload.DeviceCapabilityResponsePayload;
import com.amazon.aps.iva.f1.d0;
import com.amazon.aps.iva.ra.c;
import com.amazon.aps.iva.sa.f;
import com.amazon.aps.iva.x2.u;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
/* compiled from: IAdsWebviewManager.java */
/* loaded from: classes.dex */
public class b {
    public final Context b;
    public final WeakReference<WebView> e;
    public final Gson a = new Gson();
    public boolean c = false;
    public boolean f = false;
    public c d = null;

    public b(Context context, WebView webView) {
        this.e = new WeakReference<>(webView);
        this.b = context;
        webView.addJavascriptInterface(this, "__IAdsManager");
    }

    public final void a(String str) {
        String format = String.format("javascript:window.%s(%s);", "__dispatchAdsMessage", this.a.toJson(str));
        WebView webView = this.e.get();
        if (webView == null) {
            return;
        }
        webView.post(new u(7, format, webView));
    }

    public void b() {
        Intent intent;
        if (this.d == null) {
            f fVar = new f();
            Context context = this.b;
            if (context.checkCallingOrSelfPermission("amazon.speech.permission.SEND_ALEXA_DIRECTIVE") == 0) {
                intent = new Intent("com.amazon.aiondec.service.AIOnDeCService.BIND");
            } else if (context.checkCallingOrSelfPermission("com.amazon.aiondec.ALEXA_INTERACTIVE_ADS") == 0) {
                intent = new Intent("com.amazon.aiondec.service.AIOnDeCService.BIND_3P");
            } else {
                throw new UnsupportedOperationException("Client type is neither 1P nor 3P");
            }
            this.d = new c(context, fVar, intent);
        }
        c cVar = this.d;
        d0 d0Var = new d0(this, 6);
        if (cVar.i == null) {
            com.amazon.aps.iva.ra.a aVar = new com.amazon.aps.iva.ra.a(d0Var);
            cVar.i = aVar;
            cVar.b.a(aVar);
        }
    }

    public void c() {
        c cVar = this.d;
        if (cVar != null && this.f) {
            cVar.b();
            this.c = false;
            this.f = false;
            this.d = null;
        }
        this.e.clear();
    }

    @JavascriptInterface
    public void send(String str) {
        com.amazon.aps.iva.sa.c cVar;
        try {
            if (str.contains(Message.MessageType.RETRIEVE_DEVICE_CAPABILITIES.name()) && (!this.d.c() || !this.c)) {
                a(this.a.toJson(new DeviceCapabilityResponseMessage(new DeviceCapabilityResponsePayload(ImmutableList.of()))));
            } else if (this.d.c() && this.c) {
                c cVar2 = this.d;
                cVar2.getClass();
                try {
                    cVar2.a().a(str);
                    cVar = com.amazon.aps.iva.sa.c.SUCCESS;
                } catch (RemoteException unused) {
                    cVar = com.amazon.aps.iva.sa.c.REMOTE_EXCEPTION;
                }
                if (cVar != com.amazon.aps.iva.sa.c.SUCCESS) {
                    String.format("Could not send message: %d", cVar);
                }
            } else {
                String.format("Service is not ready or handler is not registered. isServiceReady: %b, isHandlerRegistered: %b", Boolean.valueOf(this.d.c()), Boolean.valueOf(this.c));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
