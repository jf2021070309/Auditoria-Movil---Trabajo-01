package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgky<T> implements zzgla<T> {
    private zzgln<T> zza;

    public static <T> void zza(zzgln<T> zzglnVar, zzgln<T> zzglnVar2) {
        zzgky zzgkyVar = (zzgky) zzglnVar;
        if (zzgkyVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgkyVar.zza = zzglnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        zzgln<T> zzglnVar = this.zza;
        if (zzglnVar != null) {
            return zzglnVar.zzb();
        }
        throw new IllegalStateException();
    }
}
