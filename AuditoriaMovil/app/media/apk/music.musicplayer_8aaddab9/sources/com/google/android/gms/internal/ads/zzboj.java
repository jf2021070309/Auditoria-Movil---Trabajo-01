package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzboj extends zzbnk {
    public final /* synthetic */ zzbol zza;

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
