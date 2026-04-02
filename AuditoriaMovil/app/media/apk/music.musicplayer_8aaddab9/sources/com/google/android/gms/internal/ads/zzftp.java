package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzftp {
    private final zzgau zza;

    private zzftp(zzgau zzgauVar) {
        this.zza = zzgauVar;
    }

    public static zzftp zzc(String str, byte[] bArr, int i2) {
        zzgat zzd = zzgau.zzd();
        zzd.zza(str);
        zzd.zzb(zzgex.zzt(bArr));
        int i3 = i2 - 1;
        zzd.zzc(i3 != 0 ? i3 != 1 ? 5 : 4 : 3);
        return new zzftp(zzd.zzah());
    }

    public final String zza() {
        return this.zza.zza();
    }

    public final byte[] zzb() {
        return this.zza.zzc().zzz();
    }

    public final int zzd() {
        int zzi = this.zza.zzi() - 2;
        int i2 = 1;
        if (zzi != 1) {
            i2 = 2;
            if (zzi != 2) {
                i2 = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i2;
    }
}
