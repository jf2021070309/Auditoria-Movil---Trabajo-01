package com.google.android.gms.internal.pal;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
abstract class zzafi {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzaby zzabyVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzaga zzagaVar) throws IOException;

    public final boolean zzq(Object obj, zzaeq zzaeqVar) throws IOException {
        int zzd = zzaeqVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zzh(obj, i, zzaeqVar.zzf());
                                return true;
                            }
                            throw zzadi.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i3 = 4 | (i << 3);
                    while (zzaeqVar.zzc() != Integer.MAX_VALUE && zzq(zzf, zzaeqVar)) {
                    }
                    if (i3 == zzaeqVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i, zzf);
                        return true;
                    }
                    throw zzadi.zzb();
                }
                zzk(obj, i, zzaeqVar.zzp());
                return true;
            }
            zzi(obj, i, zzaeqVar.zzk());
            return true;
        }
        zzl(obj, i, zzaeqVar.zzl());
        return true;
    }

    public abstract boolean zzr(zzaeq zzaeqVar);
}
