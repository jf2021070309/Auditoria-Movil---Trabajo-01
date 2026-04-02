package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfhg implements Runnable {
    final /* synthetic */ zzfhh zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhg(zzfhh zzfhhVar) {
        WebView webView;
        this.zza = zzfhhVar;
        webView = this.zza.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
