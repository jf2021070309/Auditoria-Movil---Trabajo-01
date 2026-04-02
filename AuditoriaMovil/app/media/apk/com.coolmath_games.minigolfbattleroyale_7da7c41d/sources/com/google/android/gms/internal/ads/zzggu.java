package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzggu extends zzggw {
    private zzggu() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggu(zzggv zzggvVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final <L> List<L> zza(Object obj, long j) {
        zzggj zzggjVar = (zzggj) zzgiy.zzn(obj, j);
        if (zzggjVar.zza()) {
            return zzggjVar;
        }
        int size = zzggjVar.size();
        zzggj zze = zzggjVar.zze(size == 0 ? 10 : size + size);
        zzgiy.zzo(obj, j, zze);
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final void zzb(Object obj, long j) {
        ((zzggj) zzgiy.zzn(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzggj] */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final <E> void zzc(Object obj, Object obj2, long j) {
        zzggj<E> zzggjVar = (zzggj) zzgiy.zzn(obj, j);
        zzggj<E> zzggjVar2 = (zzggj) zzgiy.zzn(obj2, j);
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
        zzgiy.zzo(obj, j, zzggjVar2);
    }
}
