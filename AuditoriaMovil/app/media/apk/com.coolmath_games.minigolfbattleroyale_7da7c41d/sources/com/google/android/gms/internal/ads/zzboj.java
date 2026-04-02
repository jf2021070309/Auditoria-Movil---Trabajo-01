package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzboj extends zzbnk {
    final /* synthetic */ zzbol zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzboj(zzbol zzbolVar, zzboi zzboiVar) {
        this.zza = zzbolVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnl
    public final void zze(zzbnb zzbnbVar, String str) {
        if (zzbol.zzb(this.zza) == null) {
            return;
        }
        zzbol.zzb(this.zza).onCustomClick(zzbol.zze(this.zza, zzbnbVar), str);
    }
}
