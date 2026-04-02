package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.cx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1287cx implements C7M {
    public final C1W A00;
    public final InterfaceC02591l A01;
    public final C7U A02;
    public final C1046Xo A03;
    public final boolean A04;

    public C1287cx(C1046Xo c1046Xo, InterfaceC02591l interfaceC02591l, C7U c7u, C1W c1w, boolean z) {
        this.A03 = c1046Xo;
        this.A01 = interfaceC02591l;
        this.A02 = c7u;
        this.A00 = c1w;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C02601m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == C1X.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            A0E = this.A02.A0P(this.A00.A0E());
        }
        this.A00.A0H(A0E);
        this.A01.ABk();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAF() {
        if (this.A04) {
            this.A01.ABj(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAM() {
        A01(true);
    }
}
