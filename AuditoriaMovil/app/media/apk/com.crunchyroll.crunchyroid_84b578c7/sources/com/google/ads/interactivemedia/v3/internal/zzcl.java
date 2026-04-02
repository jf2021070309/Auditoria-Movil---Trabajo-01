package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzcl implements Runnable {
    final /* synthetic */ zzcm zza;
    private final WebView zzb;

    public zzcl(zzcm zzcmVar) {
        WebView webView;
        this.zza = zzcmVar;
        webView = zzcmVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
