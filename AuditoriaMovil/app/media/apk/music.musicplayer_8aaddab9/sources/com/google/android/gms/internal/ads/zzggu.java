package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes.dex */
public final class zzggu extends zzggw {
    private zzggu() {
        super(null);
    }

    public /* synthetic */ zzggu(zzggv zzggvVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final <L> List<L> zza(Object obj, long j2) {
        zzggj zzggjVar = (zzggj) zzgiy.zzn(obj, j2);
        if (zzggjVar.zza()) {
            return zzggjVar;
        }
        int size = zzggjVar.size();
        zzggj zze = zzggjVar.zze(size == 0 ? 10 : size + size);
        zzgiy.zzo(obj, j2, zze);
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final void zzb(Object obj, long j2) {
        ((zzggj) zzgiy.zzn(obj, j2)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final <E> void zzc(Object obj, Object obj2, long j2) {
        zzggj<E> zzggjVar = (zzggj) zzgiy.zzn(obj, j2);
        zzggj<E> zzggjVar2 = (zzggj) zzgiy.zzn(obj2, j2);
        int size = zzggjVar.size();
        int size2 = zzggjVar2.size();
        zzggj<E> zzggjVar3 = zzggjVar;
        zzggjVar3 = zzggjVar;
        if (size > 0 && size2 > 0) {
            boolean zza = zzggjVar.zza();
            zzggj<E> zzggjVar4 = zzggjVar;
            if (!zza) {
                zzggjVar4 = zzggjVar.zze(size2 + size);
            }
            zzggjVar4.addAll(zzggjVar2);
            zzggjVar3 = zzggjVar4;
        }
        if (size > 0) {
            zzggjVar2 = zzggjVar3;
        }
        zzgiy.zzo(obj, j2, zzggjVar2);
    }
}
