package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzgd extends zzjx<zzgd, zzgc> implements zzld {
    private static final zzgd zza;
    private zzkd zze = zzjx.zzby();
    private zzkd zzf = zzjx.zzby();
    private zzke<zzfm> zzg = zzjx.zzbA();
    private zzke<zzgf> zzh = zzjx.zzbA();

    static {
        zzgd zzgdVar = new zzgd();
        zza = zzgdVar;
        zzjx.zzbG(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgc zzf() {
        return zza.zzbu();
    }

    public static zzgd zzh() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzgd zzgdVar, Iterable iterable) {
        zzkd zzkdVar = zzgdVar.zze;
        if (!zzkdVar.zzc()) {
            zzgdVar.zze = zzjx.zzbz(zzkdVar);
        }
        zzih.zzbq(iterable, zzgdVar.zze);
    }

    public static /* synthetic */ void zzq(zzgd zzgdVar, Iterable iterable) {
        zzkd zzkdVar = zzgdVar.zzf;
        if (!zzkdVar.zzc()) {
            zzgdVar.zzf = zzjx.zzbz(zzkdVar);
        }
        zzih.zzbq(iterable, zzgdVar.zzf);
    }

    public static /* synthetic */ void zzs(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzw();
        zzih.zzbq(iterable, zzgdVar.zzg);
    }

    public static /* synthetic */ void zzt(zzgd zzgdVar, int i2) {
        zzgdVar.zzw();
        zzgdVar.zzg.remove(i2);
    }

    public static /* synthetic */ void zzu(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzx();
        zzih.zzbq(iterable, zzgdVar.zzh);
    }

    public static /* synthetic */ void zzv(zzgd zzgdVar, int i2) {
        zzgdVar.zzx();
        zzgdVar.zzh.remove(i2);
    }

    private final void zzw() {
        zzke<zzfm> zzkeVar = this.zzg;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzg = zzjx.zzbB(zzkeVar);
    }

    private final void zzx() {
        zzke<zzgf> zzkeVar = this.zzh;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzh = zzjx.zzbB(zzkeVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfm zze(int i2) {
        return this.zzg.get(i2);
    }

    public final zzgf zzi(int i2) {
        return this.zzh.get(i2);
    }

    public final List<zzfm> zzj() {
        return this.zzg;
    }

    public final List<Long> zzk() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgc(null);
                }
                return new zzgd();
            }
            return zzjx.zzbF(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfm.class, "zzh", zzgf.class});
        }
        return (byte) 1;
    }

    public final List<zzgf> zzm() {
        return this.zzh;
    }

    public final List<Long> zzn() {
        return this.zze;
    }
}
