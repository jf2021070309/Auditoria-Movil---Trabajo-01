package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzkk {
    private final zzvt zza;

    private zzkk(zzvt zzvtVar) {
        this.zza = zzvtVar;
    }

    public static zzkk zzd(String str, byte[] bArr, int i) {
        int i2;
        zzvs zza = zzvt.zza();
        zza.zza(str);
        zza.zzb(zzaby.zzn(bArr));
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                i2 = 5;
            } else {
                i2 = 4;
            }
        } else {
            i2 = 3;
        }
        zza.zzc(i2);
        return new zzkk((zzvt) zza.zzan());
    }

    public final String zza() {
        return this.zza.zzf();
    }

    public final byte[] zzb() {
        return this.zza.zze().zzt();
    }

    public final int zzc() {
        int zzi = this.zza.zzi() - 2;
        int i = 1;
        if (zzi != 1) {
            i = 2;
            if (zzi != 2) {
                i = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
