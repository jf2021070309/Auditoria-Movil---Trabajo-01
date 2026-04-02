package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzazl extends zzgga<zzazl, zzazk> implements zzghj {
    private static final zzazl zzp;
    private int zzb;
    private int zze;
    private zzbab zzg;
    private zzbad zzh;
    private zzbaf zzj;
    private zzbbp zzk;
    private zzbbf zzl;
    private zzbat zzm;
    private zzbav zzn;
    private int zzf = 1000;
    private zzggj<zzazz> zzi = zzaE();
    private zzggj<zzbcb> zzo = zzaE();

    static {
        zzazl zzazlVar = new zzazl();
        zzp = zzazlVar;
        zzgga.zzay(zzazl.class, zzazlVar);
    }

    private zzazl() {
    }

    public static zzazl zzc() {
        return zzp;
    }

    public static /* synthetic */ void zze(zzazl zzazlVar, zzazj zzazjVar) {
        zzazlVar.zze = zzazjVar.zza();
        zzazlVar.zzb |= 1;
    }

    public static /* synthetic */ void zzf(zzazl zzazlVar, zzbad zzbadVar) {
        zzbadVar.getClass();
        zzazlVar.zzh = zzbadVar;
        zzazlVar.zzb |= 8;
    }

    public final zzbad zza() {
        zzbad zzbadVar = this.zzh;
        return zzbadVar == null ? zzbad.zza() : zzbadVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzp;
                    }
                    return new zzazk(null);
                }
                return new zzazl();
            }
            return zzaz(zzp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzb", "zze", zzazj.zzc(), "zzf", zzbam.zza, "zzg", "zzh", "zzi", zzazz.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbcb.class});
        }
        return (byte) 1;
    }
}
