package com.vungle.publisher;

import android.webkit.WebView;
import java.lang.invoke.LambdaForm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final /* synthetic */ class rh implements Runnable {
    private final rg a;
    private final WebView b;
    private final String c;

    private rh(rg rgVar, WebView webView, String str) {
        this.a = rgVar;
        this.b = webView;
        this.c = str;
    }

    public static Runnable a(rg rgVar, WebView webView, String str) {
        return new rh(rgVar, webView, str);
    }

    @Override // java.lang.Runnable
    @LambdaForm.Hidden
    public void run() {
        this.a.a(this.b, this.c);
    }
}
