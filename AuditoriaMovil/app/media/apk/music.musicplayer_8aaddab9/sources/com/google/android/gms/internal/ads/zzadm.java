package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzadm extends zzaiq {
    private final int zza;
    private final zzix zzb;

    public zzadm(boolean z, zzix zzixVar, byte[] bArr) {
        this.zzb = zzixVar;
        this.zza = zzixVar.zza();
    }

    private final int zzs(int i2, boolean z) {
        if (z) {
            return this.zzb.zzb(i2);
        }
        if (i2 >= this.zza - 1) {
            return -1;
        }
        return i2 + 1;
    }

    private final int zzx(int i2, boolean z) {
        if (z) {
            return this.zzb.zzc(i2);
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzb(int i2, int i3, boolean z) {
        int zzm = zzm(i2);
        int zzq = zzq(zzm);
        int zzb = zzo(zzm).zzb(i2 - zzq, i3 == 2 ? 0 : i3, z);
        if (zzb != -1) {
            return zzq + zzb;
        }
        int zzs = zzs(zzm, z);
        while (zzs != -1 && zzo(zzs).zzt()) {
            zzs = zzs(zzs, z);
        }
        if (zzs != -1) {
            return zzo(zzs).zze(z) + zzq(zzs);
        } else if (i3 == 2) {
            return zze(z);
        } else {
            return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzc(int i2, int i3, boolean z) {
        int zzm = zzm(i2);
        int zzq = zzq(zzm);
        int zzc = zzo(zzm).zzc(i2 - zzq, 0, false);
        if (zzc != -1) {
            return zzq + zzc;
        }
        int zzx = zzx(zzm, false);
        while (zzx != -1 && zzo(zzx).zzt()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzo(zzx).zzd(false) + zzq(zzx);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzd(boolean z) {
        int i2 = this.zza;
        if (i2 == 0) {
            return -1;
        }
        int zzd = z ? this.zzb.zzd() : i2 - 1;
        while (zzo(zzd).zzt()) {
            zzd = zzx(zzd, z);
            if (zzd == -1) {
                return -1;
            }
        }
        return zzo(zzd).zzd(z) + zzq(zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zze(boolean z) {
        if (this.zza == 0) {
            return -1;
        }
        int zze = z ? this.zzb.zze() : 0;
        while (zzo(zze).zzt()) {
            zze = zzs(zze, z);
            if (zze == -1) {
                return -1;
            }
        }
        return zzo(zze).zze(z) + zzq(zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzaip zzf(int i2, zzaip zzaipVar, long j2) {
        int zzm = zzm(i2);
        int zzq = zzq(zzm);
        int zzp = zzp(zzm);
        zzo(zzm).zzf(i2 - zzq, zzaipVar, j2);
        Object zzr = zzr(zzm);
        if (!zzaip.zza.equals(zzaipVar.zzb)) {
            zzr = Pair.create(zzr, zzaipVar.zzb);
        }
        zzaipVar.zzb = zzr;
        zzaipVar.zzn += zzp;
        zzaipVar.zzo += zzp;
        return zzaipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzain zzh(int i2, zzain zzainVar, boolean z) {
        int zzl = zzl(i2);
        int zzq = zzq(zzl);
        zzo(zzl).zzh(i2 - zzp(zzl), zzainVar, z);
        zzainVar.zzc += zzq;
        if (z) {
            Object zzr = zzr(zzl);
            Object obj = zzainVar.zzb;
            Objects.requireNonNull(obj);
            zzainVar.zzb = Pair.create(zzr, obj);
        }
        return zzainVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzi(Object obj) {
        int zzi;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzn = zzn(obj2);
            if (zzn == -1 || (zzi = zzo(zzn).zzi(obj3)) == -1) {
                return -1;
            }
            return zzp(zzn) + zzi;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final Object zzj(int i2) {
        int zzl = zzl(i2);
        return Pair.create(zzr(zzl), zzo(zzl).zzj(i2 - zzp(zzl)));
    }

    public abstract int zzl(int i2);

    public abstract int zzm(int i2);

    public abstract int zzn(Object obj);

    public abstract zzaiq zzo(int i2);

    public abstract int zzp(int i2);

    public abstract int zzq(int i2);

    public abstract Object zzr(int i2);

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzain zzy(Object obj, zzain zzainVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzn = zzn(obj2);
        int zzq = zzq(zzn);
        zzo(zzn).zzy(obj3, zzainVar);
        zzainVar.zzc += zzq;
        zzainVar.zzb = obj;
        return zzainVar;
    }
}
