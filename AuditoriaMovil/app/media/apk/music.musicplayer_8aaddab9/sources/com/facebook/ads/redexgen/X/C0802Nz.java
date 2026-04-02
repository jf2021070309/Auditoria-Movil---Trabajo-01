package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Nz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0802Nz extends WebViewClient {
    public final /* synthetic */ O0 A00;

    public C0802Nz(O0 o0) {
        this.A00 = o0;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O0.A02(C04398z.A2V);
        return true;
    }
}
