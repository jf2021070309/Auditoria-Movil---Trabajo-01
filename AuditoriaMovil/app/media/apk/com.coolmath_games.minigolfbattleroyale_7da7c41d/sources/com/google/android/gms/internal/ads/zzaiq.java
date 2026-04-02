package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
                for (int i = 0; i < zza(); i++) {
                    if (!zzf(i, zzaipVar, 0L).equals(zzaiqVar.zzf(i, zzaipVar2, 0L))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < zzg(); i2++) {
                    if (!zzh(i2, zzainVar, true).equals(zzaiqVar.zzh(i2, zzainVar2, true))) {
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
        for (int i = 0; i < zza(); i++) {
            zza = (zza * 31) + zzf(i, zzaipVar, 0L).hashCode();
        }
        int zzg = (zza * 31) + zzg();
        for (int i2 = 0; i2 < zzg(); i2++) {
            zzg = (zzg * 31) + zzh(i2, zzainVar, true).hashCode();
        }
        return zzg;
    }

    public abstract int zza();

    public int zzb(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzd(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == zzd(z) ? zze(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public int zzc(int i, int i2, boolean z) {
        if (i == zze(false)) {
            return -1;
        }
        return i - 1;
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

    public abstract zzaip zzf(int i, zzaip zzaipVar, long j);

    public abstract int zzg();

    public abstract zzain zzh(int i, zzain zzainVar, boolean z);

    public abstract int zzi(Object obj);

    public abstract Object zzj(int i);

    public final boolean zzt() {
        return zza() == 0;
    }

    public final int zzu(int i, zzain zzainVar, zzaip zzaipVar, int i2, boolean z) {
        int i3 = zzh(i, zzainVar, false).zzc;
        if (zzf(i3, zzaipVar, 0L).zzo == i) {
            int zzb = zzb(i3, i2, z);
            if (zzb == -1) {
                return -1;
            }
            return zzf(zzb, zzaipVar, 0L).zzn;
        }
        return i + 1;
    }

    public final Pair<Object, Long> zzv(zzaip zzaipVar, zzain zzainVar, int i, long j) {
        Pair<Object, Long> zzw = zzw(zzaipVar, zzainVar, i, j, 0L);
        if (zzw != null) {
            return zzw;
        }
        throw null;
    }

    public final Pair<Object, Long> zzw(zzaip zzaipVar, zzain zzainVar, int i, long j, long j2) {
        zzakt.zzc(i, 0, zza());
        zzf(i, zzaipVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzaipVar.zzl;
            j = 0;
        }
        int i2 = zzaipVar.zzn;
        zzh(i2, zzainVar, false);
        while (i2 < zzaipVar.zzo) {
            long j4 = zzainVar.zze;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzh(i4, zzainVar, false).zze;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzh(i2, zzainVar, true);
        long j6 = zzainVar.zze;
        long j7 = zzainVar.zzd;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        if (max == 9) {
            Log.e("XXX", "YYY");
        }
        Object obj = zzainVar.zzb;
        if (obj != null) {
            return Pair.create(obj, Long.valueOf(max));
        }
        throw null;
    }

    public zzain zzy(Object obj, zzain zzainVar) {
        return zzh(zzi(obj), zzainVar, true);
    }
}
