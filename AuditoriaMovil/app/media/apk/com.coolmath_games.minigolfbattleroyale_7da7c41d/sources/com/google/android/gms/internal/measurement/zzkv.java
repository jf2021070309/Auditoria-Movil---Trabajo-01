package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zzkv extends zzkw {
    private zzkv() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkv(zzkt zzktVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkw
    public final void zza(Object obj, long j) {
        ((zzkk) zzmr.zzn(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.measurement.zzkk] */
    @Override // com.google.android.gms.internal.measurement.zzkw
    public final <E> void zzb(Object obj, Object obj2, long j) {
        zzkk<E> zzkkVar = (zzkk) zzmr.zzn(obj, j);
        zzkk<E> zzkkVar2 = (zzkk) zzmr.zzn(obj2, j);
        int size = zzkkVar.size();
        int size2 = zzkkVar2.size();
        zzkk<E> zzkkVar3 = zzkkVar;
        zzkkVar3 = zzkkVar;
        if (size > 0 && size2 > 0) {
            boolean zza = zzkkVar.zza();
            zzkk<E> zzkkVar4 = zzkkVar;
            if (!zza) {
                zzkkVar4 = zzkkVar.zze(size2 + size);
            }
            zzkkVar4.addAll(zzkkVar2);
            zzkkVar3 = zzkkVar4;
        }
        if (size > 0) {
            zzkkVar2 = zzkkVar3;
        }
        zzmr.zzo(obj, j, zzkkVar2);
    }
}
