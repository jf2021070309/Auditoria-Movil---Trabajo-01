package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbgr implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbu zzb;
    final /* synthetic */ zzbgs zzc;

    public zzbgr(zzbgs zzbgsVar, AdManagerAdView adManagerAdView, zzbu zzbuVar) {
        this.zzc = zzbgsVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zzb(this.zzb)) {
            onAdManagerAdViewLoadedListener = this.zzc.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzbzo.zzj("Could not bind.");
    }
}
