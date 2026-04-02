package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
abstract class zzahj {
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

    public abstract void zzk(Object obj, int i, zzadr zzadrVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzaib zzaibVar) throws IOException;

    public final boolean zzq(Object obj, zzagk zzagkVar) throws IOException {
        int zzd = zzagkVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zzh(obj, i, zzagkVar.zzf());
                                return true;
                            }
                            throw zzafc.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i3 = i << 3;
                    while (zzagkVar.zzc() != Integer.MAX_VALUE && zzq(zzf, zzagkVar)) {
                    }
                    if ((4 | i3) == zzagkVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i, zzf);
                        return true;
                    }
                    throw zzafc.zzb();
                }
                zzk(obj, i, zzagkVar.zzp());
                return true;
            }
            zzi(obj, i, zzagkVar.zzk());
            return true;
        }
        zzl(obj, i, zzagkVar.zzl());
        return true;
    }

    public abstract boolean zzr(zzagk zzagkVar);
}
