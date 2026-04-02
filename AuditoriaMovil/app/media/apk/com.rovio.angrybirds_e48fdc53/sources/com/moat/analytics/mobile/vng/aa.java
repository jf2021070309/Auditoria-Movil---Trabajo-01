package com.moat.analytics.mobile.vng;

import android.webkit.WebView;
/* loaded from: classes2.dex */
class aa extends b implements WebAdTracker {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(WebView webView) {
        super(webView, false, false);
        p.a(3, "WebAdTracker", this, "In initialization method.");
        super.a(webView);
        p.a("[SUCCESS] ", a() + " created for " + e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.moat.analytics.mobile.vng.b
    public String a() {
        return "WebAdTracker";
    }
}
