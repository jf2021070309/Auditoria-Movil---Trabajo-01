package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
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
    private zzggf zzj = zzgga.zzaB();
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

    public static /* synthetic */ void zzf(zzgkd zzgkdVar, int i2) {
        zzgkdVar.zzb |= 1;
        zzgkdVar.zze = i2;
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

    public static /* synthetic */ void zzj(zzgkd zzgkdVar, int i2) {
        zzgkdVar.zzl = i2 - 1;
        zzgkdVar.zzb |= 64;
    }

    public final String zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzn = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzo;
                    }
                    return new zzgkc(null);
                }
                return new zzgkd();
            }
            return zzgga.zzaz(zzo, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgka.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final int zzc() {
        return this.zzm.size();
    }
}
