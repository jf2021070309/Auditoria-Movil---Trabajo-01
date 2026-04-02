package com.google.android.gms.internal.ads;

import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzadm extends zzaiq {
    private final int zza;
    private final zzix zzb;

    public zzadm(boolean z, zzix zzixVar, byte[] bArr) {
        this.zzb = zzixVar;
        this.zza = zzixVar.zza();
    }

    private final int zzs(int i, boolean z) {
        if (z) {
            return this.zzb.zzb(i);
        }
        if (i >= this.zza - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzb.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzb(int i, int i2, boolean z) {
        int zzm = zzm(i);
        int zzq = zzq(zzm);
        int zzb = zzo(zzm).zzb(i - zzq, i2 == 2 ? 0 : i2, z);
        if (zzb != -1) {
            return zzq + zzb;
        }
        int zzs = zzs(zzm, z);
        while (zzs != -1 && zzo(zzs).zzt()) {
            zzs = zzs(zzs, z);
        }
        if (zzs != -1) {
            return zzq(zzs) + zzo(zzs).zze(z);
        }
        if (i2 == 2) {
            return zze(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzc(int i, int i2, boolean z) {
        int zzm = zzm(i);
        int zzq = zzq(zzm);
        int zzc = zzo(zzm).zzc(i - zzq, 0, false);
        if (zzc != -1) {
            return zzq + zzc;
        }
        int zzx = zzx(zzm, false);
        while (zzx != -1 && zzo(zzx).zzt()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzq(zzx) + zzo(zzx).zzd(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzd(boolean z) {
        int i = this.zza;
        if (i == 0) {
            return -1;
        }
        int zzd = z ? this.zzb.zzd() : i - 1;
        while (zzo(zzd).zzt()) {
            zzd = zzx(zzd, z);
            if (zzd == -1) {
                return -1;
            }
        }
        return zzq(zzd) + zzo(zzd).zzd(z);
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
        return zzq(zze) + zzo(zze).zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final zzaip zzf(int i, zzaip zzaipVar, long j) {
        int zzm = zzm(i);
        int zzq = zzq(zzm);
        int zzp = zzp(zzm);
        zzo(zzm).zzf(i - zzq, zzaipVar, j);
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
    public final zzain zzh(int i, zzain zzainVar, boolean z) {
        int zzl = zzl(i);
        int zzq = zzq(zzl);
        zzo(zzl).zzh(i - zzp(zzl), zzainVar, z);
        zzainVar.zzc += zzq;
        if (z) {
            Object zzr = zzr(zzl);
            Object obj = zzainVar.zzb;
            if (obj != null) {
                zzainVar.zzb = Pair.create(zzr, obj);
            } else {
                throw null;
            }
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
    public final Object zzj(int i) {
        int zzl = zzl(i);
        return Pair.create(zzr(zzl), zzo(zzl).zzj(i - zzp(zzl)));
    }

    protected abstract int zzl(int i);

    protected abstract int zzm(int i);

    protected abstract int zzn(Object obj);

    protected abstract zzaiq zzo(int i);

    protected abstract int zzp(int i);

    protected abstract int zzq(int i);

    protected abstract Object zzr(int i);

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
