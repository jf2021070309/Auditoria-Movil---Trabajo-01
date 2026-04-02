package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
abstract class zzgio<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzght zzghtVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(B b, int i, long j);

    abstract void zzc(B b, int i, int i2);

    abstract void zzd(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(B b, int i, zzgex zzgexVar);

    abstract void zzf(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzg();

    abstract T zzh(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzj(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzk(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzo(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzp(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzq(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(T t, zzgfi zzgfiVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzn(B b, zzght zzghtVar) throws IOException {
        int zzc = zzghtVar.zzc();
        int i = zzc >>> 3;
        int i2 = zzc & 7;
        if (i2 == 0) {
            zzb(b, i, zzghtVar.zzh());
            return true;
        } else if (i2 == 1) {
            zzd(b, i, zzghtVar.zzj());
            return true;
        } else if (i2 == 2) {
            zze(b, i, zzghtVar.zzq());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzghtVar.zzk());
                    return true;
                }
                throw zzggm.zzi();
            }
            return false;
        } else {
            Object zzg = zzg();
            int i3 = 4 | (i << 3);
            while (zzghtVar.zzb() != Integer.MAX_VALUE && zzn(zzg, zzghtVar)) {
            }
            if (i3 != zzghtVar.zzc()) {
                throw zzggm.zzh();
            }
            zzh(zzg);
            zzf(b, i, zzg);
            return true;
        }
    }
}
