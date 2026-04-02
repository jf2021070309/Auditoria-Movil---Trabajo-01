package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbyw extends zzbnk {
    final /* synthetic */ zzbyy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbyw(zzbyy zzbyyVar, zzbyv zzbyvVar) {
        this.zza = zzbyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbnb zzbnbVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        onCustomClickListener = this.zza.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = this.zza.zzb;
        zzf = this.zza.zzf(zzbnbVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
