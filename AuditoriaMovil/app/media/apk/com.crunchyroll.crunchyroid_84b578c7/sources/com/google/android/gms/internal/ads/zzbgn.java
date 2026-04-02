package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbgn extends zzbfo {
    final /* synthetic */ zzbgq zza;

    public /* synthetic */ zzbgn(zzbgq zzbgqVar, zzbgm zzbgmVar) {
        this.zza = zzbgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final void zze(zzbff zzbffVar, String str) {
        zzbgq zzbgqVar = this.zza;
        if (zzbgq.zza(zzbgqVar) == null) {
            return;
        }
        zzbgq.zza(zzbgqVar).onCustomClick(zzbgq.zzc(zzbgqVar, zzbffVar), str);
    }
}
