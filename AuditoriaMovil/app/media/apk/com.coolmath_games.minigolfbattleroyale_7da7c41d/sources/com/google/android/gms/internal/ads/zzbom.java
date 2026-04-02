package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbom implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbfn zzb;
    final /* synthetic */ zzbon zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbom(zzbon zzbonVar, AdManagerAdView adManagerAdView, zzbfn zzbfnVar) {
        this.zzc = zzbonVar;
        this.zza = adManagerAdView;
        this.zzb = zzbfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (this.zza.zza(this.zzb)) {
            onAdManagerAdViewLoadedListener = this.zzc.zza;
            onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzcgt.zzi("Could not bind.");
    }
}
