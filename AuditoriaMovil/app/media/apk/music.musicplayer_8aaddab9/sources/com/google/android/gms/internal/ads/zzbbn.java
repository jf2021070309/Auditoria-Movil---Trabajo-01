package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzbbn extends zzgga<zzbbn, zzbbj> implements zzghj {
    private static final zzbbn zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private zzggj<zzbbi> zze = zzgga.zzaE();
    private String zzi = "";
    private String zzj = "";

    static {
        zzbbn zzbbnVar = new zzbbn();
        zzl = zzbbnVar;
        zzgga.zzay(zzbbn.class, zzbbnVar);
    }

    private zzbbn() {
    }

    public static zzbbj zza() {
        return zzl.zzas();
    }

    public static /* synthetic */ void zzd(zzbbn zzbbnVar, Iterable iterable) {
        zzggj<zzbbi> zzggjVar = zzbbnVar.zze;
        if (!zzggjVar.zza()) {
            zzbbnVar.zze = zzgga.zzaF(zzggjVar);
        }
        zzgeg.zzar(iterable, zzbbnVar.zze);
    }

    public static /* synthetic */ void zze(zzbbn zzbbnVar, int i2) {
        zzbbnVar.zzb |= 1;
        zzbbnVar.zzf = i2;
    }

    public static /* synthetic */ void zzf(zzbbn zzbbnVar, int i2) {
        zzbbnVar.zzb |= 2;
        zzbbnVar.zzg = i2;
    }

    public static /* synthetic */ void zzg(zzbbn zzbbnVar, long j2) {
        zzbbnVar.zzb |= 4;
        zzbbnVar.zzh = j2;
    }

    public static /* synthetic */ void zzh(zzbbn zzbbnVar, String str) {
        str.getClass();
        zzbbnVar.zzb |= 8;
        zzbbnVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzbbn zzbbnVar, String str) {
        str.getClass();
        zzbbnVar.zzb |= 16;
        zzbbnVar.zzj = str;
    }

    public static /* synthetic */ void zzj(zzbbn zzbbnVar, long j2) {
        zzbbnVar.zzb |= 32;
        zzbbnVar.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzl;
                    }
                    return new zzbbj(null);
                }
                return new zzbbn();
            }
            return zzgga.zzaz(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", zzbbi.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
