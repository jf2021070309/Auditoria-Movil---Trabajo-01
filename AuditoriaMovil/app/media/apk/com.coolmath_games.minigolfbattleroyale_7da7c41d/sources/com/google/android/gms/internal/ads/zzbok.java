package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbok extends zzbnn {
    final /* synthetic */ zzbol zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbok(zzbol zzbolVar, zzboi zzboiVar) {
        this.zza = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(zzbnb zzbnbVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        onCustomTemplateAdLoadedListener = this.zza.zza;
        zzf = this.zza.zzf(zzbnbVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
