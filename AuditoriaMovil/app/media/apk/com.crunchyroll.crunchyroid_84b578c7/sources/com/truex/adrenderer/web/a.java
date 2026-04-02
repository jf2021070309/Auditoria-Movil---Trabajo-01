package com.truex.adrenderer.web;

import android.webkit.WebChromeClient;
/* loaded from: classes4.dex */
public final class a extends WebChromeClient {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage r3) {
        /*
            r2 = this;
            int[] r0 = com.truex.adrenderer.web.TruexWebView.a.a
            android.webkit.ConsoleMessage$MessageLevel r1 = r3.messageLevel()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L19
            r1 = 3
            if (r0 == r1) goto L1c
            goto L1f
        L16:
            r3.message()
        L19:
            r3.message()
        L1c:
            r3.message()
        L1f:
            r3.message()
            boolean r3 = super.onConsoleMessage(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truex.adrenderer.web.a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }
}
