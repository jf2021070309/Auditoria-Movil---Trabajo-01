package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
/* loaded from: classes2.dex */
final class s {
    private t a;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar) {
        this.a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.a.a;
    }
}
