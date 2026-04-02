package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes.dex */
public final class zzbf extends WebViewClient {
    private final /* synthetic */ zzbe zza;

    private zzbf(zzbe zzbeVar) {
        this.zza = zzbeVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        boolean zza;
        zzbj zzbjVar;
        zzbe zzbeVar = this.zza;
        zza = zzbe.zza(str);
        if (zza) {
            zzbjVar = this.zza.zzb;
            zzbjVar.zza(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        zzbj unused;
        z = this.zza.zzc;
        if (z) {
            return;
        }
        unused = this.zza.zzb;
        zzbe.zza(this.zza, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        zzbj zzbjVar;
        zzbjVar = this.zza.zzb;
        zzbjVar.zza(i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean zza;
        zzbj zzbjVar;
        String uri = webResourceRequest.getUrl().toString();
        zzbe zzbeVar = this.zza;
        zza = zzbe.zza(uri);
        if (zza) {
            zzbjVar = this.zza.zzb;
            zzbjVar.zza(uri);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zza;
        zzbj zzbjVar;
        zzbe zzbeVar = this.zza;
        zza = zzbe.zza(str);
        if (zza) {
            zzbjVar = this.zza.zzb;
            zzbjVar.zza(str);
            return true;
        }
        return false;
    }
}
