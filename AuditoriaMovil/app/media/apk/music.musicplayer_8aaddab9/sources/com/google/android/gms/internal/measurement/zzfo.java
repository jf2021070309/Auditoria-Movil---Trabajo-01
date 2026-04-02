package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzfo extends zzjx<zzfo, zzfn> implements zzld {
    private static final zzfo zza;
    private int zze;
    private zzke<zzfs> zzf = zzjx.zzbA();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzjx.zzbG(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfn zze() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zzj(zzfo zzfoVar, int i2, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.zzv();
        zzfoVar.zzf.set(i2, zzfsVar);
    }

    public static /* synthetic */ void zzk(zzfo zzfoVar, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.zzv();
        zzfoVar.zzf.add(zzfsVar);
    }

    public static /* synthetic */ void zzm(zzfo zzfoVar, Iterable iterable) {
        zzfoVar.zzv();
        zzih.zzbq(iterable, zzfoVar.zzf);
    }

    public static /* synthetic */ void zzo(zzfo zzfoVar, int i2) {
        zzfoVar.zzv();
        zzfoVar.zzf.remove(i2);
    }

    public static /* synthetic */ void zzp(zzfo zzfoVar, String str) {
        str.getClass();
        zzfoVar.zze |= 1;
        zzfoVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzfo zzfoVar, long j2) {
        zzfoVar.zze |= 2;
        zzfoVar.zzh = j2;
    }

    public static /* synthetic */ void zzr(zzfo zzfoVar, long j2) {
        zzfoVar.zze |= 4;
        zzfoVar.zzi = j2;
    }

    private final void zzv() {
        zzke<zzfs> zzkeVar = this.zzf;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzf = zzjx.zzbB(zzkeVar);
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfs zzg(int i2) {
        return this.zzf.get(i2);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List<zzfs> zzi() {
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
                    return new zzfn(null);
                }
                return new zzfo();
            }
            return zzjx.zzbF(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfs.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
