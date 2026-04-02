package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbap extends zzgga<zzbap, zzbao> implements zzghj {
    private static final zzbap zzr;
    private int zzb;
    private int zze;
    private int zzg;
    private zzbbz zzi;
    private zzbah zzk;
    private zzbak zzl;
    private zzbbd zzm;
    private zzazl zzn;
    private zzbbn zzo;
    private zzbcu zzp;
    private zzazu zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzggi zzj = zzaD();

    static {
        zzbap zzbapVar = new zzbap();
        zzr = zzbapVar;
        zzgga.zzay(zzbap.class, zzbapVar);
    }

    private zzbap() {
    }

    public static zzbao zze() {
        return zzr.zzas();
    }

    public static /* synthetic */ void zzg(zzbap zzbapVar, String str) {
        str.getClass();
        zzbapVar.zzb |= 2;
        zzbapVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzbap zzbapVar, Iterable iterable) {
        zzggi zzggiVar = zzbapVar.zzj;
        if (!zzggiVar.zza()) {
            int size = zzggiVar.size();
            zzbapVar.zzj = zzggiVar.zzc(size == 0 ? 10 : size + size);
        }
        zzgeg.zzar(iterable, zzbapVar.zzj);
    }

    public static /* synthetic */ void zzj(zzbap zzbapVar, zzbah zzbahVar) {
        zzbahVar.getClass();
        zzbapVar.zzk = zzbahVar;
        zzbapVar.zzb |= 32;
    }

    public static /* synthetic */ void zzk(zzbap zzbapVar, zzazl zzazlVar) {
        zzazlVar.getClass();
        zzbapVar.zzn = zzazlVar;
        zzbapVar.zzb |= 256;
    }

    public static /* synthetic */ void zzl(zzbap zzbapVar, zzbbn zzbbnVar) {
        zzbbnVar.getClass();
        zzbapVar.zzo = zzbbnVar;
        zzbapVar.zzb |= 512;
    }

    public static /* synthetic */ void zzm(zzbap zzbapVar, zzbcu zzbcuVar) {
        zzbcuVar.getClass();
        zzbapVar.zzp = zzbcuVar;
        zzbapVar.zzb |= 1024;
    }

    public static /* synthetic */ void zzn(zzbap zzbapVar, zzazu zzazuVar) {
        zzazuVar.getClass();
        zzbapVar.zzq = zzazuVar;
        zzbapVar.zzb |= 2048;
    }

    public final String zza() {
        return this.zzf;
    }

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
                        return zzr;
                    }
                    return new zzbao(null);
                }
                return new zzbap();
            }
            return zzaz(zzr, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzbam.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final zzbah zzc() {
        zzbah zzbahVar = this.zzk;
        return zzbahVar == null ? zzbah.zza() : zzbahVar;
    }

    public final zzazl zzd() {
        zzazl zzazlVar = this.zzn;
        return zzazlVar == null ? zzazl.zzc() : zzazlVar;
    }
}
