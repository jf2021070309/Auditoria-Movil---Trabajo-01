package com.ironsource.sdk.c;

import android.webkit.JavascriptInterface;
/* loaded from: classes2.dex */
public final class b {
    private c a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
