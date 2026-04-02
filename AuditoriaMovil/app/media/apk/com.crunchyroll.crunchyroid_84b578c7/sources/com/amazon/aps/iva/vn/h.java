package com.amazon.aps.iva.vn;

import android.webkit.WebView;
import com.amazon.aps.iva.e.m;
/* compiled from: CrStoreFragment.kt */
/* loaded from: classes2.dex */
public final class h extends m {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WebView webView, g gVar) {
        super(true);
        this.a = webView;
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.e.m
    public final void handleOnBackPressed() {
        WebView webView = this.a;
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            this.b.requireActivity().finish();
        }
    }
}
