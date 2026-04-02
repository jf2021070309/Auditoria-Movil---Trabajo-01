package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgkd extends zzgga<zzgkd, zzgkc> implements zzghj {
    private static final zzgkd zzo;
    private int zzb;
    private int zze;
    private zzgjq zzg;
    private zzgju zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzggf zzj = zzaB();
    private String zzk = "";
    private zzggj<String> zzm = zzgga.zzaE();

    static {
        zzgkd zzgkdVar = new zzgkd();
        zzo = zzgkdVar;
        zzgga.zzay(zzgkd.class, zzgkdVar);
    }

    private zzgkd() {
    }

    public static zzgkc zzd() {
        return zzo.zzas();
    }

    public static /* synthetic */ void zzf(zzgkd zzgkdVar, int i) {
        zzgkdVar.zzb |= 1;
        zzgkdVar.zze = i;
    }

    public static /* synthetic */ void zzg(zzgkd zzgkdVar, String str) {
        str.getClass();
        zzgkdVar.zzb |= 2;
        zzgkdVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgkd zzgkdVar, zzgjq zzgjqVar) {
        zzgjqVar.getClass();
        zzgkdVar.zzg = zzgjqVar;
        zzgkdVar.zzb |= 4;
    }

    public static /* synthetic */ void zzi(zzgkd zzgkdVar, String str) {
        str.getClass();
        zzggj<String> zzggjVar = zzgkdVar.zzm;
        if (!zzggjVar.zza()) {
            zzgkdVar.zzm = zzgga.zzaF(zzggjVar);
        }
        zzgkdVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgkd zzgkdVar, int i) {
        zzgkdVar.zzl = i - 1;
        zzgkdVar.zzb |= 64;
    }

    public final String zza() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzo;
                        }
                        this.zzn = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzgkc(null);
                }
                return new zzgkd();
            }
            return zzaz(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgka.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }
}
