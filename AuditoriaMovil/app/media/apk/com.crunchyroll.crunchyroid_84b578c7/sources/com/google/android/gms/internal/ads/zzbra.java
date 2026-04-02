package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbra extends zzbfo {
    final /* synthetic */ zzbrd zza;

    public /* synthetic */ zzbra(zzbrd zzbrdVar, zzbqz zzbqzVar) {
        this.zza = zzbrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final void zze(zzbff zzbffVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbrd zzbrdVar = this.zza;
        onCustomClickListener = zzbrdVar.zzb;
        if (onCustomClickListener != null) {
            onCustomClickListener2 = zzbrdVar.zzb;
            zzf = zzbrdVar.zzf(zzbffVar);
            onCustomClickListener2.onCustomClick(zzf, str);
        }
    }
}
