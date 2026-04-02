package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzkp extends zzkq {
    private zzkp() {
        super(null);
    }

    public /* synthetic */ zzkp(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j2) {
        ((zzke) zzml.zzf(obj, j2)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzkq
    public final <E> void zzb(Object obj, Object obj2, long j2) {
        zzke<E> zzkeVar = (zzke) zzml.zzf(obj, j2);
        zzke<E> zzkeVar2 = (zzke) zzml.zzf(obj2, j2);
        int size = zzkeVar.size();
        int size2 = zzkeVar2.size();
        zzke<E> zzkeVar3 = zzkeVar;
        zzkeVar3 = zzkeVar;
        if (size > 0 && size2 > 0) {
            boolean zzc = zzkeVar.zzc();
            zzke<E> zzkeVar4 = zzkeVar;
            if (!zzc) {
                zzkeVar4 = zzkeVar.zzd(size2 + size);
            }
            zzkeVar4.addAll(zzkeVar2);
            zzkeVar3 = zzkeVar4;
        }
        if (size > 0) {
            zzkeVar2 = zzkeVar3;
        }
        zzml.zzs(obj, j2, zzkeVar2);
    }
}
