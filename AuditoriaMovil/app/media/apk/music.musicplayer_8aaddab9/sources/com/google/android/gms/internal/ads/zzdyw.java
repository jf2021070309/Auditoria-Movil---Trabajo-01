package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zzdyw implements zzgla<zzfsm<String>> {
    private final zzgln<zzfes> zza;
    private final zzgln<Context> zzb;

    public zzdyw(zzgln<zzfes> zzglnVar, zzgln<Context> zzglnVar2) {
        this.zza = zzglnVar;
        this.zzb = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzk = com.google.android.gms.ads.internal.zzt.zze().zzk(this.zzb.zzb());
        zzfem zzfemVar = zzfem.WEBVIEW_COOKIE;
        return zzfed.zzb(new Callable(zzk) { // from class: com.google.android.gms.internal.ads.zzdys
            private final CookieManager zza;

            {
                this.zza = zzk;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzbet.zzc().zzc(zzbjl.zzaz));
            }
        }, zzfemVar, this.zza.zzb()).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzdyt.zza).zzi();
    }
}
