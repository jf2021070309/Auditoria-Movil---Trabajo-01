package com.amazon.aps.iva.wa;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.util.LogUtils;
/* compiled from: ApsIvaWebChromeClient.java */
/* loaded from: classes.dex */
public final class n extends WebChromeClient {
    public final com.amazon.aps.iva.xa.b a;

    public n(com.amazon.aps.iva.xa.b bVar) {
        this.a = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (ConsoleMessage.MessageLevel.ERROR == consoleMessage.messageLevel()) {
            LogUtils.e("n", String.format("[%s] %s -- From line %s of %s", consoleMessage.messageLevel(), consoleMessage.message(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId()));
            this.a.a(new MetricEvent("apsIva-webViewFailureCounter", Severity.ERROR));
        } else {
            LogUtils.d("n", "[%s] %s -- From line %s of %s", String.valueOf(consoleMessage.messageLevel()), consoleMessage.message(), String.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId());
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
