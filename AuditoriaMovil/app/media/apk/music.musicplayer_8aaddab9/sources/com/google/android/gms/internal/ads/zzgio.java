package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class zzgio<T, B> {
    public abstract boolean zza(zzght zzghtVar);

    public abstract void zzb(B b2, int i2, long j2);

    public abstract void zzc(B b2, int i2, int i3);

    public abstract void zzd(B b2, int i2, long j2);

    public abstract void zze(B b2, int i2, zzgex zzgexVar);

    public abstract void zzf(B b2, int i2, T t);

    public abstract B zzg();

    public abstract T zzh(B b2);

    public abstract void zzi(Object obj, T t);

    public abstract T zzj(Object obj);

    public abstract B zzk(Object obj);

    public abstract void zzl(Object obj, B b2);

    public abstract void zzm(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzn(B b2, zzght zzghtVar) throws IOException {
        int zzc = zzghtVar.zzc();
        int i2 = zzc >>> 3;
        int i3 = zzc & 7;
        if (i3 == 0) {
            zzb(b2, i2, zzghtVar.zzh());
            return true;
        } else if (i3 == 1) {
            zzd(b2, i2, zzghtVar.zzj());
            return true;
        } else if (i3 == 2) {
            zze(b2, i2, zzghtVar.zzq());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    zzc(b2, i2, zzghtVar.zzk());
                    return true;
                }
                throw zzggm.zzi();
            }
            return false;
        } else {
            Object zzg = zzg();
            int i4 = 4 | (i2 << 3);
            while (zzghtVar.zzb() != Integer.MAX_VALUE && zzn(zzg, zzghtVar)) {
            }
            if (i4 == zzghtVar.zzc()) {
                zzh(zzg);
                zzf(b2, i2, zzg);
                return true;
            }
            throw zzggm.zzh();
        }
    }

    public abstract T zzo(T t, T t2);

    public abstract int zzp(T t);

    public abstract int zzq(T t);

    public abstract void zzr(T t, zzgfi zzgfiVar) throws IOException;
}
