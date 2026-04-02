package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbbn extends zzgga<zzbbn, zzbbj> implements zzghj {
    private static final zzbbn zzl;
    private int zzb;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private zzggj<zzbbi> zze = zzaE();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbbn zzbbnVar, Iterable iterable) {
        zzggj<zzbbi> zzggjVar = zzbbnVar.zze;
        if (!zzggjVar.zza()) {
            zzbbnVar.zze = zzgga.zzaF(zzggjVar);
        }
        zzgeg.zzar(iterable, zzbbnVar.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzbbn zzbbnVar, int i) {
        zzbbnVar.zzb |= 1;
        zzbbnVar.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzbbn zzbbnVar, int i) {
        zzbbnVar.zzb |= 2;
        zzbbnVar.zzg = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzbbn zzbbnVar, long j) {
        zzbbnVar.zzb |= 4;
        zzbbnVar.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzbbn zzbbnVar, String str) {
        str.getClass();
        zzbbnVar.zzb |= 8;
        zzbbnVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzbbn zzbbnVar, String str) {
        str.getClass();
        zzbbnVar.zzb |= 16;
        zzbbnVar.zzj = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzbbn zzbbnVar, long j) {
        zzbbnVar.zzb |= 32;
        zzbbnVar.zzk = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzl;
                    }
                    return new zzbbj(null);
                }
                return new zzbbn();
            }
            return zzaz(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzb", "zze", zzbbi.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }
}
