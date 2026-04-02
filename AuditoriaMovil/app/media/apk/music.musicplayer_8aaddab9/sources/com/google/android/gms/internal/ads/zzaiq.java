package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzaiq {
    public static final zzaiq zzc = new zzail();
    public static final zzadw<zzaiq> zzd = zzaik.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaiq) {
            zzaiq zzaiqVar = (zzaiq) obj;
            if (zzaiqVar.zza() == zza() && zzaiqVar.zzg() == zzg()) {
                zzaip zzaipVar = new zzaip();
                zzain zzainVar = new zzain();
                zzaip zzaipVar2 = new zzaip();
                zzain zzainVar2 = new zzain();
                for (int i2 = 0; i2 < zza(); i2++) {
                    if (!zzf(i2, zzaipVar, 0L).equals(zzaiqVar.zzf(i2, zzaipVar2, 0L))) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < zzg(); i3++) {
                    if (!zzh(i3, zzainVar, true).equals(zzaiqVar.zzh(i3, zzainVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        zzaip zzaipVar = new zzaip();
        zzain zzainVar = new zzain();
        int zza = zza() + 217;
        for (int i2 = 0; i2 < zza(); i2++) {
            zza = (zza * 31) + zzf(i2, zzaipVar, 0L).hashCode();
        }
        int zzg = zzg() + (zza * 31);
        for (int i3 = 0; i3 < zzg(); i3++) {
            zzg = (zzg * 31) + zzh(i3, zzainVar, true).hashCode();
        }
        return zzg;
    }

    public abstract int zza();

    public int zzb(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == zzd(z)) {
                return -1;
            }
            return i2 + 1;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return i2 == zzd(z) ? zze(z) : i2 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i2;
        }
    }

    public int zzc(int i2, int i3, boolean z) {
        if (i2 == zze(false)) {
            return -1;
        }
        return i2 - 1;
    }

    public int zzd(boolean z) {
        if (zzt()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zze(boolean z) {
        return zzt() ? -1 : 0;
    }

    public abstract zzaip zzf(int i2, zzaip zzaipVar, long j2);

    public abstract int zzg();

    public abstract zzain zzh(int i2, zzain zzainVar, boolean z);

    public abstract int zzi(Object obj);

    public abstract Object zzj(int i2);

    public final boolean zzt() {
        return zza() == 0;
    }

    public final int zzu(int i2, zzain zzainVar, zzaip zzaipVar, int i3, boolean z) {
        int i4 = zzh(i2, zzainVar, false).zzc;
        if (zzf(i4, zzaipVar, 0L).zzo == i2) {
            int zzb = zzb(i4, i3, z);
            if (zzb == -1) {
                return -1;
            }
            return zzf(zzb, zzaipVar, 0L).zzn;
        }
        return i2 + 1;
    }

    public final Pair<Object, Long> zzv(zzaip zzaipVar, zzain zzainVar, int i2, long j2) {
        Pair<Object, Long> zzw = zzw(zzaipVar, zzainVar, i2, j2, 0L);
        Objects.requireNonNull(zzw);
        return zzw;
    }

    public final Pair<Object, Long> zzw(zzaip zzaipVar, zzain zzainVar, int i2, long j2, long j3) {
        zzakt.zzc(i2, 0, zza());
        zzf(i2, zzaipVar, j3);
        if (j2 == -9223372036854775807L) {
            long j4 = zzaipVar.zzl;
            j2 = 0;
        }
        int i3 = zzaipVar.zzn;
        zzh(i3, zzainVar, false);
        while (i3 < zzaipVar.zzo) {
            long j5 = zzainVar.zze;
            if (j2 == 0) {
                break;
            }
            int i4 = i3 + 1;
            long j6 = zzh(i4, zzainVar, false).zze;
            if (j2 < 0) {
                break;
            }
            i3 = i4;
        }
        zzh(i3, zzainVar, true);
        long j7 = zzainVar.zze;
        long j8 = zzainVar.zzd;
        if (j8 != -9223372036854775807L) {
            j2 = Math.min(j2, j8 - 1);
        }
        long max = Math.max(0L, j2);
        if (max == 9) {
            Log.e("XXX", "YYY");
        }
        Object obj = zzainVar.zzb;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzain zzy(Object obj, zzain zzainVar) {
        return zzh(zzi(obj), zzainVar, true);
    }
}
