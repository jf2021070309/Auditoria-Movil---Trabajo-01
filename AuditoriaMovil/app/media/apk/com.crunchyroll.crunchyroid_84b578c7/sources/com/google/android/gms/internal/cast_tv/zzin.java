package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzin extends zzip {
    public /* synthetic */ zzin(zzim zzimVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzip
    public final void zza(Object obj, long j) {
        ((zzib) zzko.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzip
    public final void zzb(Object obj, Object obj2, long j) {
        zzib zzibVar = (zzib) zzko.zzf(obj, j);
        zzib zzibVar2 = (zzib) zzko.zzf(obj2, j);
        int size = zzibVar.size();
        int size2 = zzibVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzibVar.zzc()) {
                zzibVar = zzibVar.zzd(size2 + size);
            }
            zzibVar.addAll(zzibVar2);
        }
        if (size > 0) {
            zzibVar2 = zzibVar;
        }
        zzko.zzs(obj, j, zzibVar2);
    }

    private zzin() {
        super(null);
    }
}
