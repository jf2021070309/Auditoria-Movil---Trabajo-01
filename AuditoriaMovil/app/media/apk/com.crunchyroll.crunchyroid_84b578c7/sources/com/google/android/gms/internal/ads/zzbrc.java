package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbrc extends zzbfr {
    final /* synthetic */ zzbrd zza;

    public /* synthetic */ zzbrc(zzbrd zzbrdVar, zzbrb zzbrbVar) {
        this.zza = zzbrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfs
    public final void zze(zzbff zzbffVar) {
        zzbrd zzbrdVar = this.zza;
        zzbrd.zzd(zzbrdVar).onCustomFormatAdLoaded(zzbrd.zze(zzbrdVar, zzbffVar));
    }
}
