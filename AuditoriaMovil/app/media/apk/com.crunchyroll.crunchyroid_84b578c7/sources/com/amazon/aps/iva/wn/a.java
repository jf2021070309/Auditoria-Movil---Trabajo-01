package com.amazon.aps.iva.wn;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrStoreWebChromeClient.kt */
/* loaded from: classes2.dex */
public final class a extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        j.f(consoleMessage, "consoleMessage");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        c0515a.a(e.f(com.amazon.aps.iva.n4.a.b("Store WebView Console: ", message, " at ", sourceId, " ["), consoleMessage.lineNumber(), "]"), new Object[0]);
        return true;
    }
}
