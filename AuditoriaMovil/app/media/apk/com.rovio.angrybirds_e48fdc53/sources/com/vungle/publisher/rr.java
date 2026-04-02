package com.vungle.publisher;

import android.webkit.WebView;
import com.vungle.publisher.iz;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.rz;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class rr {
    @Inject
    mv a;
    @Inject
    rb b;
    @Inject
    rz.a c;
    private x d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView, p pVar, boolean z, x xVar) {
        this.d = xVar;
        rz a = this.c.a(xVar);
        a.c();
        a.a(true);
        a.d();
        a.a(pVar, z);
        a.a(se.interstitial);
        try {
            a(webView, a.b(), true);
        } catch (JSONException e) {
            Logger.e(Logger.AD_TAG, "could not update mraid properties", e);
        }
    }

    public void a(WebView webView) {
        rz a = this.c.a(this.d);
        a.d();
        try {
            a(webView, a.b(), false);
        } catch (JSONException e) {
            Logger.e(Logger.AD_TAG, "could not update mraid dimensions", e);
        }
    }

    public void a(boolean z, WebView webView) {
        rz a = this.c.a(this.d);
        a.a(z);
        try {
            a(webView, a.b(), false);
        } catch (JSONException e) {
            Logger.e(Logger.AD_TAG, "could not update viewable properties", e);
        }
    }

    public void a(x xVar) {
        this.d = xVar;
    }

    public void a(WebView webView, boolean z) {
        this.b.b(webView, "incentivizedDialogResponse", String.valueOf(z));
    }

    public void b(WebView webView) {
        this.b.a(webView, "requestMRAIDClose", new String[0]);
    }

    void a(WebView webView, JSONObject jSONObject, boolean z) {
        this.b.b(webView, "notifyPropertiesChange", jSONObject.toString(), String.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView, iz.b bVar) {
        Logger.d(Logger.AD_TAG, "inject tokens into js and notify ready");
        JSONObject b = bVar.b();
        if (b.length() > 0) {
            String jSONObject = b.toString();
            Logger.v(Logger.AD_TAG, "tokens: " + jSONObject);
            this.b.b(webView, "notifyReadyEvent", jSONObject);
            return;
        }
        this.b.b(webView, "notifyReadyEvent", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(WebView webView) {
        this.b.b(webView, "notifyCommandComplete", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView, String str) {
        this.b.a(webView, "document.querySelector('" + str + "').play()");
    }
}
