package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzes extends zzjx<zzes, zzer> implements zzld {
    private static final zzes zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzel zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzes zzesVar = new zzes();
        zza = zzesVar;
        zzjx.zzbG(zzes.class, zzesVar);
    }

    private zzes() {
    }

    public static zzer zzc() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zzf(zzes zzesVar, String str) {
        zzesVar.zze |= 2;
        zzesVar.zzg = str;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzel zzb() {
        zzel zzelVar = this.zzh;
        return zzelVar == null ? zzel.zzb() : zzelVar;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzk;
    }

    public final boolean zzj() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 32) != 0;
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
                    return new zzer(null);
                }
                return new zzes();
            }
            return zzjx.zzbF(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
