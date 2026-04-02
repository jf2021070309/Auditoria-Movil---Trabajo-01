package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaxa implements Runnable {
    final ValueCallback<String> zza = new zzawz(this);
    final /* synthetic */ zzaws zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzaxc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxa(zzaxc zzaxcVar, zzaws zzawsVar, WebView webView, boolean z) {
        this.zze = zzaxcVar;
        this.zzb = zzawsVar;
        this.zzc = webView;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                ((zzawz) this.zza).onReceiveValue("");
            }
        }
    }
}
