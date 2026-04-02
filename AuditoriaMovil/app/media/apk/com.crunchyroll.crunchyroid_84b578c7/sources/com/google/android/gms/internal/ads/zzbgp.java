package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgp extends zzbfr {
    final /* synthetic */ zzbgq zza;

    public /* synthetic */ zzbgp(zzbgq zzbgqVar, zzbgo zzbgoVar) {
        this.zza = zzbgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zze(zzbff zzbffVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbgq zzbgqVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbgqVar.zza;
        zzf = zzbgqVar.zzf(zzbffVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
