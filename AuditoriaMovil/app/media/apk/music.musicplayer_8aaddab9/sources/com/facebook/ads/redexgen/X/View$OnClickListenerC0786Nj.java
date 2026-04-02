package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;
/* renamed from: com.facebook.ads.redexgen.X.Nj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0786Nj implements View.OnClickListener {
    public final /* synthetic */ C0789Nm A00;

    public View$OnClickListenerC0786Nj(C0789Nm c0789Nm) {
        this.A00 = c0789Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
