package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzes extends WebChromeClient {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzhy zzb;
    final /* synthetic */ List zzc;

    public zzes(zzet zzetVar, Context context, zzhy zzhyVar, List list) {
        this.zza = context;
        this.zzb = zzhyVar;
        this.zzc = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(this.zza);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        webView2.setWebViewClient(new zzer(this));
        message.sendToTarget();
        return true;
    }
}
